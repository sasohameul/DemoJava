package No5_NumOrChar;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Studyljh05_JS {
	   public static void main(String[] args) {

	      /*
	       *  문자나 숫자를 10번 입력할때 만약 중복값이면 "중복값입니다"를 출력하고 새로 입력 받아주세요.
	         (TreeSet을 이용합니다.)
	       */

	      Scanner scan = new Scanner(System.in);
	      Set<Integer> sNum = new TreeSet<>();
	      Set<String> sStr = new TreeSet<>();

	      while(true) {
	         System.out.println("숫자나 문자를 10번 입력해주세요");
	         System.out.println("1.숫자 2.문자 3.종료");
	         int menu = scan.nextInt();

	         if(menu == 1) {
	            System.out.println("숫자를 입력해주세요.");
	            while(sNum.size() < 10) {
	               if (sNum.add(scan.nextInt()) == true) {
	                  
	               } else {      
	                  System.out.println("중복값입니다. 숫자를 다시 입력해주세요.");
	                  
	               }
	            }
	            System.out.println(sNum);   
	         } else if (menu == 2) {
	            System.out.println("문자를 입력해주세요.");
	            while(sStr.size()<10) {
	               if (sStr.add(scan.next()) == true) {

	               } else {
	                  System.out.println("중복값입니다. 문자를 다시 입력해주세요.");
	               
	               }
	            }
	            System.out.println(sStr);
	         } else if (menu == 3) {
	            return;
	         }
	      }
	   }
	}
