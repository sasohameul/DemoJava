package day09.poly.basic;

/*
 * 하나의 자바파일에는 여러 클래스 선언이 됩니다.
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 public이면 됩니다.
 * 
 * 
 * 
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	
	// 선언만 할 수 있다. (값 초기화는 할 수 없는 영역임 a1 = new a(); ( X ))
	A a = new A ();
	B b = new B ();
	C c = new C ();
	D d = new D ();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	//줄여서 쓰면
	A a5 = new B(); // B -> A 로 변환
	
	//기본 타입 변수
	int x = 1;
	double y = x; //( O ) // int -> double로 변환

	
	//Object 타입에 모든 클래스가 저장된다.
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
	
	
	
	
	
	

}
