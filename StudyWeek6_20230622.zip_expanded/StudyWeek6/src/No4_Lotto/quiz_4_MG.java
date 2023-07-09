package No4_Lotto;

import java.util.*;

public class quiz_4_MG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "hello_world";

        System.out.println("당신의 로또를 구매할 아이디는: " + username);

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        boolean isValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}$");

        if (isValid) {
            System.out.println("로그인 성공!");

            Random random = new Random();

            for (int i = 1; i <= 5; i++) {
                System.out.println("로또 구매 " + i + "번째: ");
                Set<Integer> lottoSet = new HashSet<>();

                while (lottoSet.size() < 6) {
                    int randomNumber = random.nextInt(45) + 1;
                    lottoSet.add(randomNumber);
                }

                List<Integer> lottoList = new ArrayList<>(lottoSet);
                Collections.sort(lottoList);

                System.out.println("로또 번호: " + lottoList);
                System.out.println();
            }
        } else {
            System.out.println("로그인 실패! 다음 주에 사세요~!");
        }

        scanner.close();
    }
}
