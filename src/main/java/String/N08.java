package String;

import java.util.Scanner;

public class N08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        final String REGEX = "[^a-z]";

        String input = scanner.nextLine().toLowerCase().replaceAll(REGEX,"");

        sb.append(input);
        sb.reverse();
        System.out.println(input);
        System.out.println(sb);
        System.out.println(input.equals(sb.toString()) ? "YES" : "NO");
    }
}
