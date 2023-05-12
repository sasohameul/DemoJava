package day01;

public class Operator05 {

	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 값을 발생시키는 기능
		//System.out.println( Math.random()); //1 미만의 랜덤한 double 값이 나옵니다.
		
		//1~10 까지의 랜덤한 값
		double d = Math.random() * 10;
		int a = (int)d + 1; //0~9 +1 -> 1~ 10
		System.out.println("1~10까지 랜덤수:"+a);
		
		//한번에 적으면?
		int result = (int) (Math.random() * 10) + 1;
		
		System.out.println(result); // 소괄호를 붙여주어야 캐스팅 연산자가아닌 math부터 계산이 됨.
		
		
		//삼항연산식
		//조건 ? 연산1 : 연산2
		
		 String s = result % 2 == 0 ? "짝수" : "홀수";
		 
		 System.out.println(result + "는" + s);
		
	
	
	
	
	}
	
	
}
