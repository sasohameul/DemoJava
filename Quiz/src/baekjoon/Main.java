package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Case();
	
	}

	static void Case() {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println("Case" + " #" + i + ": " + A + " + "+  B +" = " + (A+B));
			
		}
		
		scan.close();
	}
	
	
	
	
}
