import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    // Not messing with custom lists :), trying to rotate indices in a standard list implementation
    // Sorry, some parts might seem obscure
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int commandsNum = scanner.nextInt();
        scanner.nextLine();
        List<Integer> nums = Arrays.stream(
                scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int curIndex = 0;
        for (int i = 0; i < commandsNum; i++) {
            String[] cmd = scanner.nextLine().split(" ");
            int dir = cmd[0].equals("r") ? 1 : -1;
            int shift = Integer.parseInt(cmd[1]);
            curIndex = (curIndex + shift * dir + (dir > 0 ? 0 : (shift / nums.size() + 1) * nums.size())) % nums.size();
            nums.remove(curIndex);
            if (dir > 0 && curIndex == nums.size()) {
                curIndex = 0;
            } else if (dir < 0) {
                curIndex = (curIndex - 1 + nums.size()) % nums.size();
            }
        }
        nums.forEach(num -> System.out.printf("%d ", num));
        System.out.println();
    }
}