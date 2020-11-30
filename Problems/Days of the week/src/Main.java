import java.util.*;

public class Main {

    private static Map<Integer, String> week = Map.of(
            1, "Mon", 2, "Tue", 3, "Wed", 4, "Thu", 5, "Fri", 6, "Sat", 7, "Sun"
    );

    public static String getDayOfWeekName(int number) {
        if (number < 1 || number > 7) {
            throw new IllegalArgumentException();
        }
        return week.get(number);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}