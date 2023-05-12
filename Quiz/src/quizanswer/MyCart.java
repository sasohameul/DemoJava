package quizanswer;

public class MyCart extends Cart {

	MyCart(int money){

		this.money = money;

		this.tv = 300;
		this.com = 400;
		this.radio = 500;

	}

	void buy(String product) {
		
			switch (product) {
			
			case "tv":
				
				if(this.money < 300) {
					System.out.println("금액이 부족합니다.");
					return; //함수 종료
				} else {
					
					this.money -= 300;
				}
				
				break;
				
			case "com":
				if(this.money < 400) {
					System.out.println("금액이 부족합니다.");
					return; //함수 종료
				} else {
				
				this.money -= 400;
			}
				
				break;
				
			case "radio":
				if(this.money < 500) {
					System.out.println("금액이 부족합니다.");
					return; //함수 종료
				} else {
					
					this.money -=500;
				}
				
				break;

			default:
				System.out.println("올바른 상품이 아닙니다.");
				return;
			}
			
			add(product); // 물품을 담는 함수로 전달
		}

	void add(String product) {
		
		if(i>=cart.length) { // 기존배열이 꽉 찬 경우
			
			//2배인 배열
			
			String[] newCart = new String[cart.length*2];
			
			//기존 배열의 값을 복사
			for(int i = 0; i < cart.length; i++) {
				
				newCart[i] = cart[i];
				
			}
			
			//배열 변경
			cart = newCart;
			newCart = null; //삭제
		}
		
		cart[i] = product;
		i++;
		
	}

	void info() {
		
		String str = "[";
		for(int j = 0 ; j < i; j++) {
			
			str +=cart[j];
		}
		
		str +="]";
		
		System.out.println(str);
		
	}

}




