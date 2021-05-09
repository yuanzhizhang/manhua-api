package com.example.demo.domain;

import java.util.List;

public class Joke
{
    private String msg;
    private List<String> jokes;

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public List<String> getJokes()
    {
        return jokes;
    }

    public void setJokes(List<String> jokes)
    {
        this.jokes = jokes;
    }
}
