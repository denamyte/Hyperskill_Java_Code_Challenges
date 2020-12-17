import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        return val == null
                ? 0
                : (int) Math.max(Integer.MIN_VALUE, Math.min(Integer.MAX_VALUE, val));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}