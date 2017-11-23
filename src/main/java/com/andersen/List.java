package com.andersen;

import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class List {

    private java.util.List<String> list;
    private String string;

    public List() {
        list = new ArrayList<String>();
    }

    public java.util.List<String> getList() {
        return list;
    }

    public void addString() {
        list.add(string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        addString();
    }
}