package practice;

public class CloneEx1 {

	public static void main(String[] args) {

		Point original = new Point (3,5);
		Point copy = (Point) original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		
		
		MyData mi = new MyData(1);
		MyData mi2 = new MyData(1);
		
		System.out.println(mi.equals(mi2));
		System.out.println(mi == mi2);
		
		System.out.println(mi);
		System.out.println(mi2);
		
		System.out.println();
	}

}
