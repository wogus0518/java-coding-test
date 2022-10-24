package String;

import java.util.Scanner;

public class N12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[num];
        String input = scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String substring = input.substring(7 * i, 7 * i + 7); //7개 문자 단위로 잘라서 리스트에 저장
            inputs[i] = substring;
        }

        StringBuilder result = new StringBuilder();
        for (String code : inputs){
            String binaryCode = toBinary(code);
            int decimal = Integer.parseInt(binaryCode, 2); // "1000011" => 67 이진수 문자열을 10진수로 바꿔주기
            result.append((char)decimal); //67 => 'C' 로 바꿔주고 결과에 저장
        }
        System.out.println(result.toString()); //결과 출력
    }

    // #****## 가 input으로 들어오면 "1000011"을 리턴하는 메서드
    private static String toBinary(String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '#') {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }
    
    
}
