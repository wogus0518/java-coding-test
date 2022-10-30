package Array;

import java.util.Arrays;
import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] inputs = new int[num];
        for (int i = 0; i < num; i++) {
            inputs[i] = scanner.nextInt();
        }

        int score = 1;
        int[] scores = new int[num];
        for (int i = 0; i < num; i++) {
            if (inputs[i] == 1) {
                scores[i] = score++;
            } else {
                scores[i] = 0;
                score = 1;
            }
        }
        int sum = Arrays.stream(scores).sum();
        System.out.println(sum);
    }
}
