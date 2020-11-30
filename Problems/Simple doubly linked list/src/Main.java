import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> list = new LinkedList<>();
        int size = Integer.parseInt(scanner.nextLine());
        Map<String, Consumer<Object>> cmdMap = Map.of(
                "addFirst", list::addFirst,
                "addLast", list::addLast,
                "removeFirst", ignored -> list.removeFirst(),
                "removeLast", ignored -> list.removeLast(),
                "reverse", ignored -> Collections.reverse(list)
        );
        Stream.generate(scanner::nextLine).limit(size).forEach(s -> {
            String[] arg = s.split(" ");
            cmdMap.get(arg[0]).accept(arg[arg.length - 1]);
        });
        list.forEach(s -> System.out.printf("%s ", s));
    }
}