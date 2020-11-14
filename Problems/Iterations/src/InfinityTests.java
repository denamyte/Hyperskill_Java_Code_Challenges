public class InfinityTests {
    public static void main(String[] args) {
        System.out.printf("00: %f%n", Double.POSITIVE_INFINITY);
        System.out.printf("00: %f%n", Double.NEGATIVE_INFINITY);
        System.out.printf("01: %f%n", Double.POSITIVE_INFINITY / 100);
        System.out.printf("02: %f%n", 34 / 0.0);
        System.out.printf("03: %f%n", Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY);
        System.out.printf("04: %f%n", -Double.POSITIVE_INFINITY);
        System.out.printf("05: %f%n", 1 / Double.POSITIVE_INFINITY);
        System.out.printf("06: %f%n", Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY);
        System.out.printf("07: %b%n", Float.POSITIVE_INFINITY < Double.POSITIVE_INFINITY);
        System.out.printf("08: %b%n", 0.0 / 0.0 == 0.0 / 0.0);
        System.out.printf("09: %b%n", Double.NEGATIVE_INFINITY < Double.POSITIVE_INFINITY);
        System.out.printf("10: %b%n", 1.0 / 0.0 == Double.POSITIVE_INFINITY);
        System.out.printf("11: %f%n", Double.MAX_VALUE / 0.0);
        System.out.printf("12: %f%n", Double.POSITIVE_INFINITY + Double.NEGATIVE_INFINITY);
        System.out.printf("13: %f%n", 5 / 0.0);
    }
}
