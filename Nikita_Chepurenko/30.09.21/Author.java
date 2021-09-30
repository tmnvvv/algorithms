package com.company;

public class Author{
    public String name;

    public Author (String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Имя автора: " + this.name);
    }
}
