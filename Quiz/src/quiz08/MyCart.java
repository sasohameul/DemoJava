package quiz08;

public class MyCart extends Cart {

	//1. 생성자는 money를 전달받고 money값 초기화, tv = 300원, com = 400, radio = 500;
	
	//2. buy(), add(), info(); 메서드 오버라이드
	
	/*
	 * 상품명은 "tv", "com","radio"로 한정한다.
	 * 
	 * buy(상품명) 기능
	 * 매개변수가 tv,com,radio라면 금액에서 상품가격을 차감하고,add()메서드를 실행합니다.
	 * 
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리를 해주세요.
	 * 
	 */
	
	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼으면, 2배 크기의 카트배열로 옮겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	
	/*
	 * info() 메서드는 
	 * cart배열에 담긴 물건 목록만 (null 제외: Arrays.toString 사용금지) 출력해주세요.
	 * 
	 */


	MyCart(int money){

		int tv = 300;
		int com = 400;
		int radio = 500;
		
		this.money = money;

	}

	void buy(String product) {
		
		switch (product) {
		
		case "tv":
			
			this.money -= tv;
			
			
		case "com":
			
			this.money -= com;
			
		case "radio":
			
			this.money -= radio;
			

		default:
			
			System.out.println("재정의 하세요");
			break;
		}
		}


	void add(String product) {
		
		String []cart = {};
		
		System.out.println("재정의 하세요");
	}

	void info() {
		System.out.println("재정의 하세요");
	}

}




