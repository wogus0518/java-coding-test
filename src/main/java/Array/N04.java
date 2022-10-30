package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(1,1));
        for (int i = 0; i < repeat - 2; i++) {
            int next = results.get(i) + results.get(i + 1);
            results.add(next);
        }
        for (int result : results) {
            System.out.printf("%d ", result);
        }
    }
}
