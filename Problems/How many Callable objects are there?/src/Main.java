import java.util.concurrent.Callable;


class FutureUtils {

    @SuppressWarnings("rawtypes")
    public static int determineCallableDepth(Callable callable) throws Exception {
        int count = 0;
        Object maybeCallable = callable;
        while (maybeCallable instanceof Callable) {
            count++;
            maybeCallable = ((Callable) maybeCallable).call();
        }
        return count;
    }
}