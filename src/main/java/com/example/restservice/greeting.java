package com.example.restservice;

public class greeting {

    private final String content;
    private final long id;


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }


}
