package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("################## 1 ##################\n");

        System.out.print("Введите сторону а: ");
        double sideA = input.nextDouble();
        System.out.print("Введите сторону b: ");
        double sideB = input.nextDouble();

        Rectangle rect = new Rectangle(sideA, sideB);

        System.out.println("S = " + rect.areaCalculator());
        System.out.println("P = " +rect.perimeterCalculator());

        System.out.println("\n################## 2 ##################\n");

        System.out.print("Введите автора книги: ");
        String author = input.next();
        System.out.print("Введите название книги: ");
        String title = input.next();
        System.out.print("Введите описание книги: ");
        String content = input.next();
        Book book = new Book(title, content, author);
        book.show();


    }
}
