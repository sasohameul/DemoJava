package study03.parents;

public class Child03 extends Parents {
	
	public Child03() {

	}

	public int method3(int a, int b) {

		super.setNum(a);
		super.setNum2(b);
		
		return super.getNum() * super.getNum2();
	}
	
	
	public String method04(String a, String b) {
		
		
		return a + b;
		
	}
	
	public String method04(int a, int b) {
		
		String str = "";
		str+= a;
		str+= b;
		
		return str;
				
	}



}
