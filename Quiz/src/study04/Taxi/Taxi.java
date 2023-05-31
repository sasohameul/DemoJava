package study04.Taxi;

public class Taxi implements Meter {

	int distance = 0;
	
	@Override
	public void start() {

		System.out.println("운행을 시작합니다.");
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
			case 1:

				System.out.println("운 좋게 초록불! 슝슝 갑니다.");

				break;
			case 2:

				this.distance += 50;

				System.out.println("아이고..빨간불이네.. 손님, 요금이 쫌 늘어납니다.");

				break;
			case 3:

				this.distance += 500;

				System.out.println("교통사고가 났습니다 ㅠㅠ 돌아가서 시간이 지체됩니다.");

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
		int fare = BASE_FARE + ((this.distance / 100) ) * 1000;

		System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
		System.out.println("운행 시간: " + (this.distance / 100) + "분");
		System.out.println("총 운행 거리: " + distance + "m");

	}


}
