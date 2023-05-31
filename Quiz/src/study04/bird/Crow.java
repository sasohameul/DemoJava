package study04.bird;

public class Crow extends Bird{


	@Override
	public void fly() {

		System.out.println( "까마귀(" + super.getName() + ")가 날아다닙니다.");

	}

	@Override
	public void showName() {

		System.out.println("까마귀의 이름은" + super.getName()+ "입니다.");
	}

	@Override
	public void sing() {

		System.out.println( "까마귀(" + super.getName()+ ")가 소리내어 웁니다.");

	}

	public String getName() {

		return super.getName();

	}

	public void setName(String name) {

		super.setName(name); 

	}
	
}