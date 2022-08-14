import * as React from 'react';
import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TablePagination from '@mui/material/TablePagination';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import axios from 'axios';
import { IconButton } from '@mui/material';
import ChatIcon from '@mui/icons-material/Chat';
import { useSelector } from 'react-redux'
import { useNavigate } from 'react-router-dom';

export default function RequestedPrice(props) {
  let store = useSelector((state) => { return state })
  let navigate = useNavigate()
  const { productid, changedata } = props;
  console.log(changedata)
  const [page, setPage] = React.useState(0);
  const rowsPerPage = 5;
  const [rows, setRows] = React.useState([]);
  const [youNick, setYouNick] = React.useState('')


  React.useEffect(() => {
    async function offerData() {
      const result = await axios.get(
        `/api/offers/pricelist/` + productid,
        {
          headers: {
            Authorization: `Bearer ${localStorage.token}`
          }
        }
      );
      console.log(result)
      setRows(result.data.sort(function(a, b){
        return b.price - a.price
      }))
    }
    offerData()
    console.log(rows)

  }, []);

  const handleChangePage = (event, newPage) => {
    setPage(newPage);
  };

  const createRoom = (row) => {
    if (window.confirm("구매자와 연락하시겠습니까?")) {
      setYouNick(row.user.nickname)
      axios({
        url: '/api/room',
        method: 'post',
        params: { seller: row.user.userid },
        headers: { Authorization: `Bearer ${localStorage.token}` }
      })
        .then(res => {
          console.log(res.data, '방생성')
          navigate('/chatroom/' + res.data, { state: { roomId: res.data, me: store.info.info.nickName, you: youNick, meId: store.info.info.userId } })
        })
        .catch(err => {
          console.log(err)
        })
    }
  }


  return (
    <Box sx={{ width: '80%' }}>
      <Paper sx={{ width: '100%', mb: 2 }}>
        <TableContainer>
          <Table
          >
            <TableBody >
              {rows
                .slice(page * rowsPerPage, page * rowsPerPage + rowsPerPage)
                .map((row, index) => {

                  return (
                    <TableRow sx={{ height: 10 }}
                    >
                      <TableCell
                        component="th"
                        scope="row"
                      >
                        {row.user.nickname}
                      </TableCell>
                      <TableCell align="right">{row.price}</TableCell>
                      {changedata === 'seller' ? <TableCell align="right">
                      <IconButton aria-label="add to favorites" onClick={() => createRoom(row)}>
                        <ChatIcon />
                      </IconButton>
                      </TableCell> : null }
                    </TableRow>
                  );
                })}
              
            </TableBody>
          </Table>
        </TableContainer>
        <TablePagination
          rowsPerPageOptions={[5]}
          component="div"
          count={rows.length}
          rowsPerPage={rowsPerPage}
          page={page}
          onPageChange={handleChangePage}
        />
      </Paper>
    </Box>
  );
}
