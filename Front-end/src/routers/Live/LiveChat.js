import React, { useState, useEffect } from "react";
import { useSelector } from 'react-redux'
import OfferBuyerModal from "../../components/Modals/OfferBuyerModal";
import OfferSellerModal from "../../components/Modals/OfferSellerModal";

const LiveChat = (props) => {
  console.log(props)
  const [messageList, setMessageList] = useState([]);
  const [message, setMessage] = useState("");
  const [come, setCome] = useState(null);
  let store = useSelector((state) => { return state })

  const handleChange = (event) => {
    setMessage(event.target.value);
  };

  useEffect(() => {
    props.props.session.on("signal:chat", (event) => {
      const data = JSON.parse(event.data);
      if (come === null) {
        let messageListData = messageList;
        messageListData.push({
          connectionId: event.from.connectionId,
          nickname: data.nickname,
          message: data.message,
        });
        setMessageList([...messageListData]);
      }
    });
    setCome(1)
    if (props.props && come === 1) {
      const welcome = {
        message: `${props.props.myUserName}님이 입장하셨습니다.`,
        nickname: props.props.myUserName,
        streamId: props.props.streamId,
      };
      console.log(welcome)
      props.props.session.signal({
        data: JSON.stringify(welcome),
        type: "chat",
      });
      setCome(null)
    }
  }, [props]);



  const handlePressKey = (event) => {
    if (event.key === "Enter") {
      sendMessage();
    }
  };

  const sendMessage = () => {
    console.log("chat" + message);
    if (props.props.myUserName && message) {
      let messageData = message.replace(/ +(?= )/g, "");
      if (messageData !== "" && messageData !== " ") {
        const data = {
          message: messageData,
          nickname: props.props.myUserName,
          streamId: props.props.streamId,
        };
        console.log(data)
        props.props.session.signal({
          data: JSON.stringify(data),
          type: "chat",
        });
      }
    }
    setMessage("");
  };

  const OfferBuyer = () => {
    const [buyofferModalOpen, setBuyOfferModalOpen] = useState(false);

    const openBuyOfferModal = () => {
      setBuyOfferModalOpen(true);
    };
    const closeBuyOfferModal = () => {
      setBuyOfferModalOpen(false);
    };


    return (
      <>
      <button onClick={openBuyOfferModal}>
              <p>가격제안</p>
            </button>
            <OfferBuyerModal open={buyofferModalOpen} close={closeBuyOfferModal} header={'가격 제안 목록'} productid={props.props.productID} />
            </>
    )

  }

  const OfferSeller = () => {
    const [sellofferModalOpen, setSellOfferModalOpen] = useState(false);

    const openSellOfferModal = () => {
      setSellOfferModalOpen(true);
    };
    const closeSellOfferModal = () => {
      setSellOfferModalOpen(false);
    };


    return (
      <>
      <button onClick={openSellOfferModal}>
              <p>제안목록</p>
            </button>
            <OfferSellerModal open={sellofferModalOpen} close={closeSellOfferModal} header={'가격 제안 목록'} />
            </>
    )

  }



  return (
    <>
      <div style={{
        position: 'relative',
        display: 'flex', justifyContent: 'space-between'
      }}>
        <div><h3 style={{ marginInline: '1rem' }}>채팅방</h3></div>
        <div>{store.info.info.userId === props.props.sellerInfo.userid ? <OfferSeller /> : <OfferBuyer />}</div>
      </div>
      <div className='chatbox'>
        <div className=''>
          {messageList.map((data, i) => (
            <div
              key={i}
              id="remoteUsers"
              className=''
            >
              {store.info.info.nickName === data.nickname ?
                <div className='liveChatItem2'>
                  <div className='livechatcontent'>
                    <p className='chatnickname d-flex flex-row-reverse '>{data.nickname}</p>
                    <p className='livechatbox'>{data.message}</p>
                  </div>
                </div>
                :
                <div className='liveChatItem'>
                  <div className='livechatcontent'>
                    <p className='chatnickname'>{data.nickname}</p>
                    <p className='livechatbox2'>{data.message}</p>
                  </div>
                </div>
              }

            </div>
          ))}
        </div>

      </div>
      <div className="livechatInput">
        <input
          className="inputform3"
          placeholder="메세지를 입력하세요"
          id="chatInput"
          value={message}
          onChange={handleChange}
          onKeyPress={handlePressKey}
          autoComplete="off"
        />
        <button className="inputsubmitbutton" onClick={sendMessage} >전송</button>
      </div>
    </>
  );

};

export default LiveChat;