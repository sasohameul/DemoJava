package practice;

import java.util.Scanner;

public class RepeatString {
	
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = sc.nextInt();	        
	          
	        
	        StringBuffer sb = new StringBuffer(str);
	        
	        for(int i = 0; i < n-1; i++ ) {
	        	
	        	sb.append(str);
	        	
	        	
	        }
	        
	        System.out.println(sb);
	        
	        
	        
	        
	        
	        
	        
	    }

}
