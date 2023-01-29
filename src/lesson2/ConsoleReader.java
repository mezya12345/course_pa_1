package lesson2;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        scanner.useLocale(Locale.US);

        System.out.println("Введите дробное число с запятой: ");
//        int x = scanner.nextInt();
        double y = scanner.nextDouble();
//        String z = scanner.nextLine();

        System.out.println("Вы ввели число: " + y);
    }
}
