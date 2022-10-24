package String;

import java.util.Scanner;

public class N11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next() + " "; // 끝에 공백 추가로 해결하는건 상상도 못했다,,
        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(input.charAt(i));
                if(cnt>1) sb.append(cnt);
                cnt = 1;
            }
        }

        System.out.println(sb);
    }
}
