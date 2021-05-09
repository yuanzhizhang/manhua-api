package com.example.demo.controller;

import com.example.demo.response.PageResponse;
import com.example.demo.service.imp.PageServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {
    @Autowired
    PageServiceImp pageServiceImp;

    @RequestMapping("/getPages")
    public PageResponse getPages(@RequestParam Integer chapterId){
        return pageServiceImp.getPages(chapterId);
    }
}
