package com.company;

public class Title{
    public String name;

    public Title (String description) {
        this.name = description;
    }

    public void show() {
        System.out.println("Название книги: " + this.name);
    }

}
