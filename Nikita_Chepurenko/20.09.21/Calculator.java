package com.company;

import java.util.Scanner;

public class Calculator {

    public Scanner input = new Scanner(System.in);
    private float number1;
    private float number2;
    private char operation;

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public float getNumber2() {
        return number2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    public void askUserAboutNumbersAndSet() {
        System.out.println("Введите два числа:");
        System.out.print("> ");
        setNumber1(input.nextFloat());
        System.out.print("> ");
        setNumber2(input.nextFloat());
    }

    public void askUserAboutOperationAndSet() {
        System.out.println("Какую операцию хотите произвести (-, +, /, *):");
        System.out.print("> ");
        setOperation(input.next().charAt(0));
    }

    public void getResultOfCalculates() {

        float result = 0;
        
        switch(getOperation()) {
            case '+':
                result = getNumber1() + getNumber2();
                break;
            case '-':
                result = getNumber1() - getNumber2();
                break;
            case '/':
                result = getNumber1() / getNumber2();
                break;
            case '*':
                result = getNumber1() * getNumber2();
                break;
            default:
                System.out.println("Нет такой операции.");
        }
        System.out.println(
                (result != 0)
                        ? "Результат вычисления: " + result + "\n"
                        : "Ошибка!\n");
    }

    public boolean wantPlayerPlayOrNotResult(char answer) {
        return answer == '+';
    }

    public void loopingCalculator() {
        boolean wantPlayOrNot = true;
        while (wantPlayOrNot) {
            System.out.println("\nКалькулятор!");
            askUserAboutNumbersAndSet();
            askUserAboutOperationAndSet();
            getResultOfCalculates();
            System.out.println("Хотите ли вы еще что-то посчитать?");
            System.out.println("Введите + или -");
            System.out.print("> ");
            wantPlayOrNot = wantPlayerPlayOrNotResult(input.next().charAt(0));
        }
    }
}
