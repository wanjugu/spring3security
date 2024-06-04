package com.spring.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.repository.NoticeRepository;

@RestController
public class NoticesController {

    @Autowired
    private NoticeRepository noticeRepository;

//    @GetMapping("/notices")
//    public ResponseEntity<List<Notice>> getNotices() {
//        List<Notice> notices = noticeRepository.findAllActiveNotices();
//        if (notices != null ) {
//            return ResponseEntity.ok()
//                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
//                    .body(notices);
//        }else {
//            return null;
//        }
//    }

}
