import java.util.Scanner;

public class N_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }
}
