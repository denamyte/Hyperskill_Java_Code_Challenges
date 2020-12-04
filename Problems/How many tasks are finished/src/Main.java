import java.util.*;
import java.util.concurrent.*;

class FutureUtils {

    public static int howManyIsDone(List<Future> items) {
        return (int) items.stream().filter(Future::isDone).count();
    }

//    public static void main(String[] args) throws InterruptedException {
//        Callable fastCallable = () -> {
//            TimeUnit.MILLISECONDS.sleep(500);
//            return new Object();
//        };
//        Callable slowCallable = () -> {
//            TimeUnit.SECONDS.sleep(2);
//            return new Object();
//        };
//        List<Callable> callables = List.of(
//                fastCallable, fastCallable, fastCallable,
//                slowCallable, slowCallable
//        );
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        List<Future> futures = new ArrayList<>(5);
//
//        callables.forEach(callable -> futures.add(executorService.submit(callable)));
//        TimeUnit.SECONDS.sleep(1);
//
//        int count = howManyIsDone(futures);
//        System.out.printf("fast callables done: %d %n", count);  // should be 3
//
//        TimeUnit.SECONDS.sleep(2);
//        count = howManyIsDone(futures);
//        System.out.printf("all callables done: %d %n", count);  // should be 5
//
//        executorService.shutdown();
//    }

}