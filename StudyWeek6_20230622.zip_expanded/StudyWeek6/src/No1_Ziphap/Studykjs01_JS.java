package No1_Ziphap;

import java.util.ArrayList;

public class Studykjs01_JS {
		public static void main(String[] args) {
		      	 ArrayList<Integer> list1 = new ArrayList<>();
		         ArrayList<Integer> list2 = new ArrayList<>();
		         ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
		         ArrayList<Integer> cha = new ArrayList<>(); // 차집합
		         ArrayList<Integer> hap = new ArrayList<>(); // 합집합
		         
		         //list1 만들기
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
		         
		         //list2 만들기
		         for(int i = 3; i <=12; i+=2) {
		         list2.add(i);
		         }
		         
		         kyo.addAll(list1); // list1를 kyo 에 저장
		         kyo.retainAll(list2); // list2와 kyo 공통된것들을 남기고 모두 삭제
		         
		         cha.addAll(list1); // list1를 cha 에 저장
		         cha.removeAll(list2); // cha와 list2에서 공통된 요소들을 모두 삭제
		         
		         hap.addAll(list1); // list1를 hap 에 저장
		         hap.removeAll(kyo); // hap과 kyo에서 공통된 모든 요소를 삭제
		         hap.addAll(list2); // list2를 hap 에 저장
		         
		         System.out.println("list1="+list1);
		         System.out.println("list2="+list2);
		         System.out.println("교집합="+kyo);
		         System.out.println("차집합="+cha);
		         System.out.println("합집합="+hap);
		      }
		   }