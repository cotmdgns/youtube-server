package com.server.youtube.repo;

import com.server.youtube.domian.video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface videoDAO extends JpaRepository<video,Integer> {
}
