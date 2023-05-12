package quiz01;

import java.util.Scanner;

public class Quiz20 {
	
	public static void main(String[] args) {
		
		//백준 - 1차원 배열 = 10818번
		
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int n = scan.nextInt();
		int arr[] = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			int num = scan.nextInt();
			if(num >= 1000000 && num <= 1000000) {
				arr[i] = num;
			}
			
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] >  max) {
				
				max = arr[i];
			} 
		    if (arr[i] < min) {				
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
//		int a= scan.nextInt();
//		int[] arr = new int[a];
//		
//		int i = 0;
//		while(i < arr.length) {
//			arr[i] = scan.nextInt();
//					i++;
//		}
//		
//		//초ㅣ소, 최대 결정
//		int min = arr[0];
//		int max = arr[0];
//		
//		i = 0;
//		while(i < arr.length) {
//			
//			if(min > arr[i]) {
//				
//				min =arr[i];
//			} 
//			
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//						
//			i++;
//		}
//		
//		
//		System.out.println(min + " "+ max);
//		
	}

}
