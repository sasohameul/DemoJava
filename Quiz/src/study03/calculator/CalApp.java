package study03.calculator;

import java.io.*;
import java.util.Scanner;

public class CalApp {

	public static void main(String[] args) {

		//각 클래스 객체 생성
		Add a = new Add();
		Div d = new Div();
		Mul m = new Mul();
		Sub s = new Sub();

				//q라는 문자를 입력받기 전까지 계속 반복하기 위해 while(true)구문 사용
				Scanner scan = new Scanner(System.in);
		
				while(true) {
		
		
					//공백 포함 문자열 받기 위해 nextLine사용
					System.out.print(">>");
					String n = scan.nextLine();
					//공백있을때와, 없을때의 조건을 같게 하기위해 공백 제거해주고 시작
					String n1 = n.replace(" ", "");
		
					if(n1.contains("+")) {
						//char타입으로 받으면 숫자로 출력하려면 -48해야함.
						a.setValue(n1.charAt(0)-48, n1.charAt(2)-48);
						System.out.println(">>" + a.calculate()); 
		
					} else if(n1.contains("/")) {
		
						d.setValue(n1.charAt(0)-48, n1.charAt(2)-48);
						System.out.println(">>" + d.calculate());  
		
					} else if(n1.contains("*")) {
		
						m.setValue(n1.charAt(0)-48, n1.charAt(2)-48);
						System.out.println(">>" + m.calculate());
		
					} else if(n1.contains("-")) {
		
						s.setValue(n1.charAt(0)-48, n1.charAt(2)-48);
						System.out.println(">>" + s.calculate());
		
					} else if(n1.equals("q")){
		
						System.out.println("종료합니다.");
						break;
		
					} else {
		
						System.out.println("알 수 없는 연산입니다.");
					}
		
				}
				scan.close();
		
		
		
			}
		
		
		}

//		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
//
//			while(true) {
//				System.out.print(">>");
//				String n = br.readLine();
//
//				String n1  = n.replace(" ", "");
//
//				if(n1.contains("+")) {
//					a.setValue(n1.charAt(0) - '0', n1.charAt(2) - '0');
//					System.out.println(">>" + a.calculate()); 
//
//				} else if(n1.contains("/")) {
//
//					d.setValue(n1.charAt(0) - '0', n1.charAt(2) - '0');
//					System.out.println(">>" + d.calculate());  
//
//				} else if(n1.contains("*")) {
//
//					m.setValue(n1.charAt(0) - '0', n1.charAt(2) - '0');
//					System.out.println(">>" + m.calculate());
//
//				} else if(n1.contains("-")) {
//
//					s.setValue(n1.charAt(0) - '0', n1.charAt(2) - '0');
//					System.out.println(">>" +s.calculate());
//
//				} else if(n1.equals("q")){
//
//					System.out.println("종료합니다.");
//					break;
//
//				} else {
//
//					System.out.println("알 수 없는 연산입니다.");
//				}
//
//
//			} 
//
//
//		} catch (IOException e){
//
//			e.printStackTrace();
//
//		}
//
//	}
//
//}

