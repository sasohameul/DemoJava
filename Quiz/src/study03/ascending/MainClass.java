package study03.ascending;

public class MainClass {

	public static void main(String[] args) {

		int num =  (int)(Math.random()*15) + 5;
		
		Ascending p = new Ascending(num);
		Descending c = new Descending(num);
		
		p.cSortMethod();
		c.cSortMethod();

		System.out.println("==================================");
			
		p.iSortMethod();
		c.iSortMethod();




	}

}