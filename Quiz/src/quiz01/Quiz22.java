package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	
	   public static void main(String[] args) {

	   
	      Scanner scan = new Scanner (System.in);
	      
	      int r = 0;
	      int w = 0;
	      
	      String[] arr = {"+","-"};
	      
	      
	      while(true) {
	         int a = (int)((Math.random()*100) + 1);
	         int b = (int)((Math.random()*100) + 1);
	         int c = (int)(Math.random()*2);

	         /*
	          * int c = (int)(Math.random()*2);
	          * System.out.println( a + " " + (oper == 0 ? " + " : " - ") + " " + b + "=" + "?");
	          * 3항 연산식으로도 만들 수 있다 
	          * int 
	          */
	         
	         
	         
	         System.out.println( a + " " + arr[c] + " " + b + "=" + "?");
	         System.out.println("문제를 그만푸시려면 0을 입력하세요");
	         
	         System.out.print(">");
	         int answer = scan.nextInt();
	         
	         if (answer == 0){
	            System.out.println("종료");
	            System.out.println("정답" + r);
	            System.out.println("오답" + w);
	            break;
	         }
	      
	         
	         if(a+b == answer || a-b ==answer) {
	            System.out.println("정답입니다");
	            
	            r++;
	            
	         }else if(a+b != answer || a-b !=answer) {
	            System.out.println("틀렸는데요?");
	            
	            w++;
	         }
	         
	         
	         
	      }
	      
	   
	}
}


