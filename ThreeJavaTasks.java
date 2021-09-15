package task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


// ↓ Вы просили, чтобы было что-то такое ↓

/*
 * @created 15/09/2021 - 22:XX
 * @project task
 * @author corruptzero
 */

/* моя Intellij не создает автоматически информацию о проекте :(
   пожалуйста, подскажите как включить
   (что выше писал вручную)
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'.");
            System.out.println("2. Используя коллекцию удвойте слово.");
            System.out.println("3. Минимальное из N чисел.");
            System.out.println("0. Выход.");
            System.out.println("Введите номер задачи:");
            System.out.print("> ");
            int index = scanner.nextInt();
            switch (index) {
                case 0: {
                    break;
                }
                case 1: {
                    myFirstTask();
                    break;
                }
                case 2: {
                    mySecondTask();
                    break;
                }
                case 3: {
                    myThirdTask();
                    break;
                }
                default: {
                    System.out.println("Такой задачи нет!");
                    break;
                }
            }
        }
    }
    private static void myFirstTask() {
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String elem;
        while (true){
            System.out.print("Введите строку: ");
            elem = scan1.next();
            if (!elem.equalsIgnoreCase("end")){
                list.add(elem);
            } else {
                break;
            }
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("Элемент номер %d = %s\n", i+1, list.get(i));
        };
        System.out.print("\n");
    }
    private static void mySecondTask(){
        Scanner scan2 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку: ");
            String elem = scan2.next();
            list.add(elem);
        }
        doubleValues(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(""+list.get(i));
        }

    }
    private static void doubleValues(ArrayList lst){
        String value;
        for (int i = 0; i < lst.size(); i++) {
            value = (String) lst.get(i);
            lst.add(i+1,value);
        }
    }
    private static void myThirdTask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел будет в массиве?");
        System.out.print("> ");
        int quantity = scan.nextInt();
        ArrayList<Integer> lst = getIntegerList(quantity);
        System.out.println(""+getMinimum(lst));


    }
    private static ArrayList<Integer> getIntegerList(int cnt){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int elem = random.nextInt(1000);
            list.add(elem);
        }
        return list;
    }
    private static Integer getMinimum(ArrayList<Integer> list){
        int min = list.get(0);
        for (Integer i: list) {
            if(i < min)
                min = i;
        }
        return min;
    }
}
