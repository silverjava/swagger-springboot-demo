package com.demo.domain;

public class Duck {
    private final String name;
    private final String color;

    public Duck(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
