package quiz01;


import java.util.Scanner;

public class Main09 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int test = scan.nextInt();
		
	
		for(int i = 1; i <= test; i++) {
			
			String str = scan.next();
			
			int len = str.length();
			char c = str.charAt(0);
			char d = str.charAt(len-1);
			
			System.out.println(c + "" +d);
			
		}
		
		
		
	}
}