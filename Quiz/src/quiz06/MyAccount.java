package quiz06;

import java.util.Scanner;

public class MyAccount extends Account {
	

	MyAccount(){

		accountNumber = "123-123";
		password = "0104";
		balance = 5000;

	}

	void withDraw(int money) {
		//잔고가 0보다 클때만 출금이 가능하도록

		Scanner scan = new Scanner(System.in);
		String pw = scan.next();		
				
		if(pw.equals(password)) {
			if(!(balance <= 0) && money <= balance) { 

				balance -= money;
				System.out.println("출금처리 되었습니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			} 

		} else {
			System.out.println("비밀번호를 다시 확인해주세요");
		}

	}




}
