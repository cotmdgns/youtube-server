package com.server.youtube.controller;

import com.server.youtube.service.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/*")
@CrossOrigin(origins = {"*"},maxAge = 6000)
public class videoController {

    @Autowired
    private videoService service;

    // 비디오 전체 목록 보기
    @GetMapping("/video")
    public ResponseEntity allVideo(){
        return ResponseEntity.status(HttpStatus.OK).body(service.allVideo());
    }

}
