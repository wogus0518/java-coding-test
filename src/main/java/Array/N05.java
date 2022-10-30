package Array;

import java.util.Scanner;

public class N05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] arr = new int[input + 1];
        int result = 0;
        for (int i = 2; i <= input; i++) {
            if(arr[i]==0){
                result++;
                for (int j = i; j <= input; j = j + i) {
                    arr[j]++;
                }
            }
        }
        System.out.println(result);
    }
}
