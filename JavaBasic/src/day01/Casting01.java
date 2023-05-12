package day01;

public class Casting01 {
	
	public static void main(String[] args) {
		
		//작은 타입을 큰타입에 넣을 때는 자동 형변환이 일어납니다.
		byte a = 10;
		
		short s = a; // byte ->short 자동 형변환
		int i = a; // byte -> int 자동 형변환
		long l = a; // byte -> long 자동 형변환
		
		// 문자와 숫자간에도 유효함
		char c = '가';
		int j = c; // char -> int형 형변환
		System.out.println(j);
		
		int k = 1000;
		double d = k; // int-> double 형변환
		System.out.println(d);
	}

}
