package practice;

import java.util.Arrays;

public class SeatType {

	public String[][] A21N = new String[6][30];
	public String[][] A321 = new String[6][43];
	public String[][] AT75 = new String[4][17];
	public String[][] B378 = new String[6][31];
	public String[][] A320 = new String[8][27];

	public void A21Nseatmap() {

		for(int i = 0; i < A21N.length; i++) {

			for(int j = 0; j < A21N[i].length; j++) {

				A21N[i][j] = "O";

			}

		}

	}

	public void A321seatmap() {

		for(int i = 0; i < A321.length; i++) {

			
			for(int j = 0; j < A321[i].length; j++) {

				A321[i][j] = "O";

			}

		}

	}

	public void AT75seatmap() {

		for(int i = 0; i < AT75.length; i++) {

			if(i == 2) {

				System.out.println("===================================================================================");
			}
			for(int j = 0; j < AT75[i].length; j++) {

				AT75[i][j] = " - ";

			}

			System.out.println(Arrays.toString(AT75[i]));

		}

	}

	public void B378seatmap() {

		for(int i = 0; i < B378.length; i++) {

			if(i == 3) {

				System.out.println("======================================================================================================================================================");
			}
			for(int j = 0; j < B378[i].length; j++) {

				B378[i][j] = " - ";

			}

			System.out.println(Arrays.toString(B378[i]));

		}

	}


	public void A320seatmap() {

		for(int i = 0; i < A320.length; i++) {

			if(i == 4) {

				System.out.println("==================================================================================================================================");
			}
			for(int j = 0; j < A320[i].length; j++) {

				A320[i][j] = " - ";

			}

			System.out.println(Arrays.toString(A320[i]));

		}

	}







	//	int [] a = new int[30];
	//	
	//	for(int i = 0; i < a.length; i++) {
	//		
	//		a[i] = i+1;
	//		
	//		if(i < 10) {
	//		
	//		System.out.print( "   "+ a[i] );
	//		
	//		} else if (i >= 10) {
	//			
	//			System.out.print(" "+ a[i] + " ");
	//			
	//		}
	//	}
	//	
	//		System.out.println();
	//		
	//		for(int i = 0; i < A21N.length; i++) {
	//
	//		if(i == 3) {
	//
	//			System.out.println("==========================================================================================================================");
	//		} 
	//
	//		char k = (char)(i+64);
	//		k ++;
	//
	//		System.out.print(k + " ");
	//		for(int j = 0; j < A21N[i].length; j++) {
	//
	//			A21N[i][j] = "O";
	//			System.out.print("[ ]" + " ");
	//		}
	//		System.out.println();



}








