package day01;

public class DataType {

	public static void main(String[] args) {
		
		//정수형 타입
		byte a = 127;
		byte a1= -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123L; // 롱타입임을 알려주어야하므로 뒤에 L을 붙여야한다.
				
		//2진수, 8진수, 16진수
		int bin = 010; // 8진수는 앞에 0을 붙임
		System.out.println("8진수 010은:" + bin + "입니다.");
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은:" + bin2);
		
		int hexa = 0xA9; //16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9는:" + hexa);
		
		System.out.println("-----------------------");
		
		//실수형 타입
		float f1 = 3.14F; // float임을 나타내는 F를 붙여야한다.
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.145921231234F; // 7자리까지 유효함
		double d2 = 3.141592123123; // 15자리까지 유효함 (기본형)
		
		System.out.println(f2);
		System.out.println(d2);
		
		//논리형 타입 (true, false만 저장 가능함)
		boolean boo11 = true;
		boolean boo12 = false;
		
		System.out.println(boo11);
		System.out.println(boo12);
	}
}
