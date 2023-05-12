package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {



		/* 반복문
		 * 1. 정수를 입력받습니다.
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 예시
		 * 입력수 10
		 * 약수의 합 18
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하시오>");

		int num = scan.nextInt();

		int a = 1;	
		int sum = 0;

		while(a<=num) {
			if(num % a == 0 ) {

				sum+=a ;	

			}
			a++;
		}
		
		System.out.println("약수의 합:" + sum);
		
		scan.close();
	}
}
