package quiz13;

public class Circle extends Shape{

	/*
	 * 원은 radius 변수를 가집니다.
	 * 원은 생성될 때 이름과, radius 를 받을 수 있도록 생성자 선언.
	 * getArea() = 원의 너비를 구하도록 오버라이딩
	 * 
	 * 
	 */
	
	private double radius;
	
	public Circle(String name,double radius) {
		super(name);
		this.radius = radius;
	}


	@Override
	public double getArea() {
		
		double O = this.radius*this.radius*Shape.PI;
		
		return O;
	}
	

}
