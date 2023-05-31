package study04.shape;

public class ColoredCircle extends Circle implements Shape{

	public ColoredCircle(double radius) {

		super(radius);

	}

	public void color() {
		
		System.out.println("원의 색깔 : " + color);
	}

	
	@Override
	void draw() {

		System.out.println("draw 메서드 출력 : 원을 만들었어요");
	
	}



}
