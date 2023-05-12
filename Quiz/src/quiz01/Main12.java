package quiz01;

import java.util.Scanner;

public class Main12 {
	
	public static void main(String[] args) {
		
		
		receipt();
		
	}

	static void receipt () {
		
		Scanner scan = new Scanner (System.in);
		
		int tAmount = scan.nextInt();
		int count = scan.nextInt();
		
		int total = 0;
		int sum = 0;
		for(int i = 1; i <= count; i++) {
			
			int amount = scan.nextInt();
			int c = scan.nextInt();
			
			sum = amount*c;
			total += sum;		
			}
					
		if(total == tAmount) {
			
			System.out.println("Yes");
			
		} else {
			
			System.out.println("No");
		}
		
		scan.close();
	}
	
		
	
}
