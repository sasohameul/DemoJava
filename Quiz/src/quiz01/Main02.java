package quiz01;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int n = scan.nextInt();

		if(n >= 1 && n <= 100) {
			for(int i = 1; i <= n; i++) {

				for(int j = 1; j <= n-i; j++) {

					System.out.print(" ");
				}	
				for(int j = 1; j <= i; j++ ) {

					System.out.print("*");
				}

				System.out.println();
			}
		}
		scan.close();

	}




}
