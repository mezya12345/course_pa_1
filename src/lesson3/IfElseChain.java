package lesson3;

import java.util.Scanner;

public class IfElseChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Вы ввели положительное число :" + x);
        } else if (x < 0) {
            System.out.println("Вы ввели отрицательное число :" + x);
        } else {
            System.out.println("Вы ввели ноль");
        }
    }
}
