package No5_NumOrChar;

import java.util.Scanner;
import java.util.TreeSet;

public class quiz_5_MG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> inputs = new TreeSet<>();

        System.out.println("문자나 숫자를 10번 입력해주세요.");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". 입력: ");
            String input = scanner.nextLine();

            if (inputs.contains(input)) {
                System.out.println("중복값입니다. 다시 입력해주세요.");
                i--;
                continue;
            }

            inputs.add(input);
        }

        System.out.println(inputs);
        scanner.close();
    }
}
