package study03.Shape;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(String name, double radius) {
		
		super.setName(name);
		this.radius = radius;
		getArea();
	
	}
	
	public void getArea() {

		System.out.println("도형이름: " + super.getName()+  " "+ this.radius * this.radius *3.14);
		

	}
	
	
	
	
	

}
