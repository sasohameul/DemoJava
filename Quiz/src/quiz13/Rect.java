package quiz13;

public class Rect extends Shape{

	
	/*
	 * 사각형은 side 변수를 가집니다.
	 * 사각형은은 생성될 때 이름과, side 를 받을 수 있도록 생성자 선언.
	 * getArea() = 사각형의 너비를 구하도록 오버라이딩
	 * 
	 */
	
	private double side;
	
	public Rect(String name, double side) {
		super(name); //super는 무조건 첫째줄에 있어야함. 순서뒤바뀌면 안됨
		this.side = side;
	}

	@Override
	public double getArea() {
		
		double R = side*side;
		
		return R;
	}

}
