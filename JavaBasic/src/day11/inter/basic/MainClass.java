package day11.inter.basic;

public class MainClass {

	public static void main(String[] args) {

		Basic b = new Basic();
		
		b.method01(); //override된 메서드
		b.method02(); //override된 메서드
		b.method03(); //나의 메서드
		
		System.out.println("======================");
		
		//인터페이스도 데이터타입이 될 수가 있습니다.
		//Inter1 처럼만 사용됨
		Inter1 i1 = new Basic();
		i1.method01();
		
		System.out.println("======================");
		
		//Inter2 처럼만 사용됨
		Inter2 i2 = new Basic();
		i2.method02();
		
		System.out.println("======================");
		
		//인터페이스에서도 클래스 캐스팅을 사용 할 수 있습니다.
		Basic bb = (Basic)i2;
		bb.method01();
		bb.method02();
		bb.method03();
		
		//static메서드의 사용은 클래스.메서드
		Inter1.method03();
		
		//default메서드의 사용 - 인터페이스에 미리 만들어진 몸체를 가지고있는 메서드
		bb.method04();
		
		
	
		
		
		
	}

}
