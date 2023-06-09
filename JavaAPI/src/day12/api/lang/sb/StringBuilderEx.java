package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder - main이 하나일때(단일 쓰레드환경에서 사용)
		//StringBuffer - 멀티 쓰레드환경에서 사용
		
		String str = new String( "Java" );
		StringBuilder sb = new StringBuilder("Java");
		
		//처이점 
		System.out.println(str + "program");
		System.out.println(str);

		System.out.println(sb.append("program"));
		System.out.println(sb);
		
		System.out.println("-----------------------");
		
		//빌더의 메소드	]	
				//append() - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		System.out.println("-----------------------");
		//insert() - 중간에 추가
		sb.insert(4, " study ");
		System.out.println(sb);
		
		System.out.println("-----------------------");
		//replace() - 문자열 변경
		sb.replace(5, 10, "book" );
		System.out.println(sb);
		
		System.out.println("-----------------------");
		//delete() - 삭제
		sb.delete(5, 10); //이상~미만
		System.out.println(sb);
		
		sb.deleteCharAt(0); //인덱스번째 삭제
		System.out.println(sb);
		System.out.println("-----------------------");
		
		//reverse() - 거꾸로 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("-----------------------");
		//toString() - 문자열로 형변환
		
		String result = sb.toString();
		System.out.println(result);
		
		
		
		
		
		
		
	}
}


                                                                