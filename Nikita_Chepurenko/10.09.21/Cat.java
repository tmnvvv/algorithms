package com.company;

import java.util.Random;

public class Cat {
    private final float BASE_WEIGHT;  // Начальный вес записываем в константу для дальнейших операций
    private final int QUANTITY_OF_EYES; // Кол-во глаз кота, запиываем в константу
    private final float CRITICAL_MAX_WEIGHT = 20; // Критический максимальный вес, запиываем в константу
    private final float CRITICAL_MIN_WEIGHT = 1; // Критический минимальный вес, записываем в константу
    private final int CRITICAL_MEOW_CAT = 10; // Критический "мяв" кошки/кота

    private float weight;
    private float countFood = 0; // Счетчик кол-во съеденной еды
    private final String NAME; // Кличка кошки/кота
    private int countOfMeow = 0; // Счетчик мяуканья кошки/кота

    private boolean alive = true;

    // Выбираем цвет кошки/кота
    private final Colors COLOR = Colors.values()[new Random().nextInt(Colors.values().length)];
    private boolean colorChose = false;
    private Colors color = Colors.BLACK;

    static int count; // Считаем кол-во созданных кошек/котов

    public static Cat getKitten () {
        return new Cat((float) 1100.00);
    }

    public Cat (float weight) {
        Cat.count += 1;
        this.weight = weight/1000;
        this.NAME = "НотФаунд" + Cat.count;
        this.BASE_WEIGHT = 4;
        this.QUANTITY_OF_EYES = 2;
    }

    public Cat (String name, float weight, int quantityOfEyes) {
        Cat.count += 1;
        this.NAME = name + Cat.count;
        this.weight = weight/1000;
        this.BASE_WEIGHT = weight/1000;
        this.QUANTITY_OF_EYES = quantityOfEyes;
    }

    public Cat deepCopy () {
        /*
        Конструктор глубокого копирования.
         */
        return new Cat(this.NAME, this.weight, this.QUANTITY_OF_EYES);
    }

    public static void getCount () {
        /*
        Метод выводит кол-во котов на данный момент.
         */
        System.out.println("Кол-во котов на данный момент состовляет: " + Cat.count);
    }

    public void getWeight () {
        /*
        Метод получения веса кота/кошки.
         */
        if (!isAlive()) { return; }
        System.out.println("Вес " + NAME + "a" + " на данный момент равен: " + weight);
    }

    public void feedTheCat (float food) {
        /*
        Метод кормления кота/кошки.
         */
        if (!isAlive()) { return; }
        if (weight >= CRITICAL_MAX_WEIGHT) {
            setAlive(false);
            System.out.println("Вы перекормили " + NAME + "а" + " он умер.");
            catDie();
            return;
        } else {
            setAlive(true);
        }
        countFood += food;
        weight += food/1000;
        System.out.println("Вы покормили " + NAME + "а" + ", его вес изменился на: " + (weight - BASE_WEIGHT));
    }

    public void getCountOfFood () {
        /*
        Метод, котрый выводит кол-во съеденной еды котом/кошкой.
         */
        System.out.println(NAME + " был накормлен на " + countFood + " гр/кг еды.");
    }

    public void meow () {
        /*
        Метод, который застовляет кота мяукать.
         */
        if (!isAlive()) { return; }
        if (countOfMeow >= CRITICAL_MEOW_CAT) {
            setAlive(false);
            System.out.println("Вы замяукали " + NAME + "а" + " он умер.");
            catDie();
            return;
        } else {
            setAlive(true);
        }
        countOfMeow += 1;
        System.out.println(NAME + " Мяукнул!!!");
    }

    public void pee () {
        /*
        Метод, застовляющий ходить кота в туалет.
         */
        if (!isAlive()) { return; }
        if (weight <= CRITICAL_MIN_WEIGHT) {
            setAlive(false);
            System.out.println(NAME + "а" + " потерял весь вес и умер.");
            catDie();
            return;
        } else {
            setAlive(true);
        }
        weight -= Math.random();
        if (weight < 0) { weight = 0; }
        System.out.println(NAME + " сходил в туалет.");
    }

    public void catDie () {
        /*
        Метод, который вычеркивает одного из котов, который переел или потерял вес.
         */
        Cat.count -= 1;
        System.out.println(NAME + " мертв.");
    }

    public void getQuantityEyes () {
        /*
        Метод, который выводит кол-во глаз у кота/кошки.
         */
        if (!isAlive()) { return; }
        System.out.println("У " + NAME + "а" + " " + QUANTITY_OF_EYES + " глаз.");
    }

    public void setColor (Colors color) {
        /*
        Метод сеттер, который устанавливает цвет кота/кошки.
         */
        if (!isAlive()) { return; }
        this.color = color;
        colorChose = true;
        System.out.println("Цвет " + NAME + "а " + "изменен на: " + this.color);
    }

    public void getColor () {
        /*
        Метод, который выводит цвет кота/кошки.
         */
        if (!isAlive()) { return; }
        System.out.println("Цвет " + NAME + "а" + ": " + (!colorChose ? COLOR : color) );
    }

    public void setAlive(boolean alive) {
        /*
        Метод, который устанавливает наличие жизни у кота/кошки.
         */
        this.alive = alive;
    }

    public boolean isAlive () {
        /*
        Метод, который возвращает жизненый показатель кота/кошки (жив/нет).
         */
        return alive;
    }

}
