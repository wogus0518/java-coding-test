package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int[] inputs = new int[num]; //두번째 입력을 저장하기 위해서
        for (int i = 0; i < num; i++) {
            inputs[i] = scanner.nextInt(); //두번째 입력 모두 받기
        }

        ArrayList<Integer> result = new ArrayList<>(); //결과 넣을 어레이
        result.add(inputs[0]); // 첫번째 숫자는 무조건 결과에 들어간다.
        for (int i = 1; i < num; i++) {
            if (inputs[i - 1] < inputs[i]) {
                result.add(inputs[i]); //문제 조건에 맞으면 결과에 들어간다.
            }
        }

        for (int r : result) {
            System.out.printf("%d ", r); //결과 출력
        }
    }
}
