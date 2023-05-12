package day02;

import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println();

		int test = scan.nextInt(); 

		int sum = 1;

		while(sum <= test ) {


			int a = scan.nextInt(); 
			int b = scan.nextInt();	

			System.out.println("Case #" + sum + ": " +  (a+b));

			sum++;
		}							

scan.close();
	}



}

