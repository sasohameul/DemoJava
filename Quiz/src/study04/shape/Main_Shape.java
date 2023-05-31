package study04.shape;

public class Main_Shape {
	
	public static void main(String[] args) {
		
		ColoredCircle c = new ColoredCircle(15.0);
	
		c.color();
		c.getArea();
		c.draw();
		
		System.out.println("=======================");
			
	
		ColoredCube cc = new ColoredCube(5.0);
		
		cc.color();
		cc.getArea();
		cc.draw();
	
	
	
	}
	

}
