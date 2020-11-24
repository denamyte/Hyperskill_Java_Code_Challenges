

class Counter {

    int count = 0;

    public synchronized void inc() {
        count++;
    }

//    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        List<Thread> threads = IntStream.range(0, 2).mapToObj(value -> new Thread(() -> {
//            for (int j = 0; j < 5_000_000; j++) {
//                counter.inc();
//            }
//        })).collect(Collectors.toList());
//        threads.forEach(Thread::start);
//        for (Thread thread : threads) {
//            thread.join();
//        }
//
//        System.out.println(counter.count);
//    }
}