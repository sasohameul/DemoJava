package programmers;

public class Solution_09 {

	public String solution(String code) {

		String answer = "";
		String[] code1 = code.split("");
		
		int mode = 0;

		for(int i = 0 ; i < code1.length; i++) {

			switch (mode) {

			case 0:
				
				if(!code1[i].equals("1")) {
					
					if(i % 2 == 0) {
						
						answer+= code1[i];
						
					} 					
				} else {
					
					mode = 1;
				}

				break;
			
			case 1:
					
				if(!code1[i].equals("1")) {
					
					
					if(i % 2 != 0) {
						answer+= code1[i];
						
					} 
					
				} else {
					
					mode = 0;
					
				}
			

				break;

			default:
				
				
				break;
			}


		}
		
		if(answer.length() == 0) {
			
			
		}


		return answer.length() == 0 ? "EMPTY" : answer;
	}

}
