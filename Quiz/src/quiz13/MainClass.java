package quiz13;

public class MainClass {

	public static void main(String[] args) {

		Circle c = new Circle("둥글게", 3.5);
		System.out.println(c.getName());
		System.out.println("넓이:" + c.getArea());		
		
		System.out.println("==============");
		
		Shape r = new Rect("네모",4.0);
		System.out.println(r.getName());
		System.out.println("넓이:" + r.getArea());
		
		
		
		
		
	}

}
