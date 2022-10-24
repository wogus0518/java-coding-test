package Array;

import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stdNum = Integer.parseInt(scanner.nextLine());
        String[] heights = scanner.nextLine().split(" ");

        int maxHeight = 0;
        int result = 0;
        for (String h : heights) {
            int height = Integer.parseInt(h);
            if (height > maxHeight) { // 가장 큰 키보다 크다면 보인다.
                maxHeight = height; //반복해서 돌려가며 가장 큰 키를 갱신시킨다.
                result++;
            }
        }
        System.out.println(result);
    }
}
