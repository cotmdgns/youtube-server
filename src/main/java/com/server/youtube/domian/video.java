package com.server.youtube.domian;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
// 컨트롤 알트 L (자동정렬)
public class video {
    @Id
    @Column(name="video_code")
    private int videoCode;

    @Column(name="video_url")
    private String videoUrl;

    @Column(name="video_img")
    private String videoImg;

    @Column(name="video_title")
    private String videoTitle;

    @Column(name="video_count")
    private int videoCount;

    @Column(name="video_date")
    private LocalDateTime videoDate;

    @Column(name="video_desc")
    private String videoDesc;

    @Column(name="channel_code")
    private int channelCode;
}
