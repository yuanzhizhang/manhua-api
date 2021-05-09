package com.example.demo.service.imp;

import com.example.demo.dao.ChapterDao;
import com.example.demo.response.ChapterResponse;
import com.example.demo.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImp implements ChapterService {
    @Autowired
    ChapterDao chapterDao;

    @Override
    public ChapterResponse getChapters(Integer cId) {
        ChapterResponse chapterResponse = new ChapterResponse();
        chapterResponse.setMsg("ok");
        chapterResponse.setCode(200);
        chapterResponse.setCartoonChapters(chapterDao.getChapters(cId));

        return chapterResponse;
    }
}
