package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		//for문으로 작성

		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.

		for(int a = 7; a <= 100; a++) {
			if(a % 7 == 0) {

				System.out.print(a + " ");

			}

		}
        
		System.out.println("======================");
		
		for(int i = 7; i <= 100; i+=7) {
			
			System.out.print(i + " ");
		}

		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
		
		System.out.println("======================");

		int sum = 0;
		
		for(int a=1; a<=200; a++) {

			if(a % 9 == 0) {

				sum++;
			}
					
		}

		System.out.println(sum + "개");
		
		//3. 100~50사이의 두 수 사이의 합

		System.out.println("======================");
		
		int sum1 = 0;
				
		for(int a = 50; a <= 100; a++) {
			
			sum1 +=a;
						
			}
		
		System.out.println(sum1);

		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90

		System.out.println("======================");
		
		String str = "";		
		for(char c = 'A'; c <= 'Z'; c++) {
			
			str += c;
			//System.out.print(c);
			
		}
		System.out.println(str);
 
		//5. 입력받은 정수까지 팩토리얼 // 5! = 5*4*3*2*1		
		System.out.println("======================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>");
		int num = scan.nextInt();
		int sum3 = 1;
		
		for(int a = 1; a <= num; a++) {
			
			
			sum3 *= a;
				
		}
		
		System.out.print(sum3);
		
		
		scan.close();

	}
}
