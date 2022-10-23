package String;

import java.util.Scanner;

/**
 * StringBuffer 클래스에서 제공해주는 reverse() 메서드를 이용해서
 * 문자열을 뒤집은 후 리스트에 저장
 */
public class N04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb;

        int idx = Integer.parseInt(scanner.nextLine());
        String[] store = new String[idx];

        for (int i = 0; i < idx; i++) {
            String input = scanner.nextLine();
            sb = new StringBuffer(input);
            store[i] = sb.reverse().toString();
        }

        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
        }
    }
}
