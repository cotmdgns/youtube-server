package com.server.youtube.domian;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@DynamicInsert
// 컨트롤 알트 L (자동정렬)
public class Video {
    @Id
    @Column(name="video_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name="channel_code")
    private Channel channel;
}
