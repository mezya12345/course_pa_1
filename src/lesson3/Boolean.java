package lesson3;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        double a = scanner.nextDouble();

        System.out.println("Выведет true, если число было больше 5");
        System.out.println(a > 5);
    }
}
