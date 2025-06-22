package com.example.todo.dto;

import lombok.Getter;

@Getter
public class TodoPostRequest {

    private String text;

    public TodoPostRequest(){}

    public TodoPostRequest(String text) {
        this.text = text;
    }
}
