package com.example.demo.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String msg;
    private Integer code;
    private String res;

    public LoginResponse(String msg, Integer code, String res) {
        this.msg = msg;
        this.code = code;
        this.res = res;
    }

    public LoginResponse() {
    }
}
