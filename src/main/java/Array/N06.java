package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class N06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        ArrayList<String> inputs = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            inputs.add(scanner.next());
        }

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String input = inputs.get(i);
            int reversed = reverse(input);
            if (isPrime(reversed)) {
                results.add(reversed);
            }
        }
        for (int result : results) {
            System.out.printf("%d ", result);
        }

    }
    //"200" => 2 로 변환하는 메서드
    private static int reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        StringBuilder reverse = stringBuilder.reverse();
        int reversedInt = Integer.parseInt(reverse.toString());
        return reversedInt;
    }
    //소수인지 판별하는 메서드
    private static boolean isPrime(int num) {
        if(num==1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
