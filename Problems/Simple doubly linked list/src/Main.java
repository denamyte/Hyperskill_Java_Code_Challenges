import java.util.*;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        int size = Integer.parseInt(scanner.nextLine());
        Object[] arg = new Object[1];
        Map<String, Runnable> cmdMap = Map.of(
                "addFirst", () -> list.addFirst(arg[0]),
                "addLast", () -> list.addLast(arg[0]),
                "removeFirst", list::removeFirst,
                "removeLast", list::removeLast,
                "reverse", () -> Collections.reverse(list)
        );
        Stream.generate(scanner::nextLine).limit(size).forEach(s -> {
            String[] split = s.split(" ");
            if (split.length > 1) {
                arg[0] = split[1];
            }
            cmdMap.get(split[0]).run();
        });
        list.forEach(s -> System.out.printf("%s ", s));
    }
}