package quiz06;

public class Account {

	//한 사람의 은행 계좌
	/*
	 * accountNumber 변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance 변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit : 반환유형 void - 잔고에 매개변수를 누적하는 기능
	 * withDraw: void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance: int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 * 
	 */
	
	String accountNumber;
	String password;
	int balance;
	
	 Account(){		 
	 }
	Account(String a, String b, int c ){
		
		accountNumber = a;
		password = b;
		balance = c;
					
	}
	
	 void deposit(int money) {
		//매개변수가 양수일 때만 가능하도록 변경
		
		 if(money > 0) {
			 
			 balance += money ; 
		 } else {
			 System.out.println("진짜 돈을 넣으세요");
		 }
		
	 }
		
	 void withDraw(int money) {
		//잔고가 0보다 클때만 출금이 가능하도록
		 
		 if(!(balance <= 0) && money <= balance) { 
			 
		balance -= money;
		 } else {
			 System.out.println("잔액이 부족합니다.");
		 }
				
	}
		
	int getBalance() {
		
		return balance;
		
	}
	
}
