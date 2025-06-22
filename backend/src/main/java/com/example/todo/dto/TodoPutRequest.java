package com.example.todo.dto;

import lombok.Getter;

@Getter
public class TodoPutRequest {
    private Boolean completed;

    public TodoPutRequest() {
    }

    public TodoPutRequest(Boolean completed) {
        this.completed = completed;
    }
}
