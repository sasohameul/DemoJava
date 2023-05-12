package quiz01;

import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
		
		Num();
		
	}
	
	
	static void Num() {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			
			sum += i ;
			
		}
		
		System.out.println(sum);
		
		scan.close();
		
	}
	
	
	
	

}
