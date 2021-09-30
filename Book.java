package hi;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(String title, String author, String content) {
        this.title = new Title(title);
        this.author = new Author(author);
        this.content = new Content(content);
    }

//    public Book(Title title, Author author, Content content) {
//        this.title = title;
//        this.author = author;
//        this.content = content;
//    }


    public void show() {
        System.out.print("Книга с названием: ");
        this.title.show();
        System.out.print("Автор: ");
        this.author.show();
        System.out.print("Содержание: ");
        this.content.show();
    }

    public static void main(String[] args) {
        Book book = new Book("Совершенный код","Стив Макгонал","...");
        book.show();

    }
}

class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println(this.title);
    }
}

class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println(this.author);
    }
}

class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(this.content);
    }
}
