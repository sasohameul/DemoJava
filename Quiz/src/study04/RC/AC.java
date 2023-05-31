package study04.RC;

public class AC implements RC{
	
	private int temperature = 24;

//	설정온도 18도인 상태에서 down()을 실행하면 "더이상 설정 온도를 낮출수 없습니다." 출력
//	설정온도 30도인 상태에서 up()을 실행하면 "더이상 설정 온도를 낮출 수 없습니다." 출력
//
//	그외에는 올리고 내리는 상황에 맞춰서 아래와 같이 출력해주세요.


	public void on() {
			System.out.println("에어컨을 켭니다.");
		}

	@Override
	public void up() {
		
		temperature++;		
		
		if(temperature > 30) {
			
			System.out.println("더 이상 설정 온도를 높일 수 없습니다.");
		} else {
			
			System.out.println("에어컨 온도 올리기 : " + this.temperature);
		}
		
	}

	@Override
	public void down() {
		
		temperature--;

		if(temperature < 18) {
			
			System.out.println("더 이상 설정 온도를 낮출 수 없습니다.");			
			
		} else {
		
		System.out.println("에어컨 온도 낮추기 : " + this.temperature);
		
		}
	}
	
}
