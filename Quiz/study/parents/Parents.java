package study03.parents;

public class Parents {
	
	private int num;
	private int num2;
	
	public Parents() {

	}
	
	public Parents(int num, int num2) {

		this.num = num;
		this.num2 = num2;
	}
	
	public int method1() {
		
		return num + num2;
		
	}
	
	public int method2() {
		
		return num - num2;
		
	}
	
	public int method3(int a, int b) {
		
		return a * b;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
	
	
	

}
