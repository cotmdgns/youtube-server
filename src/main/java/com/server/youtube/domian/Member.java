package com.server.youtube.domian;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Builder @Data
public class Member {

    @Id
    private String id;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String phone;
}
