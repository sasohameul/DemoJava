package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int [] arr = new int[a];
		
		for(int j = 0; j < a; j++) {
			
			int b = scan.nextInt();
			arr[j] = b;
		}
			int find = scan.nextInt();
			int count = 0;
			
			for(int i = 0; i < arr.length; i++ ) {
				
				if(arr[i] == find) {
					
					count++;
					
				} else{
					
				}
			}
			System.out.println(count);
			
		
	}
		
		
}	
