package study03.animal;

public class Animal {

	/*문제:
	 * 
	 * 동물들의 소리를 흉내내는 앱을 개발하려고 합니다. 
	 * 이 앱은 다양한 동물들의 소리를 재생하고자 합니다.
	 * 
	 * 문제의 요구사항:
	 * 
	 * Animal 클래스에는 소리를 출력하는 makeSound()메소드를 만들어주세요
	 * Cat 클래스에는 "아옹이는 야옹"이라는 문자열을 출력하는 makeSound() 메서드를 오버라이드하여 추가하세요. 
	 * 이때, sound 속성에는 다른 개발자가 직접 접근하지 못하도록 설정하고, 
	 * Animal 클래스의 생성자를 통해 각 동물의 소리를 초기화합니다.
	 * 
	 * Duck 클래스에는 "오리는 꽥꽥"이라는 문자열을 출력하는 makeSound() 메서드를 오버라이드하여 추가하세요. 
	 * 이때, sound 속성에 다른 개발자가 직접 접근하지 못하도록 설정해주세요.
	 * Animal 클래스의 생성자를 통해 각 동물의 소리를 초기화합니다.
	 * 
	 * Main 클래스를 만들고, Cat과 Dog 객체를 생성한 후 각각의 makeSound() 메서드를 호출하여 동물 소리를 출력하세요.
	 * 
	 *  
	 *  
	 */

	private String sound;

	public Animal(String sound) {

		this.sound = sound;
	}

	public void makeSound() {

		System.out.println(this.sound + " 동물 소리를 재생합니다.");

	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}




}
