package Array;

import java.util.Scanner;

public class N08 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int score = arr[i];
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (score < arr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        N08 T = new N08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.printf(x+" ");
    }
}
