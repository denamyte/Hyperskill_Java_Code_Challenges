import java.util.Map;
import java.util.function.BiFunction;

class Problem {

    private static Map<String, BiFunction<Integer, Integer, Integer>> ops = Map.of(
            "+", Integer::sum,
            "-", (i1, i2) -> i1 - i2,
            "*", (i1, i2) -> i1 * i2
    );
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> operation = ops.get(args[0]);
        System.out.println(
                operation == null
                        ? "Unknown operator"
                        : operation.apply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
}