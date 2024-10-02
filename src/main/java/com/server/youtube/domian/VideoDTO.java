package com.server.youtube.domian;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoDTO {

    private MultipartFile videoFile;
    private MultipartFile imageFile;
    private String videoTitle;
    private String videoDesc;
    private int channelCode;
}
