package String;

import java.util.ArrayList;
import java.util.Scanner;

public class N06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (!list.contains(c)) {
                list.add(c);
            }
        }
        System.out.println(String.join("", list));
    }
}
