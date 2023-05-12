package day07.override01;

public class Child extends Parents{

	/*
	 * 
	 * 오버라이딩 규칙
	 * 
	 * 1. 반드시 상속 관계를 지녀야 합니다.
	 * 2. 부모님 메서드의 모형이 같아야 합니다.(내용은 다를 수 있음)
	 * 
	 */

	
	void method02() {
		System.out.println("자식의 오버리이드 된 2번 메서드");
	}
	
	
}
