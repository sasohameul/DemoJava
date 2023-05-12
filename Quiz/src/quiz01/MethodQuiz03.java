package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		char[] arr = {'1','2','3'};
		String result=  method06(arr);
		System.out.println(result);
	
		
		int [] arr2 = {1,2,3};
		int result2 = method07(arr2);
		System.out.println(result2);
		
		String [] arr3 = method08("간다", "나는 집에");
		System.out.println(Arrays.toString(arr3));
		
	}
	
	//6. 
	static String method06(char[] arr) {
		
		
		String str="";
		for(int i = 0; i < arr.length; i++) {
			
			str += arr [i];
		}
		
		return str;
	}
	
	//7.
	
	static int method07(int[] arr2) {
		
		int sum = 0;
		for(int a : arr2) {
			sum += a;
		}
		
//		int sum = 0;
//		for(int j = 0; j < arr2.length; j++) {
//			
//			sum += arr2[j];
//			
//		}
		
		return sum;
	}
	
	//8. 
	
	static String[] method08(String a, String b) {
		
		String [] arr3 = {a,b};
		
		return arr3;
		//return new String[] {a,b};
	}
	
	

}