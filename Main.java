package hi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону прямоугольника: ");
        double a = scanner.nextDouble();
        System.out.print("Введите вторую сторону прямоугольника: ");
        double b = scanner.nextDouble();
        System.out.println("\nПлощадь: " + Rectangle.areaCalculator(a,b));
        System.out.println("Периметр: " + Rectangle.perimeterCalculator(a,b));

    }
}
