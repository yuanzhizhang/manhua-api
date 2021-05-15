package com.example.demo.controller;

import com.example.demo.domain.AppUser;
import com.example.demo.response.LoginResponse;
import com.example.demo.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImp userServiceImp;

    @RequestMapping("/login")
    public LoginResponse login(@RequestParam String username,@RequestParam String password){
        AppUser user = new AppUser(username,password);

        LoginResponse loginResponse = new LoginResponse();
        if(userServiceImp.login(user)){
            loginResponse.setMsg("ok");
            loginResponse.setCode(200);
            loginResponse.setRes("true");
        }else {
            loginResponse.setMsg("密码错误");
            loginResponse.setCode(410);
            loginResponse.setRes("false");
        }
        return loginResponse;
    }

    @RequestMapping("/addUser")
    public Integer addUser(@RequestParam String username ,@RequestParam String password){
        AppUser user = new AppUser(username,password);
        try{
            return userServiceImp.addUser(user);
        }catch (DuplicateKeyException e){
            return 0;
        }

    }


}
