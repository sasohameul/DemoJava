package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1152 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){

			String str = br.readLine();
			String []arr = str.split(" "); 

			int count = 0;

			for(int i = 0; i < arr.length; i++) {

				if(arr[i].equals("")) {

					

				} else {

					count++;
				}
			}
			
			System.out.println(count);

		} catch (Exception e) {

		}
	}
}
