package com.server.youtube.controller;

import com.server.youtube.service.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class videoController {

    @Autowired
    private videoService service;

    @GetMapping("/video")
    public ResponseEntity allVideo(){
        return ResponseEntity.status(HttpStatus.OK).body(service.allVideo());
    }

}
