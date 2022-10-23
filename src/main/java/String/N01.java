package String;

import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        char c = scanner.nextLine().toLowerCase().charAt(0);
        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == c) result++;
        }

        System.out.println(result);
    }
}
