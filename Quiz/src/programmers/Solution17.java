package programmers;

public class Solution17 {
	
	public int solution(int a, int d, boolean[] included) {
		
        
        int[] arr = {};
        
        for(int i = 1; i < included.length; i++) {
        	
        	arr[0] = a;
        	arr[i] = arr[i-1]+d;
        	
        }
        
        int answer = 0;
        
        for(int i = 0; i < included.length; i++) {
        	
        	if(included[i] == true) {
        		
        		answer +=arr[i];
        		
        	}     		
        		        		
        }   
        
        return answer;
    }

}
