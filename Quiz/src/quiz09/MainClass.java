package quiz09;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("떴다,비행기");
		
		s.takeOff();
		s.fly(1);
		s.fly(0);
		s.land();
		System.out.println(s.info());
		
	}

}
