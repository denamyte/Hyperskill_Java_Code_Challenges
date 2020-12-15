import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(
                scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int given = scanner.nextInt();

        List<Integer> foundList = new ArrayList<>();
        long distance = Math.abs((long) Integer.MIN_VALUE - Integer.MAX_VALUE);
        for (int number : numbers) {
            long curDistance = Math.abs((long) given - number);
            if (curDistance < distance) {
                distance = curDistance;
                foundList.clear();
            }
            if (distance == curDistance) {
                foundList.add(number);
            }
        }
        Collections.sort(foundList);
        foundList.forEach(number -> System.out.printf("%d ", number));
    }
}