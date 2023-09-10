package com.geekster.Api_and_Mail_Integration;

public class Students {
    private String name;
    public Students(String name) {
        this.name = name;
        System.out.println("Inside "+ this.name + " Students Constructor...Object must have been created!!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
