import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.IntConsumer;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < Math.min(2, size); i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < size - 2; i++) {
            int number = scanner.nextInt();
            int compare = Integer.compare(Math.abs(list.getFirst() - number), Math.abs(list.getLast() - number));
            IntConsumer add = compare < 0 ? list::addFirst : list::addLast;
            add.accept(number);
        }
        list.forEach(i -> System.out.printf("%d ", i));
    }
}