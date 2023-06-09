package day14.api.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {

		/*
		 * [0-9]{2, 4} : 숫자 중 2~4개 연속된 형태
		 * [0-9]{3} : 0에서 9까지 숫자 중 연속된 3개의 숫자 형태
		 * [A-Z]+   : 대문자 한개 이상
		 * [a-zA-Z]?: 알파벳이 0~1개 나오는 경우
		 * [가-힣]* 한글이 0회이상
		 * 
		 * 3정규 표현식에 속하지 않는 문자는 그냥 사용할 수 있습니다. (-,%)
		 * [0-9]{3}-[0-9]{4} 숫자 3개-숫자 4개 나오는 형태
		 * 
		 * <정규표현식에 포함되는 문자를 쓰고 싶다면>
		 * \\+ : \가 한개 이상인 경우
		 * \?+ : ?가 한개 이상인 경우
		 * 
		 * <정확히 일치하는 문자>
		 * \?. 정확히 ?에 일치하는
		 * [0-9]{3}원 ex>900원 같은 형식을 찾음
		 * 
		 *  \\d 숫자와 일치.[0-9]와 같은 의미
		 *  \\w 언더바를 포함한,영문자와 숫자 일치. [a-zA-Z_]와 같은 의미
		 *  \\s 공백 문자와 일치시킴. 공백을 나타냄
		 * 
		 */

		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/010-1234-1234/bbb123@gamail.com";

		//전화번호 형식
		String pattern1 = "\\d{2,3}-\\d{3,4}-\\d{4}";

		//이메일 형식 (숫자문자@문자.문자)
		String pattern2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+";

		//패턴을 컴파일 시키는 방법
		Pattern p = Pattern.compile(pattern1);
		Pattern p2 = Pattern.compile(pattern2);
		//찾는 작업
		Matcher m = p.matcher(info);
		Matcher m2 = p2.matcher(info);

		//find() - 일치하는 부분이 있다면 true 반환
		//start() - 일치하는 부분의 첫번째 인덱스
		//end() - 일치하는 부분의 마지막 인덱스
		//group() - 일치하는 부분의 추출

		while(m.find()) { //패턴이 여러번 나오면 순서대로 찾습니다.

			System.out.println("첫번째 인텍스:" + m.start());
			System.out.println("마지막 인텍스:" + m.end());
			System.out.println(m.group());

		}
		
		System.out.println("-----------------------");
		
		if(m2.find()) { //패턴을 가장 처음 발견되는 1번을 찾는다. 1번만 실행하므로

			System.out.println("첫번째 인텍스:" + m2.start());
			System.out.println("마지막 인텍스:" + m2.end());
			System.out.println(m2.group());

		}
		System.out.println("-----------------------");
		//리스트 안에 요소들에서 순서대로 값을 찾는 형태
		List<String> list = Arrays.asList(info,info2);
		System.out.println(list.toString());
		
		for(int i = 0; i < list.size(); i++) {
			
			String str = list.get(i);
			
			//패턴 생성
			
			Matcher x = Pattern.compile(pattern1).matcher(str); // 1번째 패턴
			Matcher y = Pattern.compile(pattern2).matcher(str); // 2번째 패턴
//			Pattern x = Pattern.compile(pattern1);
//			Matcher y = x.matcher(str);
			
			if(x.find() && y.find()) {
				
				System.out.println(x.group());
				System.out.println(y.group());
			}
			
			
		}
		
		
		
	}

}
