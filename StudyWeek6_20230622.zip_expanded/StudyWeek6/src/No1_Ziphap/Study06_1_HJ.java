package No1_Ziphap;

import java.util.ArrayList;

public class Study06_1_HJ {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		ArrayList<Integer> inter = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();
		ArrayList<Integer> diff = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list1.add(i);
			union.add(i);
			diff.add(i);
		}
		for(int j = 3; j <= 11; j += 2) {
			list2.add(j);
			union.add(j);
			if(diff.contains(j)) diff.remove(Integer.valueOf(j));
		}
		
		for(int n : list1) {
			for(int x : list2) {
				if(n == x) {
					inter.add(n);
					union.remove(Integer.valueOf(n));
				}
			}
		}
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("교집합=" + inter);
		System.out.println("차집합=" + diff);
		System.out.println("합집합=" + union);
		
	}
}
