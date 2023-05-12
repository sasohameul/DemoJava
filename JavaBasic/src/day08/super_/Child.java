package day08.super_;

public class Child extends Parents {

	
	String me;
	
	 /*
	  * 부모님의 기본생성자가 없을 때 해결 2가지 방안
	  * 1. 부모님의 기본 생성자를 만든다. (올바르지않은 방법이다.)
	  * -> 만들어져있는 부모클래스를
	  * 2. 자식에서 super() 통해서 부모님의 생성자와 강제 연결한다. 
	  * 
	  */
	
	Child(String me){
		
		super("홍순자","홍길동"); // 부모 클래스에서 빌려온 변수
		this.me = me;
	}
	
	String info() {
		
		return "name:" + mother + ", name:" + father;
	}
	
	
}
