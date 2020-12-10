import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static long power(int n, int m) {
        return LongStream.generate(() -> n).limit(m).reduce(1, (left, right) -> left * right);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}