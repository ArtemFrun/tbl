package com.art.tbl.model;
/*
@author ArtemFrunze
@class Category
@date 29.08.2021
@time 11:54 
*/

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    private String id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
