package com.company;

/*
    Каждый sout (####################### n #######################)
    отвечает за отделение каждого задания, где n это число задания.
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("Start program.");
        System.out.println("####################### 1 #######################");
        Cat cat1 = new Cat("Барсик",3000, 2);
        Cat cat2 = new Cat("Фырсик",3000, 2);
        Cat cat3 = new Cat("Мурзик", 3000, 3);
        Cat cat4 = new Cat("Персик",  3000, 8);
        Cat cat5 = new Cat(5000);
        Cat cat6 = new Cat(3000);
        Cat cat7 = new Cat(4000);

        cat1.feedTheCat(200);
        cat2.getWeight();
        cat2.feedTheCat(150);
        cat1.getWeight();
        cat1.feedTheCat(300);
        cat1.getWeight();
        cat1.getCountOfFood();
        cat2.getCountOfFood();

        System.out.println("####################### 2 #######################");

        cat3.getWeight();
        cat3.feedTheCat(150);
        cat3.pee();
        cat3.pee();
        cat3.getWeight();
        cat3.getCountOfFood();

        System.out.println("####################### 3 #######################");

        Cat.getCount();
        cat4.getQuantityEyes();

        System.out.println("####################### 4 #######################");

        cat1.getColor();
        cat2.getColor();
        cat3.getColor();
        cat4.getColor();
        cat5.getColor();
        cat6.getColor();
        cat7.getColor();

        System.out.println("####################### 5 #######################");

        Cat cat8 = Cat.getKitten();
        cat8.getWeight();

        System.out.println("####################### 6 #######################");

        cat8.getColor();
        cat8.setColor(Colors.GREY);
        cat8.getColor();

        System.out.println("####################### 7 #######################");

        System.out.println("\nКот который скопирован:");
        Cat newCat = cat1.deepCopy();
        newCat.getWeight();
        newCat.pee();
        newCat.getWeight();
        System.out.println("\nКот с которого брали копию");
        cat1.getWeight();

        Cat.getCount();

        System.out.println("\n### TESTING DIE ###");

        int i = 0;
        while (i != 10) {
            cat1.meow();
            i += 1;
        }
        cat1.meow();
        Cat.getCount();

        while (cat2.isAlive()) {
            cat2.feedTheCat(300);
        }
        cat2.getWeight();
        Cat.getCount();
    }
}
