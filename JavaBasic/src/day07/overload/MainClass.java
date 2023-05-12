package day07.overload;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(1);
		b.intput("문자열");
		b.input(3, 3.14);
		b.input(3.14, 4);
		b.input(1,'막', 1000000.0);
		
		
		
		
		
	}
	
}
