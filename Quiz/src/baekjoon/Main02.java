package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int d1 = scan.nextInt();
		int d2 = scan.nextInt();
		int d3 = scan.nextInt();


		if(d1 == d2 && d2 == d3) {

			System.out.println(10000+(d1*1000));

		} else if(d1 != d2 && d2 != d3 && d1 != d3) {

			int[] arr = {d1,d2,d3};

			Arrays.sort(arr);

			System.out.println( arr[2]*100);
		} else {

			int[] arr = {d1,d2,d3};
			Arrays.sort(arr);
			System.out.println(1000 + (arr[1]*100));
		}


		scan.close();


	}

}
