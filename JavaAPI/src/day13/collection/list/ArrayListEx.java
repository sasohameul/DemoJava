package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * => 배열기반
		 * => 순서 O, 중복 O
		 * 
		 */
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list 추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//길이 확인 size()
		System.out.println(list.size());
		
		//중간에 추가 add()
		list.add(0, "0번째 추가");
		System.out.println( list.toString() );
		
		//값의 확인 get
		String n = list.get(3); //배열기반이어서 제거해주지는않음. 길이는 그대로 6
		System.out.println(n); 
		
		//값의 수정 set()
		list.set(4, "수정할값");
		System.out.println(list.toString());
		
		//값의 제거 remove() 인덱스 혹은 문자열로 지정해서 제거가능
		list.remove(0);
		list.remove("신사임당");
		System.out.println( list.toString());
		
		//값의 여부 contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		}
		
		//빈 리스트의 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		} else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		//모든 요소를 전부 삭제 clear()
		list.clear();
		System.out.println(list.toString());
		
		System.out.println("------------------");
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들이 전달가능
		//제네릭<? super String> = String 타입이 될 수 있다면 전달가능
		
		
		List<String> list2 = Arrays.asList("a", "b", "c", "d");
		System.out.println(list2.toString());
		
		//리스트를 병합
		list.addAll(list2);
		System.out.println(list.toString());
		// list.addAll(0, list2) 원하는 위치에 넣을 수 있는 메서드
		
		
		
		
		
		
		
	}
	
}

