package study03.animal;

public class Cat extends Animal {


	public Cat(String sound) {
		super(sound);
	}

	
	@Override
	public void makeSound() {
		
		System.out.println(super.getSound() + "~ 동물 소리를 재생합니다.");
		System.out.println("야옹이는 야옹");
	}


	public String getSound() {
		return super.getSound();
	}


	public void setSound(String sound) {
		
	}
	
	
	
	
	
}
