package day08.modi.member.pac1;

public class B {
	
	//사용
	A a = new A(); // public o
	A a2 = new A(1); // default o
	A a3 = new A("홍길동"); // x 같은 클래스에서만 사용 가능

	public B() {
		a.var1 = 1;
		a.var2 = 2;
		a.var3 = 3; private이므로 접근 불가
		
		a.method1();
		a.method2();
		a.method3(); private이므로 사용불가
		
	}
	
	
	
	
}
