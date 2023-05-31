package study04.shape;

public abstract class Square implements Shape {

	double side;

	public Square(double side) {

		this.side = side;

	}

	@Override
	public void getArea() {

		double area = this.side * this.side * this.side;
		System.out.println("넓이는 :" + area);

	}


	public abstract void draw();

	

}
