package hi;

import java.util.Scanner;

public class Book {
    static String title = Title.show();
    static String author = Author.show();
    static String content = Content.show();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название: ");
        Title.title = scanner.next();
        System.out.println();
        System.out.print("Введите автора: ");
        Author.author = scanner.next();
        System.out.println();
        System.out.print("Введите содержание: ");
        Content.content = scanner.next();
        System.out.println();
        System.out.println("Название: "+ Title.show() + "\nАвтор: " + Author.show() + "\nСодержание: " + Content.show());
    }
    static class Title{
        static String title = "";
        public static String show() {
            return(title);
        }
    }
    static class Author{
        static String author = "";
        public static String show() {
            return(author);
        }
    }
    static class Content{
        static String content = "";
        public static String show() {
            return(content);
        }
    }
}
