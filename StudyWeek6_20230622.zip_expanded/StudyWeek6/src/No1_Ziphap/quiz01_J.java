package No1_Ziphap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class quiz01_J {

	public static void main(String[] args) {
		/*
		 * ArrayList를 이용하여 
		   두 정수 집합 {1~10} , {3,5,7,9,11}의 교집합, 차집합, 합집합을 구하세요.
		 */

				
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));				
		System.out.println("list1=" + list1.toString());
				
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,7,9,11));	
		System.out.println("list2=" + list2.toString());


		List<Integer> intersect = new ArrayList<>(list1);		
		intersect.retainAll(list2);		
		System.out.println("교집합=" + intersect.toString());	
		
		
		List<Integer> difference = new ArrayList<>(list1);
		difference.removeAll(list2);		
		System.out.println("차집합=" + difference.toString());
		
		
		List<Integer> union = new ArrayList<>(list1);
		union.addAll(list2);		
		System.out.println("합집합=" + union.toString());
	
			
	}

}
