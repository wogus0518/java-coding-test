import java.util.Scanner;

public class N_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if ((65 <= c && c <= 90) || (97 <= c && c <= 122)) sb.append(c);
        }
        
        sb.reverse();

        String[] result = new String[length];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if ((65 <= c && c <= 90) || (97 <= c && c <= 122)) {
                result[i] = String.valueOf(sb.charAt(idx++));
            } else if (c == 37) {
                result[i] = "%%";
            } else {
                result[i] = String.valueOf(c);
            }
        }

        for (String s : result) {
            System.out.printf(s);
        }
    }
}
