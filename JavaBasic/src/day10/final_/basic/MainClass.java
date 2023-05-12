package day10.final_.basic;

public class MainClass {
	
	public static void main(String[] args) {

		Person p1 = new Person("123123", "홍길동");
		//p1.nation = "가나"; final 변수이므로 변경 불가
		System.out.println(p1.ssn);
		
		Person p2 = new Person("234234", "이순신");
		System.out.println(p2.ssn);
		
		//상수의 사용
		System.out.println(Constant.O2); 
		
		
		
		
	}

}
