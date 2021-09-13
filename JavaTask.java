//Main.java
package hi;
 
public class Main {
 
    public static void main(String[] args) {
 
        Cat.feed(150.00);
        System.out.println(Cat.count);
        Cat.pee();
        Cat.pee();
        Cat.pee();
        Cat.pee();
        System.out.println(Cat.returnFood());
 
        Cat.meow();
 
        Cat.create();
        Cat.meow();
 
//        System.out.println("Вес первой кошки: " + cat.weight);
//        System.out.println("Вес второй кошки: " + cat2.weight);
    }
}
 
//Cat.java
package hi;
 
public class Cat {
    public static int count = 0;
    public static double weight = 1;
    public static int foodEaten = 0;
    public static int meows = 0;
    public static boolean killed = false;
    public static final int eyes = 2;
    public static final double minWeight = 1000.0;
    public static final double maxWeight = 5000.0;
    public enum Colors {Black, White};
    public static String color;
 
    public static void create(){
        if (killed){
            count-=1;
        } else {
            count++;
        }
    }
    public Cat (double weight)
    {
        this.weight = weight;
 
    }
    private static Cat getKitten(){
        return new Cat(1100.0);
    }
    public static void feed(double foodAmount){
            if (!killed){
                Cat.weight += foodAmount;
                Cat.foodEaten += foodAmount;
                System.out.println("Кошка покормлена.");
                System.out.println("Ее вес изменился (" + (weight-foodAmount) + " -> " +weight + ")\n");
                if (weight>=5) {
                    System.out.println("Вы перекормили кошку и она взорвалась.\n");
                    killed = true;
                }
            } else {
                System.out.println("Я запрещаю мертвой кошке делать что-либо!");
            }
 
    }
    public static int returnFood(){
        return Cat.foodEaten;
    }
    public static void pee(){
        if (!killed){
            weight -= 100.0;
            System.out.println("Кошка сходила в туалет\nЕе вес сейчас: " + weight);
        } else {
            System.out.println("Я запрещаю мертвой кошке делать что-либо!");
        }
    }
    public static void meow(){
        if (!killed){
            System.out.println("Мяу.");
            if (meows >= 5){
                System.out.println("Вы перемяукали кошку.");
            }
        } else {
            System.out.println("Я запрещаю мертвой кошке делать что-либо!");
        }
    }
}
