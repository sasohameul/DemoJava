package study01;

import java.util.Arrays;
import java.util.Scanner;

public class quiz01_hj {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		int j = 0;
		int count = 0;
		int money = 2000;
		String []products = new String[100];
		int[] price = new int[100];

		String available = " ";

		x: while(true) {

			System.out.print("추가할 물품 >>");
			products[i] = scan.next();
			i++;

			System.out.print("물품 가격 >>");
			price[j] = scan.nextInt();
			j++;
			
				if(price[j-1] <= money) {
					
					available += products[i-1] + ",";
					count++;
				}
				
			System.out.print("그만 추가하고 싶으면 0 입력 >>");
			String stop = scan.next();
			if(stop.equals("0")) {

				System.out.println("========================");

				String str ="[";
				for(int k = 0; k < i; k++) {

					str += products[k]+ "-" + price[k];
					
										
				}
				
				System.out.println("상품 목록 " + str + "]");
				System.out.println("=========================");

				System.out.println("구매 가능 물품:" + available);
				System.out.println(count + "개 구매 가능");

				break x;

			} else {

				continue x ;
			}

		}

	}

}
