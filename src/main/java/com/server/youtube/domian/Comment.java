package com.server.youtube.domian;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Comment {

    @Id
    @Column(name="comment_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentCode;

    @Column(name="comment_text")
    private String commentText;

    @Column(name="comment_date")
    private LocalDateTime commentDate = LocalDateTime.now();

    @Column
    private String id;

    @Column(name="video_code")
    private int videoCode;

    @Column(name="parent_code")
    private int parentCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="parent_code",referencedColumnName = "comment_code",insertable = false,updatable = false)
    private Comment parent;
}
