package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 * 
		 */
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		
		while(set.size() < 6) {
			
			
			int a = ran.nextInt(45) + 1;
			set.add(a);
			
		}
		
		System.out.println(set.toString());
		
		
//		TreeSet<Integer> number = new TreeSet<>();
//		
//		while(true) {
//			
//			int num = (int) (Math.random()*45 )+1;
//			number.add(num);
//			
//			if(number.size() ==6) {
//				
//				System.out.println(number.toString());
//				break;
//			}
//			
//		}
		
//		for(int i = 1; i <= 6; i++) {
//			
//			int num = (int) (Math.random()*45 )+1;
//			number.add(num);
//			
//		} for구문으로 돌리면 중복된 값이 나올때 저장이 안되기때문에 사용하면안됨
		
		
//		for(Integer num1 : number) {
//			System.out.println(num1);
//		}
		
		
	}
}
