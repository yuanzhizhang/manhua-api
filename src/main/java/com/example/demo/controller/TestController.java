package com.example.demo.controller;

import com.example.demo.response.LoginResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokes")
public class TestController {
    @RequestMapping("/joke")
    public LoginResponse getJokes(){
        LoginResponse loginResponse = new LoginResponse("ok",200,"true");
        return loginResponse;
    }
}
