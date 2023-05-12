package quiz01;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {

		Test();
	
		

	}

	static int Test() {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();

		for(int i = 0; i < count; i++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a+b);
			
	}

		return count;

}

	
	

}





