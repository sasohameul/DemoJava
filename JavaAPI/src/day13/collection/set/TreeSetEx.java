package day13.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//set + 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(200);
		set.add(1);
		set.add(20);
		set.add(34);
		set.add(40);
		//오름차순으로 출력됨
		System.out.println(set.toString());
		
		for(int a : set ) {
			
			System.out.println(a);
			
		}
		
		
		
		
		
	}
	
}
