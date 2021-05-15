package com.example.demo.service.imp;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.AppUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;

    public boolean login (AppUser user){
        AppUser userSelected = userDao.selectOne(user.getUsername());
        if(userSelected != null && user.getPassword().equals(userSelected.getPassword())){
            return true;
        }

        return false;
    }

    @Override
    public int addUser(AppUser user) {

        return userDao.addUser(user);
    }

}
