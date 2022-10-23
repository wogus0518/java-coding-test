package String;

import java.util.Scanner;

public class N09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (48 <= c && c <= 57) {
                sb.append(c);
            }
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }
}
