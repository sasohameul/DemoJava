package programmers;

public class Solution_02 {
	
	public int solution(int a, int b) {
		
		int answer = 0;       
				
		String ab="";
		String ba="";
		
		
		ab +=a;
		ab +=b;
		
		ba+=b;
		ba+=a;
		
		if(Integer.valueOf(ab) >= Integer.valueOf(ba)) {
			
			answer = Integer.valueOf(ab);
			
		} else {
			
			
			answer = Integer.valueOf(ba);
		}
			
		
		
		return answer;
               
        
        
    }
	  
		
public int solution2(int a, int b) {
	
	int answer = 0;       
			
	int ab = Integer.parseInt(""+a+b);
	int ba = Integer.parseInt(""+b+a);
	
	answer = ab >= ba ? ab : ba;
	
	
	return answer;
           
    
    
}
    }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


