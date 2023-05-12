package study01;

import java.util.Arrays;

import java.util.Scanner;

public class quiz01_sj {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("공백 없는 10자 이상 문자열을 입력하시오 >");

		String sentence = scan.next();

		char[] arr = sentence.toCharArray();

		String str = "";

		x: while(true) {

			int a = scan.nextInt();

			int b = scan.nextInt();

			if(a >= 0 && a < 5 && b >= 5 && b <10) {

				System.out.println("입력하신 정수 :" + a + " , " + b);		

				System.out.println(a + "번째 인덱스 -> " + arr[a] +" 부터," + b+ "번째 인덱스 -> " + arr[b] + " 까지 늘어납니다!");

				for(int i = 0; i < a; i++) {

					str += arr[i];

				}

				for(int i = a; i <= b; i++) {

					for(int j = a-1; j < i+1; j+=1) {

						str += arr[i];
						
					}			
				} 
				
				for(int i = b; i < arr.length; i++) {
					
					str+= arr[i];
					
				}
				System.out.println(str);
				
				break;
				
			} else {

				System.out.println("잘못 입력 했습니다. 다시 입력해주세요");

				continue x;

			}

		} 

	}

}

