package com.company;

/*
Задание 2
    Требуется: Создать класс Book(Main). Создать классы Title, Author и Content,
    каждый из которых должен содержать одно строковое поле и метод void show ().
    Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
    Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
*/

public class Book{
    private String bookTitle;
    private String bookContent;
    private String bookAuthor;

    public Book(String title, String content,
                String author) {
        this.bookTitle = title;
        this.bookContent = content;
        this.bookAuthor = author;
    }

    public void show() {
        Title title = new Title(this.bookTitle);
        Content content = new Content(this.bookContent);
        Author author = new Author(this.bookAuthor);
        title.show();
        content.show();
        author.show();
    }
}
