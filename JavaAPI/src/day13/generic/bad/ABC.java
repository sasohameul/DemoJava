package day13.generic.bad;

public class ABC {

	//제네릭이 없다면?
	//ABC를 뭐든 저장할 수 있는 클래스를 만들어야함
	// ->but 사용하기가 어려움
	private Object obj;
	
	public void setObj(Object obj) {
		
		this.obj = obj;
	}
	
	public Object getObj() {
		
		return obj;
	}
	
	
}
