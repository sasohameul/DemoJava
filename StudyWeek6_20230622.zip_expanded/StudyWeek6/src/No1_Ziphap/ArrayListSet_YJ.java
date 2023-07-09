package No1_Ziphap;

import java.util.ArrayList;

public class ArrayListSet_YJ {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		for(int i = 1; i <= 10; i++) {

			list1.add(i);

		}

		System.out.println("list1= " + list1);

		ArrayList<Integer> list2 = new ArrayList<>();

		for(int i = 3; i <= 11; i+=2) {

			list2.add(i);

		}

		System.out.println("list2= " + list2);

		//교집합 메서드
		list1.retainAll(list2);
		System.out.println("교집합= " + list1.toString());

		ArrayList<Integer> alist = new ArrayList<>();

		for(int i = 1; i <= 10; i++) {

			alist.add(i);

		}



		ArrayList<Integer> blist = new ArrayList<>();

		for(int i = 3; i <= 11; i+=2) {

			blist.add(i);

		}

		//차집합 메서드
		alist.removeAll(blist);
		System.out.println("차집합= "+alist.toString());


		ArrayList<Integer> clist = new ArrayList<>();

		for(int i = 1; i <= 10; i++) {

			clist.add(i);

		}



		ArrayList<Integer> dlist = new ArrayList<>();

		for(int i = 3; i <= 11; i+=2) {

			dlist.add(i);

		}


		//합집합 메서드
		clist.addAll(dlist);
		System.out.println("합집합= "+clist.toString());

















	}






}
