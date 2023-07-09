package study05.numbergame_lj;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		//	랜덤 숫자 맞추기 게임
		//
		//	1~50 까지 랜덤한 숫자를 입력받고 이 숫자가 무엇인지 맞춰봅시다.
		//	숫자가 아닌 문자를 입력할 경우, 50을 넘어선 숫자의 범위를 초과할 경우는
		//	각각 예외처리를 통해 처리합시다.
		//	시도 횟수와 정답을 마지막에 출력해주시면 됩니다.

		System.out.println("======= 숫자 맞추기 게임 =========");

		Random r = new Random();
		int rn = r.nextInt(51); //0부터 50

		int count = 0;
		System.out.println("1부터 50까지의 숫자를 맞춰보세요!");
		System.out.println(rn);

		while(true) {

			try {

				Scanner scan = new Scanner(System.in);
				//숫자 형태가 아니라면 자동으로 inputmismatch예외로 넘어감
				int num = scan.nextInt();
				scan.close();
				if(num <= 50 && num >= 1) {

					if(rn != num) {

						System.out.println("틀렸습니다! 다시 맞춰보세요!");
						count++;
						System.out.println("시도 횟수: " + count);

					} else {

						count++;
						System.out.println("숫자를 맞췄습니다! 정답은 " + rn + "\n총 시도 횟수: " + count);
						break;
					}

				} else {
					//숫자 범위를 위에서 설정해주었지만 에러는 아니기때문에 예외쪽으로 던져준다.
					throw new Exception();
				}
				
			} catch (InputMismatchException e) {

				System.out.println("숫자만 입력해주세요.");
				
			} catch (Exception e) {
				
				System.out.println("숫자의 범위를 벗어났습니다. 다시 입력하세요");
			}

		} 

	}
}
