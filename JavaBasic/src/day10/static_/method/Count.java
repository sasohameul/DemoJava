package day10.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메서드 -일반 멤버와, 정적 멤버 모두 사용이 가능
	public int method01() {
		
		a = 10;
		b++;
		
		return b;
	}
	
	//정적 메서드 - 일반 멤버를 사용할 수 없음, 정적멤버는 사용이 가능
	//             단, 객체생성을 통해서는 일반 멤버 사용이 됩니다. 
	public static int method02() {
		
		// a = 10; 사용이 안되는 이유 - static 이 생성될 당시에 a 변수는 없기때문 a변수를 참조할 수 없음
		Count c = new Count();
		c.a = 10; //이렇게 객체를 생성해서 사용가능하다.
		
		b++;
		
		return b;
		
	}
	
	

}
