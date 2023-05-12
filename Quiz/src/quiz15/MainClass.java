package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		IBag b = new WhatsInMyBag();

		b.insert("립스틱");
		b.insert("로션");
		b.insert("거울");
		b.insert("머리끈");
		b.print();
		System.out.println(b.search("머리끈"));
		System.out.println(b.search("거울"));
		System.out.println(b.search("시계"));
		b.print();
		System.out.println("삭제?:" + b.delete("거울"));
		b.print();
		
		
		
		
	}
	
}

