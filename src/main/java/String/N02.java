package String;

import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.printf(String.valueOf(Character.toLowerCase(c)));
            } else {
                System.out.printf(String.valueOf(Character.toUpperCase(c)));
            }
        }
    }
}
