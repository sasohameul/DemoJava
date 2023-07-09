package programmers;

public class Solution12 {

public int[] solution(int[] num_list) {
    	
        int[] answer = new int[num_list.length+1];
        
        
        	if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
                
                for(int i =0; i<answer.length-1; i++){
                    
                    answer[i] = num_list[i];
                }
        		
        		answer[answer.length-1] = num_list[num_list.length-1] - num_list[num_list.length-2];
        		
        	} else {
                
                for(int i =0; i<answer.length-1; i++){
                    
                    answer[i] = num_list[i];
                }
        		
        		answer[answer.length-1] = num_list[num_list.length-1]*2;
        	}      
        
        
        return answer;
    }
	
}
