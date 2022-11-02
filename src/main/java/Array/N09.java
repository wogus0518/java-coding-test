package Array;

import java.util.Scanner;

public class N09 {
    public static void main(String[] args) {
        N09 T = new N09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sumCol, sumRow;
        for (int i = 0; i < n; i++) {
            sumCol = sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += arr[i][j];
                sumCol += arr[j][i];
            }
            answer = Math.max(answer, sumRow);
            answer = Math.max(answer, sumCol);
        }

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
}
