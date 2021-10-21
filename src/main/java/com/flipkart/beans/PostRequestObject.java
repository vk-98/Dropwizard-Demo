package com.flipkart.beans;

public class PostRequestObject {
    public PostRequestObject(String name) {
        this.name = name;
    }

    public PostRequestObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

}
