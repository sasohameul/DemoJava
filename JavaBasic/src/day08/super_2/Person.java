package day08.super_2;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		
		this.name = name;
		this.age = age;
		
//		System.out.println(this); //주소값: 나 자신을 나타냄
	}
	
	Person(String name){
		
		this(name, 1);
		
//		this.name = name;
//		this.age = 1;
//		System.out.println(this); //주소값: 나 자신을 나타냄
	}
	
	Person(){
		
		this("이름없음", 1);
		
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println(this); //주소값: 나 자신을 나타냄
	}

	String info () {
		
		return "이름:" + name + ", 나이:" + age;
		
	}

}
