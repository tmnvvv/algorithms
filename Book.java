package hi;

import java.util.Scanner;

public class Book {
    static String title = Title.show();
    static String author = Author.show();
    static String content = Content.show();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название: ");
        title = scanner.next();
        System.out.println();
        System.out.print("Введите автора: ");
        author = scanner.next();
        System.out.println();
        System.out.print("Введите содержание: ");
        content = scanner.next();
        System.out.println();
        System.out.println("Название: "+ title + "\nАвтор: " + author + "\nСодержание: " + content);
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
