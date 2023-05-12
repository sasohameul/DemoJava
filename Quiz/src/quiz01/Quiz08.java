package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
	/*
	 * 1. 랜덤수를 생성하고, 이 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리합니다.
	 * 2. 출력된 문자열이, 어느 나라 언어인지 판별해서 출력해주면 됩니다.
	 * 
	 */
 
	Scanner scan = new Scanner(System.in);
	
	String[] arr = {"안녕", "hello", "니하오","오하이요 고자이마스","&*#$!"};
	
	int num = (int)(Math.random()* arr.length);
	
	System.out.println("선택된 단어:" + arr[num] );
	
	switch (num) { //switch(arr[num])도 가능 -> case 값에는 해당 값이 들어가야함
	case 0:
		System.out.println("한국어입니다.");
		break;
	case 1:
		System.out.println("영어입니다.");
		break;
	case 2:
		System.out.println("중국어입니다.");
		break;
	case 3:
		System.out.println("일본어입니다.");
		break;

	default:
		System.out.println("알 수없는 언어입니다.");
		break;
	}
	
	
	scan.close();
	
	
}
}









