package baekjoon;

import java.util.Scanner;

public class Main_2562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[9];
		int i;

		for(i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();

		}

		int max = 0;
		int index = 0;
		
		int min = 100;
		int mindex = 0;
		
		for(i = 0 ; i < arr.length; i++) {

				if(max < arr[i]) {

					max = arr[i];
					index = i+1;

				} 
				
				if(min > arr[i]) {
					
					min = arr[i];
					mindex = i+1;
				}
				
		}

		System.out.println("최댓값:" + max + "," + index + "번째");
		System.out.println("최소값:" + min + "," + mindex + "번째");
		

		}
	}


