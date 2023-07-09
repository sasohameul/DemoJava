package study05.onlyhangeul_js;

public class Hangeul {
	
//	메서드명 : deleteChar
//	주어진 문자열에서 금지된 문자들을 제거하여 반환
//	반환타입 : String
//	매개변수명  ()
//	String sentence - 변환할 문자열
//
//	String deleteCh - 제거할 문자들로 구성된 문자열
//
//	- 1번 문장 :  "(문!제@를!한~번)*풀$어%볼#까$요?)^@^”  ,  ~!@#$%&*()
//	- 2번 문장 :  "문a제y내z느d라ik힘s들q었k다nh히vb유...” ,  ayzdiksqknhvb

	
	public String deleteChar(String sentence, String deleteCh) {
		
		StringBuilder sb = new StringBuilder(sentence);
		
		//제거할 문자와 비교할 str배열과 제거할 문자만 담은 배열을 만든다.
		String[] str = sb.toString().split("");
		String[] del = deleteCh.split("");
		
		//제거할 문자열 길이까지 설정->제거할 문자로 비교할거니까.
		for(int i = 0; i < del.length; i++) {
			
			for(int j = 0; j < str.length; j++) {
				
				//만약 똑같은 문자라면 제거하는데, 제거하게되면 인덱스값이 바뀌니까 바뀌지않도록 제거한 자리에 공백을 추가한다.
				if(str[j].equals(del[i])) {
					
					sb.deleteCharAt(j);
					sb.insert(j, " ");
					
			
			}
				
			}
			
		}
		//인덱스 유지를 위해 추가했던 공백을 다시 제거!
		return sb.toString().replace(" ", "");
	}
	
}
