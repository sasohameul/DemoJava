package study03.Machine;

public class MainClass_Machine {

	public static void main(String[] args) {


		System.out.println("[AI 스피커 작동 확인]");
		/* 
		 * 1. AI 스피커 이름(자유 설정)과 배터리 양을 25로 하여 객체 생성
		 * 2. 전원 켜고, 배터리 양 확인
		 * 3. 전원이 꺼질 때까지 플레이리스트의 5가지 스타일 노래를 랜덤으로 재생시키기
		 * 4. 충전한 후, 전원 켜고 배터리 양 재확인하고 전원 끄기
		 */

		AISpeaker s = new AISpeaker("앵무새", 25);
		s.powerOn();
		s.MusicPlay(5);
		s.charge();
		s.powerOn();
		s.powerOff();

		//////////////////////////////////////////////////

		System.out.println("\n=======================================\n");
		System.out.println("[로봇 청소기 작동 확인]");
		/* 
		 * 1. AI 청소기 배터리 양을 10으로 하여 객체 생성
		 * 2. 전원 켜고, 배터리 양 확인
		 * 3. 전원이 꺼질 때까지 작동시키기
		 * 4. 충전한 후, 전원 켜고 배터리 양 재확인하고 전원 끄기
		 */

		AICleaner c = new AICleaner(10);
		c.powerOn();
		c.info();
		c.cleaning();
		c.charge();
		c.powerOn();
		c.info();
		c.powerOff();

	}

}
