
import com.sun.source.tree.NewArrayTree;

import java.util.*;

/*
 * @created 15/09/2021 - 14:36
 * @project test
 * @author note-admin
 */
public class kj {
    public static void main(String[] args) {
        int[] ints = {0, 2, 4, 6, 8, 10, 11, 123, 112, 44, 53, 5667 ,76835, 45, 5};
        OptionalInt max = Arrays.stream(ints).max();
        OptionalInt min = Arrays.stream(ints).min();
        Integer suma = Arrays.stream(ints).sum();
        OptionalDouble avgd = Arrays.stream(ints).average();

        System.out.println("minVal = " + min.getAsInt() + "\nmaxVal = " + max.getAsInt() + "\nsumelement = " + suma + "\nAvg = " + avgd.getAsDouble());

        System.out.print("Масив нечётных ");

        int counter = 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                System.out.print(" " + ints[i]);
            }
        }
    }


}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("1.Моя первая задача.");
//            System.out.println("2.Моя вторая задача.");
//            System.out.println("0.Выход.");
//            System.out.println("Введите номер задачи:");
//            System.out.print("> ");
//            int index = scanner.nextInt();
//            switch (index) {
//                case 0: {
//                    break;
//                }
//                case 1: {
//                    myFirstTask();
//                    break;
//                }
//                default: {
//                    System.out.println("Такой задачи нет!");
//                    break;
//                }
//            }
//        }
//    }
//    private static void myFirstTask() {
//        System.out.println("myFirstTask");
//    }
//}
