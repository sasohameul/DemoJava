package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속받은것
		c.method02(); //오버라이드된 것
		c.method03(); // 내 것
		
		System.out.println("====== 다형성 적용(형변환)=====");
		
		//Parents처럼 사용됩니다. 단, 자식의 오버라이드 된 메서드가 실행됩니다.
		Parents p = c;
		p.method01();
		p.method02(); // 오버라이드된 것이 실행됨
		//p.method03은 사용불가. parents에 없어서.
		
		System.out.println(p); //parents타입
		System.out.println(c); //child 타입  
		System.out.println(p == c); //같음. child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("====== 클래스 강제 형변환 ====");
		//원본이 child로 생성되었다면, 강제 형변환이 가능함.
		
		Parents pp = new Child();
		System.out.println(pp); //child 원본
		
		Child cc = (Child)pp; //강제 형변환
		cc.method01();
		cc.method02();
		cc.method03(); //3번까지 사용 가능. 다시 child의 기능
		
		// 주의 할 점!! => 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
		Child ccc = (Child) obj; //실행 중 runtime exception 발생
		
		System.out.println("===== 다형성의 또다른 예시 =====");
		
		String str = "홍길동";
		Object o = str;
		
		String result = (String)o; //ok 다시 String 타입 사용 가능
		
		
		
	}
	
}
