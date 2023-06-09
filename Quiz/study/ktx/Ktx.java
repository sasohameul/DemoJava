package study03.ktx;

public class Ktx {

	/*
	 * 1. Ktx를 상속받는 SuperKtx 클래스가 있습니다.
	 * 2. speed가 50씩 상승하며 달립니다.
	 * 3. 최대 속도는 300입니다.
	 * 4. Ktx의 메소드 하나를 오버라이드 해서 고속으로 달린다는 문구를 출력해봅시다.
	 *
	 */

	int speed;
	
	public Ktx() {

	}

	void departure() {

		System.out.println("열차가 출발합니다.");
		System.out.println("현재 속도 : " + speed);
	}

	void run() {

		if(speed >= 0 && speed < 300) {

			speed +=50;

			System.out.println("현재 속도: "  + speed );

		} else if (speed >= 300) {

			System.out.println("최고 속도 300이상이므로 더 이상 달릴 수 없습니다.");

			return;
		}

	}

	void arrival() {

		System.out.println("열차가 곧 역에 도착합니다.");
	}

}
