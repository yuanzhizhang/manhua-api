package com.example.demo.controller;

import com.example.demo.domain.CartoonBook;
import com.example.demo.response.CartoonBooksResponse;
import com.example.demo.response.CartoonResponse;
import com.example.demo.service.imp.CartoonBookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartoonbook")

public class CartoonBookController {
    @Autowired
    CartoonBookServiceImp cartoonBookServiceImp;

    @RequestMapping("/all")
    public CartoonBooksResponse getAllCartoonBook(String cartoonType){
        CartoonBooksResponse cartoonBooksResponse = new CartoonBooksResponse();
        cartoonBooksResponse.setCartoonBooks(cartoonBookServiceImp.getAllCartoonBooks(cartoonType));
        cartoonBooksResponse.setMsg("ok");
        cartoonBooksResponse.setCode(200);
        return cartoonBooksResponse;
    }


    @RequestMapping("/one")
    public CartoonResponse getOneCartoonBook(Integer cId){
        CartoonResponse cartoonResponse = new CartoonResponse("ok",200,cartoonBookServiceImp.getOneCartoonBook(cId));
        return cartoonResponse;
    }
}
