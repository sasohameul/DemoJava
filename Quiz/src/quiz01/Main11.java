package quiz01;

import java.util.Scanner;

public class Main11 {
	
	public static void main(String[] args) {
	
		
		Num();
		
	}

	
	static void Num () {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		
		for(int i = 1; i <= t; i++) {
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			
			
			System.out.println("Case #" + i +": " + (num1+num2) );
		}
		
		scan.close();
	}
	
	
	
	
}
