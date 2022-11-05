package com.ssafy.soldsolve.db.repository;

import com.ssafy.soldsolve.db.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NoticeRepository extends JpaRepository<Notice, Integer> {
    Notice findById(int noticeId);
}
