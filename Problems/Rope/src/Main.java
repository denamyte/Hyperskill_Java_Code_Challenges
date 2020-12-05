import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {

    static Map<String, BiConsumer<List<?>, Integer>> ops = Map.of(
            "split", Main::split,
            "reverse", (list, ignored) -> Collections.reverse(list)
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String[]> commands = Stream.generate(scanner::nextLine)
                .limit(Integer.parseInt(scanner.nextLine()))
                .map(s -> s.split(" "))
                .collect(Collectors.toList());

        List<Character> chars = IntStream.range(0, line.length())
                .map(line::charAt)
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList());

        for (String[] cmd : commands) {
            ops.get(cmd[0]).accept(chars, cmd.length > 1 ? Integer.parseInt(cmd[1]) : 0);
        }

        System.out.println(chars.stream().map(String::valueOf).collect(Collectors.joining("")));
    }

    static <T> void split(List<T> list, int index) {
        for (int i = 0; i < index; i++) {
            list.add(list.remove(0));
        }
    }
}