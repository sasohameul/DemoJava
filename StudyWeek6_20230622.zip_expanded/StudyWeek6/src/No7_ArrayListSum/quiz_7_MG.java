package No7_ArrayListSum;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz_7_MG {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 데이터를 입력하세요 (공백으로 구분):");
        String input = scanner.nextLine();

        String[] inputNumbers = input.split(" ");

        for (String number : inputNumbers) {
            try {
                numbers.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                System.out.println("주의! 정수만 입력하세요, 다시 입력바랍니다.");
                numbers.clear();
                main(args); // 재귀적으로 다시 입력 받음
                return;
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("저장한 배열 값: " + numbers);
        System.out.println("정수의 합: " + sum);
        
    }
}
