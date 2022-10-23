import java.util.Scanner;

public class N_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String input = scanner.nextLine().toLowerCase();

        sb.append(input);
        sb.reverse();
        System.out.println(input);
        System.out.println(sb);
        System.out.println(input.equals(sb.toString()) ? "YES" : "NO");
    }
}
