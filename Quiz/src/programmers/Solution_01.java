package programmers;

public class Solution_01 {
	
//	public String solution(String str1, String str2) {
//        String answer = "";
//        
//        String[] a= str1.split("");
//        String[] b = str2.split("");
//        
//        for(int i = 0; i < a.length; i++) {
//        	
//        	answer += a[i] +b[i];
//        }
//        
//        return answer;
//        
//    }
	
	
	public String solution(String str1, String str2) {
        String answer = "";
        
        char[] a= str1.toCharArray();
        char[] b = str2.toCharArray();
        
        for(int i = 0; i < a.length; i++) {
        	
        	answer += String.valueOf(a[i]) + String.valueOf(b[i]);
        }
        
        return answer;
        
    }
	
	
	
	
	
	
	public static void main(String[] args) {

		
		Solution_01 s = new Solution_01();
		
		System.out.println(s.solution("aaaaa", "bbbbb"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
