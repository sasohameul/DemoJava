package study03.ascending;

import java.util.Scanner;

public class MainClass_ascending {

	public static void main(String[] args) {

		//랜덤 크기배열
		int num =  (int)(Math.random()*15) + 5;
		
		Ascending p = new Ascending(num);
		Descending c = new Descending(num);
		
		p.cSortMethod();
		c.cSortMethod();

		System.out.println("==================================");
			
		p.iSortMethod();
		c.iSortMethod();

		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(a);



	}

}
