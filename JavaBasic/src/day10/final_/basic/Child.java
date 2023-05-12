package day10.final_.basic;

public class Child extends Parents {
	
	
	//final 클래스 - 상송금지
	//final 메서드 - 오버라이드 금지

	public void method01() {
		this.method02();
		
	}

	
	//public void method02() {
		
	//} final 메서드이기때문에 오버라이드 불가
	
	
}
