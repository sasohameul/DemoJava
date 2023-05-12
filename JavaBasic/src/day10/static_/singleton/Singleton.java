package day10.static_.singleton;

public class Singleton {
	//팩토리메서드,인터페이스패턴,추상팩토리패턴,빌더패턴,파사드 패턴(폭포수) 등등...

	//싱글톤 - 객체가 1개만 생성되도록 클래스를 설계하는 패턴 (디자인패턴)

	//1. 나 자신의 객체를 1개 생성
	private static Singleton instance = new Singleton();
	
	//2. 객체를 직접 생성 할 수 없도록 생성자를 private 처리합니다.
	private Singleton() {
		
	}
	
	//3. 외부에서 객체 생성을 요구할 때, getter를 통해서 instance를 반환시킵니다.
	public static Singleton getInstance() {
		
		return instance;
	}
	
	/////////////////////////////////////////////////////////
	private String domain = "www.aaa.com";
	
	public String getDomain() {
		
		return domain;
	}
	
	
	
}
