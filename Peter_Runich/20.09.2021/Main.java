package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число.");
        float number1 = scanner.nextFloat();
        System.out.println("Введите знак операции.");
        char symbol = scanner.next().charAt(0);
        System.out.println("Введите второе число.");
        float number2 = scanner.nextFloat();

        Calculator calculator = new Calculator(number1, number2, symbol);
        float result = calculator.calculate();

        System.out.printf("Результат %.2f", result);
    }
}

class Calculator {
    private float number1;
    private float number2;
    private char symbol;

    Calculator(float number1, float number2, char symbol) {
        this.number1 = number1;
        this.number2 = number2;
        this.symbol = symbol;
    }

    public float calculate() {
        return switch (symbol) {
            case '+' -> plus();
            case '-' -> minus();
            case '*' -> multiply();
            case '/' -> divide();
            case '^' -> pow();
            default -> 0;
        };
    }

    public float plus() {
        return number1 + number2;
    }

    public float minus() {
        return number1 - number2;
    }

    public float multiply() {
        return number1 * number2;
    }

    public float divide() {
        return number1 / number2;
    }

    public float pow() {
        return (float) Math.pow(number1, number2);
    }
}
