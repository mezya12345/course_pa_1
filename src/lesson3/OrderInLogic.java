package lesson3;

public class OrderInLogic {
    public static void main(String[] args) {
        int x = 0;
        int y = 5;

        System.out.println(x != 0 && y / x > 0);
//        А это упадёт, потому что делить на ноль нельзя:
//        System.out.println(y / x > 0 && x != 0);
    }
}
