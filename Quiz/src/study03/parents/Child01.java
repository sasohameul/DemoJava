package study03.parents;

public class Child01 extends Parents{

	public Child01() {
		
		super(1,2);

	}
	
	public int method1() {

		return super.getNum() + super.getNum2();

	}


}
