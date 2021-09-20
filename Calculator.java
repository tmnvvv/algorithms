package hi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String operator = "";
            System.out.print("1-й операнд: ");
            Double first = scan.nextDouble();
            scan.nextLine();
            System.out.print("Оператор (+,-,/,*, end): ");
            operator = scan.nextLine();
            System.out.print("2-й операнд: ");
            Double second = scan.nextDouble();
            scan.nextLine();
            if (operator.equals("/")){
                System.out.println("Результат: " + (first/second));
            } else if (operator.equals("*")){
                System.out.println("Результат: " + (first*second));
            } else if (operator.equals("+")){
                System.out.println("Результат: " + (first+second));
            } else if (operator.equals("-")){
                System.out.println("Результат: " + (first-second));
            } else if (operator.equals("end")){
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Нет такого оператора!");
                System.out.println(operator);
            }
            System.out.println("\n");
        }

    }
}
