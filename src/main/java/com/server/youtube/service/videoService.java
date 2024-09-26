package com.server.youtube.service;

import com.server.youtube.domian.video;
import com.server.youtube.repo.videoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class videoService {

    @Autowired
    private videoDAO dao;

    public List<video> allVideo(){
        return dao.findAll();
    }

}
