package study03.Shape;

public class Rectangle extends Shape {

	double side;
	double side2;

	public Rectangle(String name, double side, double side2) {

		super.setName(name);
		this.side = side;
		this.side2 = side2;
		getArea();
		
	}

	public void getArea() {

		System.out.println("도형이름: " + super.getName() + " " + this.side * this.side2);
		

	}
















}
