import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double v = new Scanner(System.in).nextDouble();
        System.out.println(v * v * v + v * v + v + 1);
    }
}