package lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 5;
        x = x + 6;
        int y = 1115;
//        Приведение типа
        byte z = (byte) y;
//        Конкатенация строк
        String s1 = "Hello" + " world";

        System.out.println(x);
        System.out.println(s1);
//        Перенос строк с учётом операционной системы:
        System.out.println("Строка 1" + System.lineSeparator() + "Строка 2");
//        Экранирование обратного слеша:
        System.out.println("C:\\Windows\\System32");
    }
}
