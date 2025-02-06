package com.todolist.todolist;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {
    @RequestMapping("/")
    public String test() {
        return "Hello World";
    }
}
