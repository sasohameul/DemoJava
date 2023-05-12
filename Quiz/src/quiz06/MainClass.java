package quiz06;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount cheol = new MyAccount();
		
		cheol.deposit(1000);
		cheol.withDraw(4500);
		System.out.println(cheol.getBalance());
		
	}
	
	
}
