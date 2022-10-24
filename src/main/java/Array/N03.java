package Array;

import java.util.Scanner;

public class N03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String[] aInfo = scanner.nextLine().split(" ");
        String[] bInfo = scanner.nextLine().split(" ");

        for (int i = 0; i < time; i++) {
            String result = rsp(aInfo[i], bInfo[i]);
            System.out.println(result);
        }
    }
    //가위바위보 결과를 반환하는 메서드
    private static String rsp(String a, String b) {
        if (a.equals(b)) {
            return "D";
        } else if ((a.equals("1") && b.equals("3")) || (a.equals("2") && b.equals("1")) || (a.equals("3") && b.equals("2"))) {
            return "A";
        } else {
            return "B";
        }
    }
}
