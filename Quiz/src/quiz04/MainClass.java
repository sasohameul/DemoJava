package quiz04;

public class MainClass {
	
public static void main(String[] args) {
		
		Warrior w = new Warrior("troll");
		Wizard h = new Wizard("hobit");
		
		System.out.println("***Warrior 정보***");
		w.info();
		w.bash();
		w.bash();
		
		System.out.println("***Wizard 정보***");
		h.info();
		h.iceArrow();
		h.iceArrow();
		
	}
	

}
