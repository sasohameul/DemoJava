package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 정수를 입력 받습니다.
		 * 입력받은 정수에 해당하는 구구단을 세로로 출력합니다.
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		
		int num = scan.nextInt();
		int a = 1;
		
		System.out.println("구구단:" + num +"단");
		
		while (a < 10) {
			
			System.out.println(num + " x " + a +" = " + (num*a) );	
			
			a++;
		}
		
		scan.close();
		
		
		
		
	}
	
}
