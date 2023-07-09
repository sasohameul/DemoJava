package No1_Ziphap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//ArrayList를 이용하여 두 정수 집합 {1~10} , {3,5,7,9,11}의 교집합, 차집합, 합집합을 구하세요.

public class study1_JH {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(7);
		list2.add(9);
		list2.add(11);

		ArrayList<Integer> answer1 = new ArrayList<>(); //교집합을 나타낼 어래이리스트 만듭니다.
		for (int i = 0; i < list1.size(); i++) { //리스트1의 사이즈만큼 반복을 돌려줍니다.
		    if (list2.contains(list1.get(i))) {//리스트2가 리스트1의 i번째와 일치한다면
		        answer1.add(list1.get(i));//정답리스트에 i번쨰 숫자를 넣습니다.
		    }
		}
		ArrayList<Integer> answer2 = new ArrayList<>(list1);//차집합을 나타낼 어래이리스트에 list1을 넣고 만들어줍니다.
		answer2.removeAll(list2);//answer2에서 list2에 있는 값을 지웁니다.
		
		ArrayList<Integer> answer3 = new ArrayList<>();//합집합 리스트를 만듭니다.
		answer3.addAll(answer2);//정답 리스트에 차집합 리스트를 넣고
		answer3.addAll(list2);//리스트 2를 넣어줍니다.

		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
	}

}
