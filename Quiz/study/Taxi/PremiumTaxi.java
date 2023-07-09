package study04.Taxi;

public class PremiumTaxi extends Taxi implements Meter{


	@Override
	public void start() {

		System.out.println("프리미엄 운행을 시작합니다.");
	}


	public void drive(int distance) {
		
		//주행 시 200m 마다 발생할 수 있는 랜덤 경우의 수가 총 3가지가 있으며  
       //경우의 수에 따라 거리가 줄 수도 늘어날 수도 있습니다. 
       //목적지까지 도착하면 stop 메소드가 실행됩니다.

		//0값인 distance 초기화
		this.distance = distance;
		
		//200미터 마다, interval만큼 경우의 수를 만나게끔
		int interval = distance / 200;

		for(int i = 0; i < interval; i++) {

			int light = (int)(Math.random() * 3 ) +1;

			switch (light) {
			
			//1번 케이스는 초록불이므로 아무 영향이 없고
			case 1:

				System.out.println("운 좋게 초록불! 슝슝 갑니다.");

				break;
				
			//2번 케이스는 빨간불로 그냥 운행 거리 50m가 줄어듭니다.
			case 2:
					//음수가 나올 수 있으므로
				 if((this.distance)-50 > 0) {
					
					this.distance -= 50;
					System.out.println("손님, 빨간불입니다. 꽉 잡으세요. ");
				}
					
				break;
				
			 //3번 케이스는 교통사고가 났지만 프리미엄 혜택으로 200m만 늘어납니다
			case 3:

				this.distance += 200;

				System.out.println("교통사고가 났습니다. 최대한 빨리 모시겠습니다~");

				break;

			default:
				break;
			}
		}
		//운행 종료와 동시에 요금 계산
		stop();

	}

	@Override
	public void stop() {

		//(총 요금 = 기본 요금 + 100m당 1200원)
		int fare = PREMIUM_FARE + (this.distance / 100) * 1200;

		System.out.println("프리미엄 운행을 종료합니다. 요금은 " + fare + "원 입니다.");
		System.out.println("총 운행 시간: " +  this.distance / 100  + "분");
		System.out.println("총 운행 거리: " + distance + "m");

	}


}
