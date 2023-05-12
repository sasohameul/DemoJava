package day10.abstract_.good;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 추상메서드를 사용하면 오버라이딩 강제화 되어서 프로그래머의 오버라이딩 실수를 줄일 수 있습니다.
		 * 
		 * 2. 객체의 추상화 == 다형성 
		 *   => 추상클래스는 객체로 생성이 안되기 때문에 자식으로 생성해서 부모타입으로 구체화하여 사용한다.
		 * 
		 */
		
		//Store s = new Store(); (x) 사용이 안됨
		
		Store s1 = new SeoulStore(); //자식 클래스를 부모클래스타입에 담아도 오버라이딩 된 것 부터 실행되기에 바뀌는 것도,문제도 없음
		s1.apple();
		s1.grape();
		s1.melon();
		s1.orange();
		s1.newMenu();
		System.out.println(s1.getName("호식이 서울점"));
		
		System.out.println("===================");
		
		BusanStore s2 = new BusanStore();
		s2.apple();
		s2.melon();
		s2.grape();
		s2.orange();
		s2.newMenu();
		System.out.println(s2.getName("호식이 부산점"));
		
		
		
		
		
		
	}

}
