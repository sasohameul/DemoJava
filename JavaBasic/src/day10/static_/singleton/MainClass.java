package day10.static_.singleton;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Singleton s = new Singleton();
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		//Singleton 클래스에 해당하는 1개의 static 실행이므로 값이 동일하다.
		System.out.println(s); //day10.static_.singleton.Singleton@7c30a502
		System.out.println(s1); //day10.static_.singleton.Singleton@7c30a502
		System.out.println(s2); //day10.static_.singleton.Singleton@7c30a502
		
		System.out.println(s.getDomain()); // www.aaa.com
		System.out.println(s1.getDomain()); // www.aaa.com
		System.out.println(s2.getDomain()); // www.aaa.com
		
		
		
	}

}
