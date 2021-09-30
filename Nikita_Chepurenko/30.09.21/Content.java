package com.company;

public class Content{
    public String description;

    public Content (String description) {
        this.description = description;
    }

    public void show() {
        System.out.println("Описание книги: " + this.description);
    }
}
