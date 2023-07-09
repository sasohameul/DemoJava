package study03.parents;

public class MainClass_Parents {

	public static void main(String[] args) {
		
		Parents p = new Parents(4,5);
		System.out.println(p.method1());
		
		
		System.out.println("-------------");
		Child01 c1 = new Child01();
		System.out.println(c1.method1());
		
		System.out.println("-------------");
		Child02 c2 = new Child02();
		System.out.println(c2.method2(4, 2));
		
		
		System.out.println("-------------");
		Child03 c3 = new Child03();
		System.out.println(c3.method04("안녕","하세요"));
		System.out.println(c3.method04(5, 7));
		System.out.println(c3.method3(3, 3));
		
		
		
		
		
	}
	
	
}
