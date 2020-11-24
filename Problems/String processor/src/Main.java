import java.util.Scanner;
import java.util.stream.Stream;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        Stream.generate(scanner::nextLine)
                .map(s -> new Pair(s, s.toUpperCase()))
                .takeWhile(Pair::notEqual)
                .forEach(System.out::println);
        System.out.println("FINISHED");
    }

    public static class Pair {

        final String original;
        final String upper;

        public Pair(String original, String upper) {
            this.original = original;
            this.upper = upper;
        }

        boolean notEqual() {
            return !original.equals(upper);
        }

        @Override
        public String toString() {
            return upper;
        }
    }
}