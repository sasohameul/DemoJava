package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	
	public static void main(String[] args) {
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String 과 String의 자식들 전달가능
		//제네릭<? super String> = string 타입이 될 수 있다면 전달가능
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		add1(list1); // 무엇이든 
		add1(list2); // 다 
		add1(list3); // 받을 수 있음
		
		add2(list1);// string 가능
		add2(list2);// integer 불가능
		add2(list3);// object 불가능
		
		add3(list1); //string 가능
		add3(list2); //integer 불가능
		add3(list3); //object 가능
		
	}

	//
	public static void add1(List<?> list) {
		
	}
	
	public static void add2(List<? extends String> list) {
		
	}
	
	public static void add3(List<? super String> list) {
		
	}
	
	
	
	
	
}
