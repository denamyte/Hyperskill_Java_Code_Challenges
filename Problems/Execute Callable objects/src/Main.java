import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.stream.Collectors;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Collections.reverse(items);
        List<Future<Integer>> futures = items.stream().map(item -> {
            try {
                return pool.submit(item.get());
            } catch (Exception e) {
                return null;
            }
        }).filter(Objects::nonNull).collect(Collectors.toList());

        pool.shutdown();

        return futures.stream().map(future -> {
            try {
                return future.get();
            } catch (Exception e) {
                return 0;
            }
        }).mapToInt(i -> i).sum();
    }
}