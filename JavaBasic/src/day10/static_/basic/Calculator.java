package day10.static_.basic;

public class Calculator {

	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static을 붙이면 좋습니다.
	 * 
	 * 객체마다 다른 값을 가져야하면 일반 변수,
	 * 객체마다 동일한 값을 가져야하면 static 변수가 됩니다.
	 * 
	 */
	
	public String color;
	public static double pi = 3.14;
	
	/*
	 * <메서드>
	 * 일반 멤버변수를 사용하는 메서드는 static이면 안됩니다. (getter/setter)
	 * 
	 * 일반 멤버변수를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메서드는 static이면 좋습니다.
	 * 
	 */
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public static double circle(int r) {
		
		return r * r * Math.PI;
	}
	
	
	
	
}
