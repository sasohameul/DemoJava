package day10.static_.basic;

public class Init {

	public static int price; // public static int price = 1000; 바로 초기화해도됨
	
	
	static {
		
		System.out.println("단 한번 실행됨");
		price = 1000;
		
	}
	
	
	
}
