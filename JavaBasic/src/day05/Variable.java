package day05;

public class Variable {

	int a = 1; // 선언과 동시에 초기화는 가능함
	String b;
	
	void printNum(int d) {
		
		int c = 1; // 지역 변수 (지역변수는 값을 초기화해주지 않으면 사용할 수 없음)

		System.out.println("멤버변수:" + a);
		System.out.println("멤버변수:" + b);
		System.out.println("지역변수:" + c);
		System.out.println("지역변수(매개변수:" + d);
	}
	
	
}
