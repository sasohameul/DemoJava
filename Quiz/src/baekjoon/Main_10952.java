package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_10952 {
	
	public static void main(String[] args) {
		
		try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {
			
			while(true) {
			
			String str = br.readLine();
			
			String [] arr = str.split(" ");
			
			String a = arr[0];
			String b = arr[1];
			
				if(!a.equals("0") && !b.equals("0")) {
					
					
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				System.out.println(A+B);
				
				} else if(a.equals("0") && b.equals("0")) {
					
					break;
				}
					
			}
			
			
		} catch (Exception e) {

		
		}
		
		
	}

}
