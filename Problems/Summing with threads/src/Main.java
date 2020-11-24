import java.util.List;
import java.util.Scanner;

public class Main {

    private static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        List<RangeSummator> threads = List.of(
                new RangeSummator(scanner.nextInt(), scanner.nextInt()),
                new RangeSummator(scanner.nextInt(), scanner.nextInt()));
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println(threads.stream().map(RangeSummator::getResult).reduce(0L, Long::sum));
    }

    //Don't change the code below
    static class RangeSummator extends Thread {

        int fromIncl;
        int toIncl;

        private volatile long result = 0;

        public RangeSummator(int fromIncl, int toIncl) {
            this.fromIncl = fromIncl;
            this.toIncl = toIncl;
        }

        @Override
        public void run() {
            final long currentId = Thread.currentThread().getId();

            if (currentId == mainThreadId) {
                throw new RuntimeException("You must start a new thread!");
            }

            long sum = 0;
            for (int i = fromIncl; i <= toIncl; i++) {
                sum += i;
            }

            result = sum;
        }

        public long getResult() {
            return result;
        }
    }
}