import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> commands = Stream.generate(scanner::nextLine).limit(Integer.parseInt(scanner.nextLine()))
                .collect(Collectors.toList());
        int size = 0;
        for (String cmd : commands) {
            if (cmd.contains("add")) {
                size++;
            } else if (cmd.contains("remove")) {
                size--;
            } else {
                System.out.println(size);
            }
        }
    }
}