package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 * 1. 하나의 정수를 입력받습니다.
		 * 2. 이 정수가 짝수인지, 홀수인지, 음수인지, 
		 *    0인지 판별하는 프로그램 코드 작성
		 *    
		 *   3 -> 홀수
		 *   0 -> 0입니다.
		 *   -1 -> 음수
		 *   2 -> 짝수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요>");
		
		int num = scan.nextInt();
		
		if(num % 2== 0 && num >0 ) {
			System.out.println("짝수입니다.");
		} else if(num %2 >=1) {
			System.out.println("홀수입니다.");
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else if(num==0) {
			System.out.println("0입니다.");
		}
		
		scan.close();
		
	}
}
