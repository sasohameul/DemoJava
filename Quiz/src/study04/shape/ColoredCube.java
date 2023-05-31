package study04.shape;

public class ColoredCube extends Square {

	public ColoredCube(double side) {
		
		super(side);
		
	}
	
	@Override
	public void color() {
		
		System.out.println("정육면체의 색깔 : " + color);
		
	}

	@Override
	public void draw() {
		
		System.out.println( "draw 메서드 출력: 빨간색 큐브를 만들었어요");
	}
	
	
}
