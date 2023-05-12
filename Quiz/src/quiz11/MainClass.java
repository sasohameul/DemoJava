package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		KeyBoard k = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor m = new Monitor();

		Computer c = new Computer(k,mouse,m);
		
		c.ComputerInfo();
		
		//get
		Monitor mm= c.getMonitor();
		mm.info();
		
	}
	
	
}
