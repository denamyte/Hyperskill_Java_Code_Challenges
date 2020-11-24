import java.util.Scanner;
import java.util.stream.IntStream;

class NumbersFilter extends Thread {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        IntStream.generate(scanner::nextInt).takeWhile(value -> value != 0)
                .filter(value -> value % 2 == 0).forEach(System.out::println);
    }
}