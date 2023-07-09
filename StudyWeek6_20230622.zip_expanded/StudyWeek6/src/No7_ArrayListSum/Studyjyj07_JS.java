package No7_ArrayListSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Studyjyj07_JS {
	   public static void main(String[] args) {

	      arrayListSum();

	   }
	   public static void arrayListSum() {
	      boolean go = true;
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String al="";
	      String[] aLS;
	      List<Integer> als = new ArrayList<>();
	      try {
	         while(go) {
	            System.out.print("저장시킬 정수를 입력하세요 (공백으로 구분) =>");
	            al = br.readLine();
	            aLS = al.split(" "); //split으로 쪼갠 요소들을 담을 String배열
	            als = new ArrayList<>(); //String 형변환해서 담을 List

	            for(int i = 0; i < aLS.length; i++) {
	               als.add(Integer.parseInt(aLS[i])); //담는 작업
	            }

	            int sum = 0;
	            for(Integer answer : als) { //list라서 향상된 포문으로 돌리기
	               sum += answer;
	            }
	            System.out.println("===================결과===================");
	            System.out.println("저장한 배열 값:"+als.toString());
	            System.out.println("배열에 있는 정수들의 합 : " + sum);
	            go = false;         
	         }
	      } catch (Exception e) {
	         System.out.println("***주의! 정수만 입력하세요, 다시 입력바랍니다***");
	         als.clear();
	         arrayListSum();
	      }
	   }
	}