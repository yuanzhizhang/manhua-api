package com.example.demo.service.imp;

import com.example.demo.dao.CartoonBookDao;
import com.example.demo.domain.CartoonBook;
import com.example.demo.service.CartoonBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartoonBookServiceImp implements CartoonBookService {
    @Autowired
    CartoonBookDao cartoonBookDao;


    @Override
    public List<CartoonBook> getAllCartoonBooks(String cartoonType) {
        return cartoonBookDao.getAllCartoonBooks(cartoonType);
    }

    @Override
    public CartoonBook getOneCartoonBook(int cId) {
        return cartoonBookDao.getOneCartoonBook(cId);
    }
}
