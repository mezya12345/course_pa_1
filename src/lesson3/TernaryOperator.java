package lesson3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        System.out.println("Наибольшее из них: " + (( x > y) ? x : y));
        System.out.println("Наименьшее из них: " + (( x < y) ? x : y));

        if (x > y) {
            System.out.println("Наибольшее из них: " + x);
            System.out.println("Наименьшее из них: " + y);
        } else {
            System.out.println("Наибольшее из них: " + y);
            System.out.println("Наименьшее из них: " + x);
        }
    }
}
