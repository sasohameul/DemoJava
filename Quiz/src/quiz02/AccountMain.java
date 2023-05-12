package quiz02;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account bank = new Account("123-456","0104", 10000);
				
		bank.deposit(-8000); // 입금
		
		bank.withDraw(200); // 출금
		
		// int num = scan.nextInt();
		int balance = bank.getBalance();//잔고 확인
		System.out.println("최종 잔고:"+ balance);
	}

}
