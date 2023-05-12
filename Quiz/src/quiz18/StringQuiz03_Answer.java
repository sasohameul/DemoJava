package quiz18;

public class StringQuiz03_Answer {

	public static void main(String[] args) {
		
		System.out.println(palinderome("다시 같은 것은 같다"));
		System.out.println(palinderome("다시다"));
		System.out.println(palinderome("이건아니지"));
		System.out.println(palinderome("다시 합창 합시다"));
		
	}
	
	public static String palinderome(String word) {
		
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);
		
		return sb.reverse().toString().equals(word)? "회문" : "회문이 아님";
		
	}
	
	
//	public static String palinderome(String word) {
//		
//		word = word.replace(" ", "");
//		
//		for(int i = 0; i < word.length() / 2; i++) {
//			
//			char a = word.charAt(i); //시작
// 			
//			char b= word.charAt(word.length()-i -1); // 끝
//			
//			if(a!=b) {
//				return "회문이 아님";
//			}
//		}
//		
//		return "회문";
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
}
