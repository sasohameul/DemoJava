package day11.inter.basic;

public interface Inter1 {

	//public static final 이 자동으로 붙어서 상수취급이 되므로 초기화해주어야한다.
	//int a;
	int A = 10; 
	
	//일반 메서드 선언이 안되므로(body 구현이 안되므로), 자동으로 추상 메서드가 됨. 선언부만 선언
	void method01();
	
	//인터페이스에는 static,default 메서드 선언이 가능함
	public static void method03() {
		
		System.out.println("스테틱 메서드");
		
	}
	
	public default void method04() {

		System.out.println("디폴트 메서드");
		
	}
	
	
	
}
