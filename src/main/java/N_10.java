import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class N_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String word = inputs[0];
        char c = inputs[1].charAt(0);
        int[] result = new int[100];

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                result[i] = 0;
            } else {
                ArrayList<Integer> integers = new ArrayList<>();
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == c) {
                        integers.add(Math.abs(i - j));
                    }
                }
                result[i] = Collections.min(integers);
            }

        }

        for (int i = 0; i < word.length(); i++) {
            System.out.printf("%d ",result[i]);
        }
    }
}
