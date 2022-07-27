import NavBar from "../components/NavBar"
import './routers.css'
import Notice from "../components/Notice/Notice"
import Message from "../components/Notice/Message"
import React, { useState } from 'react'


function NoticePage() {
  const [mode,setMode] = useState('notice')
  let Articlebox = null
  if (mode === 'notice') {
    Articlebox = <Notice></Notice> 
  } else {
    Articlebox = <Message></Message>
  }

  function clickTab(e){
    if (e.target.innerText === '공지사항') {
      setMode('notice')
      e.target.className = 'noticeSpan'
      document.getElementById('messageSpan').className = 'noticeSpan2'
    } else {
      setMode('message')
      e.target.className = 'noticeSpan'
      document.getElementById('noticeSpan').className = 'noticeSpan2'
    }
  }

  return (
    <div>
      <NavBar></NavBar>
      <div className="mx-5 my-5">
        <button className="noticeSpan" onClick={e=>clickTab(e)} id="noticeSpan">공지사항</button><button className="noticeSpan2" onClick={e=>clickTab(e)} id="messageSpan">알림함</button>
        <hr style={{ margin:0 }} />
        { Articlebox }
      </div> 
    </div>
  )
}

export default NoticePage;