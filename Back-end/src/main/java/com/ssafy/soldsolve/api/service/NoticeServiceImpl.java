package com.ssafy.soldsolve.api.service;

import com.ssafy.soldsolve.api.request.NoticePostReq;
import com.ssafy.soldsolve.db.entity.Notice;
import com.ssafy.soldsolve.db.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    NoticeRepository noticeRepository;

    @Override
    public Notice getNotice(int noticeId) {
        return noticeRepository.findById(noticeId).get();
    }

    @Override
    public Notice createNotice(NoticePostReq registerInfo) {
        Notice notice = new Notice();
        notice.setTitle(registerInfo.getTitle());
        notice.setContent(registerInfo.getContent());
        notice.setIsRead(false);
        return noticeRepository.save(notice);
    }

    @Override
    public void readNotice(NoticePostReq noticePostReq, Notice notice) {
        notice.setIsRead(true);
        noticeRepository.save(notice);
    }

    @Override
    public void updateNotice(NoticePostReq noticePostReq, Notice notice) {
        notice.setTitle(noticePostReq.getTitle());
        notice.setContent(noticePostReq.getContent());
        noticeRepository.save(notice);
    }

    @Override
    public void deleteNotice(int noticeId) {
        noticeRepository.delete(noticeRepository.getOne(noticeId));
    }
}