import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsCount = scanner.nextInt();
        double growFactor = scanner.nextDouble();
        double shrinkFactor = Double.parseDouble(scanner.nextLine());

        int memory = 2;
        int size = 0;
        while (commandsCount > 0) {
            String cmd = scanner.next();
            switch (cmd) {
                case "add":
                    size += scanner.nextInt();
                    double newMemory = memory;
                    while (newMemory < size) {
                        newMemory *= growFactor;
                    }
                    memory = (int) newMemory;
                    break;
                case "delete":
                    size -= scanner.nextInt();
                    double shrunkMemory = memory;
                    while (shrunkMemory >= size) {
                        shrunkMemory /= shrinkFactor;
                    }
                    memory = (int) (shrunkMemory * shrinkFactor);
                    break;
                default: System.out.println(memory);
                    break;
            }
            commandsCount--;
        }
    }
}