package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	
	//사용
		A a = new A(); // public o
		A a2 = new A(1); // default x
		A a3 = new A("홍길동"); // private x
		
		public C () {
			
			a.var1 = 1;
			a.var2 = 2; // default는 같은 패키지 내에서만 가능하기때문에 사용불가
			a.var3 = 3; // private x
			
			a.method1();
			a.method2(); // default x
			a.method3(); // private x
		
		}
		
		
		
	

}
