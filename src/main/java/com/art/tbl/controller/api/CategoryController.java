package com.art.tbl.controller.api;
/*
@author ArtemFrunze
@class CategoryController
@date 31.08.2021
@time 20:13 
*/

import com.art.tbl.model.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @RequestMapping("/getone")
    public Category getone()
    {
        return new Category("1", "category", LocalDateTime.now(), LocalDateTime.now());
    }
}
