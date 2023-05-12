package day01;

public class DataType2 {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 char = 2byte
		char c1 = 'A';
		char c2 = 65;
		
		//아스키 코드 - 미국에서 문자들에 숫자값을 붙임 (1byte)
		//유니 코드 - 전세계 문자에 숫자값을 붙임 (부호없는 비트 체계- 2byte)
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032; //유니코드 10진수 '가'
		char c5 = '\uAC00'; // 유니코드 '가'
		
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		//문자열을 저장할 수 있는 String
		String s1 = "가가가가 "; // 공백도 아스키코드값을 가지고있음. 공백도 문자열로 인식됨
		String s2 = "나나나나";
		
		//문자열을 붙일 때, +를 사용하면 됩니다.
		System.out.println(s1 + s2);
		
		//문자와 다른 값에 +연산 해 본다면,
		System.out.println(100 + 100); //200
		System.out.println("100" + 100); //100100 문자열에 다른 값이 붙으면 문자열이 됩니다.
		System.out.println(100 + 100 +"100"); //200100
		
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10 ); //75
		
	}
}
