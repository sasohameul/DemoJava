package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//next, nextInt, nextDouble,nextLine
		
//		int num = scan.nextInt();
//		
//		scan.nextLine();
//		
//		System.out.print("문자열>");
//		String info= scan.nextLine();
//		
//		System.out.println(num);
//		System.out.println(info);
//		
		
		while(true) {
			
			try {

				System.out.print(">");
				int num = scan.nextInt(); //문자 엔터값을 정상적으로 처리를 못해서
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				scan.nextLine(); //문자 + 엔터값을 대신 처리
			}
			
			
			
			
		}
		
		
	}
	
}
