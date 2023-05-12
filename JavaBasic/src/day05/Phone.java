package day05;

public class Phone {
	
	String model;
	String color;
	int price;
	
	//생성자를 프로그래머가 직접 생성하게 되면, JVM이 기본 생성자를 자동 생성하지 않습니다.
	//생성자는 Class명과 동일하며 반환 유형이 없습니다.
	//역할 - 멤버변수를 초기화하는 용도로 보통 사용됨
	Phone(){
		
		System.out.println("생성자 호출 ! ㅎ");
		model = "갤럭시";
		color = "검정색";
		price = 1000000;
	}

	//생성자는 여러개 선언 할 수 있습니다.
	//단, 매개변수의 종류 or 개수가 달라야합니다.
	Phone(String a){
		model = a;
		color = "핑크색";
		price = 200000;
	}
	
	Phone(String a, String b){ //모델, 색상
		
		model = a;
		color = b;
		price = 300000;
		
	}
	
	Phone(String a, int b){ //모델, 가격
		
		model = a;
		color = "하얀색";
		price = b;
		
	}
	
	Phone(String a, String b, int c){
		
		model = a;
		color = b;
		price = c;
		
	}
	
	
	void info() {
		
		System.out.println("===== 폰의 정보 ======");
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
		
	}
	

}
