package study04.shape;

public abstract class Circle implements Shape {
	
	double radius;
	
	public Circle(double radius) {

		this.radius = radius;
	}
	
		
	
	@Override
	public void getArea() {

		
		double area = this.radius * this.radius * Math.PI;
		System.out.println("넓이는 :" + area);
		
	}
	
	abstract void draw();

}
