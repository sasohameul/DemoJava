package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return이란?
		 * 
		 * 1. 메서드에서 리턴은 실행 결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이됩니다.
		 * 
		 * 3. 반환값은 없을 수도 있습니다. void로 선언.
		 * 4. void 메서드도 return을 사용할 수 있습니다.
		 * 		- 값을 돌려주지는 못하고, 종료의 의미
		 */
		
		//System.out.println(add(1,2));
		
		int result = add(add(1,2), add (3,5));
		System.out.println("결과:" + result);
		
		//void형 메서드는 return이 없기 때문에 단순히 호출만 가능합니다.
		//System.out.println( sub() ); (x) 에러!
		sub(); 
		div(6,2);
		
		noReturn("bye");
		noReturn("hello");
		
		
	} //main
	
	
	static int add(int a, int b) {
		
		return a+b;
	}
	
	//반환이 없고, 배개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	//반환이 없고, 매개변수는 있는 모형
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}

	//
	static void noReturn(String s) {
		
		//문자열 비교는 equals로 해야함, equals내 값이 동일해야 실행됨
		if(s.equals("hello")) {
			System.out.println("메서드를 종료함당!");
			return;
		}
		
		System.out.println("hello를 전달해야 할껄요?");
		
	}
	
	
	
	
}
