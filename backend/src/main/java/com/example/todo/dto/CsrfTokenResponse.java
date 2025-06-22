package com.example.todo.dto;

import lombok.Getter;

@Getter
public class CsrfTokenResponse {

    private final String csrfTokenHeaderName;
    private final String csrfTokenValue;

    public CsrfTokenResponse(String csrfTokenHeaderName, String csrfTokenValue) {
        this.csrfTokenHeaderName = csrfTokenHeaderName;
        this.csrfTokenValue = csrfTokenValue;
    }
}