package day02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		/*
		 * 반복문과 조건문 사용!
		 * 짝수의 합을 구하는 반복문 만들기
		 * 
		 */
		
//		
		// 1~100까지 수 중에서 짝수의 합 => 100까지 반복 도중에 짝수일때만 누적
//		int a = 1;
//		int sum = 0; // 누적할 변수는 while 조건문 밖에다 생성!
//		
//		while(a <= 100) {
//			
//			if(a % 2 == 0) {
//				sum += a;
//			
//			}
//			
//			a++;
//					
//		}
//		
//		System.out.println("1~100까지 짝수의 합:" + sum);

		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=num) { //입력받은 수 num까지 회전
			
			if(i % 2 ==0) {
				
				sum += i;
			}
			
			i++;
		}
		
		System.out.println("1부터 " + num + "까지의 짝수의 합:" + sum);
		
		scan.close();
		
		
	}
}
