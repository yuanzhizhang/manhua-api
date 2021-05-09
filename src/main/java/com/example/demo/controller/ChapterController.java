package com.example.demo.controller;

import com.example.demo.response.ChapterResponse;
import com.example.demo.service.ChapterService;
import com.example.demo.service.imp.ChapterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    ChapterServiceImp chapterServiceImp;

    @RequestMapping("/getChapters")
    public ChapterResponse getChapters(@RequestParam Integer cId){
        return chapterServiceImp.getChapters(cId);
    }
}
