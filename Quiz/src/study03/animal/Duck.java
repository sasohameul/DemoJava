package study03.animal;

public class Duck extends Animal{


	public Duck(String sound) {
		super(sound);
	}


	@Override
	public void makeSound() {

		System.out.println(super.getSound() + "~ 동물 소리를 재생합니다.");
		System.out.println("오리는 꽥꽥");

	}

	public String getsound() {
		return super.getSound();
	}

	public void setsound(String sound) {
	}



}
