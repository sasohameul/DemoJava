package programmers;

public class Solution11 {
	
	public int solutionnum(int[] num_list) {
		
        int answer = 0;
        
        String zzak = "";
        String hol = "";
        
        for(int i = 0; i < num_list.length; i++) {
        	
        	if(num_list[i] % 2 == 0) {
        		
        		zzak += num_list[i];
        		
        	} else {
        		
        		hol += num_list[i];
        		
        	}
        	
        }
        
        return Integer.parseInt(zzak)+Integer.parseInt(hol);
    }

}
