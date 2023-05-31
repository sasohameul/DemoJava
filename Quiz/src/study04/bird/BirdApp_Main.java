package study04.bird;

public class BirdApp_Main {
	
	public static void main(String[] args) {
			
		Crow c = new Crow();
		
		c.fly();
		c.sing();
		c.setName("꽈꽈");
		c.showName();
		
		System.out.println("======================");
		
		Sparrow s = new Sparrow();
		
		s.fly();
		s.sing();
		s.setName("짹짹");
		s.showName();
		
		
		
		
		
		
		
	}

}
