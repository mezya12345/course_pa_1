package lesson3;

public class ConsoleWriter {
    public static void main(String[] args) {
        double a = Math.sqrt(3);
        int x = 7;
        String s = String.format("%03d", x);

        System.out.println("Строка с переносом Enter");
        System.out.print("Строка без Enter");
        System.out.println(" !Вот");
        System.out.printf("Результат: %f", a);
        System.out.println(" !ВОТ");
        System.out.printf("Результат: %.2f", a);
        System.out.printf("%nРезультат: %.2f", a);
        System.out.printf("%nРезультат: %10.3f", a);
        System.out.printf("%nРезультат: %-10.3f", a);
        System.out.print("!вот");
//        А лучше сначала указать формат, а потом все аргументы
        System.out.printf("%n%s %.2f", "Результат:", a);
        System.out.println();
        System.out.println(s);
    }
}
