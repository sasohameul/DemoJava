package quiz01;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("정수1>");
		int num = scan.nextInt();
		
		System.out.print("연산을 선택하세요 [+, -, *, /] >");
		String m = scan.next();
		
		System.out.print("정수2>");
		int num2 = scan.nextInt();
		
		
		switch (m) {
		case "+" :
			System.out.println("두 수의 덧셈은:" + (num+num2));
			break;
		case "-" :
			System.out.println("두 수의 뺄셈은:" + (num-num2));
			break;
		case "*":
			System.out.println("두 수의 곱셈은:" + (num*num2));
			break;
		case "/" :
			System.out.println("두 수의 나눗셈은:" + (num/num2));
			break;
		default:
			System.out.println("연산자는 [+, - , *, /] 입니다.");

			}
	
		scan.close();
		
	}

}
