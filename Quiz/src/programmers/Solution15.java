package programmers;

public class Solution15 {

	 public int[] solution(int[] arr, int[][] queries) {
		 
	        int[] answer = {};
	        
	        int[] temp = {};
	        
	        for(int i = 0; i < arr.length; i++) {
	        		        	
	        	for(int j = 0; j < queries.length; j++) {
	        		
	        		temp[0] = arr[i];
	        		arr[i] = queries[0][1];
	        		arr[queries[0][1]]= temp[0];
	        		
	        		
	        		
	        	}
	        	
	        	
	        }
	        
	        
	        
	        
	        
	        
	        return answer;
	    }
}
