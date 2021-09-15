
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String Quest = "yes";

        Scanner scanMain = new Scanner(System.in);
        Scanner scanQst = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        while (Quest.equals("yes")) {

            System.out.print("\nВыберите задание (1,2,3): ");
            int Task = scanMain.nextInt();

            switch (Task) {

                case 1:
                    task1();
                    break;

                case 2:
                    task2();
                    break;

                case 3:
                    task3();
                    break;

                default:
                    System.out.println("Такого задания тут нет (t-t*)");
                    break;

            }

            System.out.print("\nПосмотреть ещё одно задание? (yes, no): ");
            Quest = scanQst.nextLine();

        }

        scanMain.close();
        scanQst.close();
        scan.close();

        System.out.println();
    }

    // Задание №1
    public static void task1() {

        System.out.println();
        System.out.println("✧ Задание №1\n");

        Scanner scan = new Scanner(System.in);
        ArrayList listWithLines = new ArrayList();

        while (true) {

            System.out.println("Введите текст:");
            String line = scan.nextLine();

            if (line.equals("end")) {
                break;
            }

            listWithLines.add(line);
        }

        System.out.println("\nСписок введённых строк:");

        for (int i = 0; i < listWithLines.size(); i++) {
            System.out.println(listWithLines.get(i));
        }
    }

    // Задание №2
    public static void task2() {

        System.out.println();
        System.out.println("✧ Задание №2\n");

        Scanner scan = new Scanner(System.in);
        String[] listWithWords = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите слово:");
            String line = scan.nextLine();
            listWithWords[i] = line;
        }

        char[][] listWithDoubledWords = doubledValues(listWithWords);

        System.out.println("\nСписок удвоенных введённых слов:");

        for (int i = 0; i < listWithDoubledWords.length; i++) {
            System.out.println();
            for (int j = 0; j < listWithDoubledWords[i].length; j++) {
                System.out.print(listWithDoubledWords[i][j]);
            }
        }

        System.out.println("\n");
    }

    // Задание №3
    public static void task3() {

        System.out.println();
        System.out.println("✧ Задание №3\n");

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");

        int N = scan.nextInt();
        System.out.println();

        LinkedList<Integer> listOfNumbers = getIntegerList(N);

        System.out.print("\nНаименьшее число в коллекции: ");
        System.out.println(getMinimum(listOfNumbers));
    }


    // Дополнительные Методы

    public static char[][] doubledValues(String[] input) {

        char[][] result = new char[5][];

        // для каждого слова в массиве создаем подмассив
        for (int i = 0; i < input.length; i++) {

            String word = input[i]; // слово из массива
            int wordlen = word.length(); // длина слова

            result[i] = new char[wordlen*2];

            // заполняем подмассивы буквами удвоенных слов
            for (int j = 0; j < wordlen; j++) {

                result[i][j+j] = word.charAt(j);
                result[i][j+j+1] = word.charAt(j);
            }
        }
        
        return result;
    }

    public static LinkedList<Integer> getIntegerList(int N) {

        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {

            System.out.printf("Введите число №%d: ",i);
            int number = scan.nextInt();
            result.add(number);
        }
        
        return result;
    }

    public static int getMinimum(LinkedList<Integer> input) {

        int result = input.get(0);

        for (int i = 0; i < input.size(); i++) {
            result = Math.min(result, input.get(i));
        }

        return result;
    }
}
