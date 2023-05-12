package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		/*
		 * 리스트와 반대 (순서 x, 중복 x)
		 * 
		 * =>인덱스 기준으로 조회하는 메소드가 없습니다.
		 * =>동일한 값을 저장하면, 들어가지 않습니다.
		 * 
		 * set계열 순회할 때는 향상된 for문, 반복자(iterator) 개념을 사용해야합니다.
		 * 
		 * HashSet 클래스
		 * TreeSet 클래스 (Set + 정렬)
		 * 
		 */
		
		//HashSet<String> set = new HashSet<>();
		 Set<String> set = new HashSet<>();
		
		//add()
		 set.add("java");
		 set.add("database");
		 set.add("spring");
		 set.add("jsp");
		 set.add("python");
		 set.add("java"); //중복은 허용하지않는다
		
		 //
		 System.out.println(set.toString());
		
		//크기
		System.out.println("크기:" + set.size());
		
		//삭제(값)
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 => 내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		for( String s : set ) {
			System.out.println(s);
		}
		
		System.out.println("=========================");
		//set => iterator 타입으로 변경 (다음이 있는지확인 후 전진할 것)
		Iterator<String> iter= set.iterator();
		
		while(iter.hasNext() ) { //다음이 있다면 true
			
			System.out.println(iter.next());
			
		}
	}

}
