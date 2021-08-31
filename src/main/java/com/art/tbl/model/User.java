package com.art.tbl.model;
/*
@author ArtemFrunze
@class User
@date 29.08.2021
@time 11:23 
*/

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class User {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public User(String id, String name, String surname, String email, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}