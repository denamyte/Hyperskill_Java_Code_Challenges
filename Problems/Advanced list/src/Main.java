import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

class Main {

    static Map<String, BiConsumer<List<Integer>, Integer>> actions = Map.of(
            "add", Main::add,
            "remove", Main::remove,
            "size", Main::size,
            "isempty", Main::isempty,
            "contains", Main::contains,
            "indexof", Main::indexof,
            "clear", Main::clear
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Stream.generate(scanner::nextLine).limit(Integer.parseInt(scanner.nextLine()))
                .forEach(str -> {
                    String[] cmd = str.split(" ");
                    actions.get(cmd[0]).accept(list, cmd.length == 2 ? Integer.parseInt(cmd[1]) : 0);
                });
    }

    static void add(List<Integer> list, int value) {
        list.add(value);
    }

    static void remove(List<Integer> list, int value) {
        list.remove(value);
    }

    static void size(List<Integer> list, int ignored) {
        System.out.println(list.size());
    }

    static void isempty(List<Integer> list, int ignored) {
        System.out.println(list.isEmpty());
    }

    static void contains(List<Integer> list, int value) {
        System.out.println(list.contains(value));
    }

    static void indexof(List<Integer> list, int value) {
        System.out.println(list.indexOf(value));
    }

    static void clear(List<Integer> list, int ignored) {
        list.clear();
    }
}