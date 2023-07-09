package study03.Shape;

public class Triangle extends Shape{

	double width;
	double height;

	public Triangle(String name, double width, double height) {

		super.setName(name);
		this.width = width;
		this.height = height;
		getArea();

	}

	public void getArea() {

		System.out.println("도형이름: " + super.getName() + " " + this.width*this.height);
	}




}
