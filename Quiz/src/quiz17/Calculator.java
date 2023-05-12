package quiz17;

import java.util.Scanner;

public class Calculator {
	
	/*
	 * 1. 스캐너로 정수 2개를 입력을 받아서 두 수의 합을 반환하는 기능
	 * 2. 입력된 값이 정수라면 합계를 반환
	 * 3. 예외가 발생하면, 직접예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
	 * 4. scan.close(); 은 finally 에서 처리하세요.
	 */
	
	public int input() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오>");
		
		try {
			//예외가 발생하면 가장 가까운 catch문으로 이동됩니다.
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			return a+b;
			
		} catch (Exception e) {

			throw new Exception("문자를 입력하세요"); 
		} finally {
		
			scan.close();
		}
	}
	
	
		
		
		
		
	}
	


