package quiz22;

import java.util.regex.*;

public class RegexQuiz01 {

	public static void main(String[] args) {

		/*
		 * 가격 형식은 전부 찾아서 순서대로 출력해보면 됩니다.
		 * 패턴은 1개면 됩니다.
		 * 
		 */
		String str = "안녕하세요? 점심은 4,500원인데요. 커피가 무려 1600원이에요. 디저트는 무려 1400원이나 한답니다.";
		
		//String pattern = "\\d+,*\\d+";
		String pattern = "[0-9,]+원";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			
			System.out.println(m.group());
		}
		
	}

}
