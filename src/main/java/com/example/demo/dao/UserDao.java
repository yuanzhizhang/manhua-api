package com.example.demo.dao;

import com.example.demo.domain.AppUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public AppUser selectOne(String username);

    public int addUser(AppUser user);

}
