  
package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(100);
        Cat cat2 = new Cat(100);
        Cat cat3 = new Cat(100);
        Cat cat4 = new Cat(100);
        Cat cat5 = new Cat(100);
      //-----------
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
      //-----------
        cat1.feed(1);
        cat2.feed(1);
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        cat3.feed(60000);
        cat4.meow();
      //-----------
        cat5.feed(150);
        cat5.pee();
        cat5.pee();
        System.out.println(cat5.getWeight());
        System.out.println(cat5.amountEatenFood());
      //-----------
        System.out.println(Cat.getCount());
        cat1.feed(70000);
        System.out.println(Cat.getCount());
      //-----------
        System.out.println(Cat.getKitten().getColor());
      //-----------
        System.out.println(Cat.getKitten().getWeight());
      //-----------
        System.out.println(cat1.isAlive());
        System.out.println(cat1.hasTail());
      //-----------
        System.out.println(cat1.deepCopy().isAlive());
    }
}

class Cat {
    private float weight = 0;
    private boolean alive = true;
    private boolean tail = true;
    private float countEatenAllTime = 0;
    private Color color = Color.GREEN;
    public static final float MIN_WEIGHT = 0;
    public static final float MAX_WEIGHT = 10000;
    static public int getCount() { 
      return Cat.count; 
    }
    static int count = 0;
     public Cat(float weight, boolean alive, boolean tail, float countEatenAllTime, Color color) {
        this.weight = weight;
        this.alive = alive;
        this.tail = tail;
        this.countEatenAllTime = countEatenAllTime;
        this.color = color;
        Cat.count++;
    }
    public void pee() {
        if (!alive) { 
          return;
        }
        if (this.weight - 1 < Cat.MIN_WEIGHT) {
          System.out.println("Коту еще не нужно в туалет."); return; 
        }
        this.weight--;
        System.out.println("Кот сходил в туалет.");
    }
    public static Cat getKitten() {
        return new Cat(1100);
    }
    public Cat() { 
      Cat.count++; 
    }
    public Cat(float weight) {
        this.weight = weight;
        Cat.count++;
    }
   
    public Cat deepCopy() {
        return new Cat(this.weight, 
                       this.alive, 
                       this.tail, 
                       this.countEatenAllTime, 
                       this.color);
    }
    public float getWeight() {
        return weight;
    }
    public Color getColor() {
        return this.color;
    }
    public void feed(int foodWeight) {
        if (!alive) { return; }
        if (this.weight + foodWeight > Cat.MAX_WEIGHT) { this.kill("Объелся"); return; }

        this.countEatenAllTime += foodWeight;
        this.weight += foodWeight;
    }
    public void meow() { 
      this.kill("Вы перемяукали кошку."); 
    }
    public void kill(String reason) {
        this.setAlive(false);
        System.out.printf("Кот %s умер. %n", reason);
    }
    public void setColor(Color value) { 
      this.color = value; 
    }
    public boolean isAlive() {
        return this.alive;
    }
    public boolean hasTail() {
        return this.tail;
    }
    public float amountEatenFood() {
        return this.countEatenAllTime;
    }
    public void explode() {
      this.kill("Подрыв"); 
    }
    public void setAlive(boolean value) {
        if (!value) {
          Cat.count--; 
        }
        this.alive = value;
    }
    
}
enum Color { RED, GREEN, BLUE }
