package com.company;

/*
    Задание 1
 Требуется: Создать класс с именем Rectangle. В теле класса создать два поля, описывающие длины сторон double side1, double side2.
  Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
  и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
  которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.

 */

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator () {
        return this.side1 * this.side2;
    }

    public double perimeterCalculator () {
        return 2 * (this.side1 + this.side2);
    }
}
