package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main_10952_1 {
	
public static void main(String[] args) {
		
		try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ) {
			
			int A = 1;
			int B = 1;
			
			while(A!=0 && B!=0) {
			
			String str = br.readLine();
			
			String [] arr = str.split(" ");
			
			String a = arr[0];
			String b = arr[1];
			
				if(!a.equals("0") && !b.equals("0")) {
					
				A = Integer.parseInt(arr[0]);
				B = Integer.parseInt(arr[1]);
				
				System.out.println(A+B);
				
				} else if(a.equals("0") && b.equals("0")) {
					
					break;
				}
					
			}
			
			br.close();	
			
		} catch (Exception e) {

		
		}
		
		
	}

}

