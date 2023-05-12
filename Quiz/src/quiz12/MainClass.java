package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart basket = new MyCart(1900);
		
		Radio r = new Radio(); // 300, 꿈꾸라
		Tv t = new Tv(); 
		Computer c = new Computer(); 
		
		basket.buy(t);
		basket.buy(t);
		basket.buy(c);
		basket.buy(r);
		basket.buy(r);
		basket.buy(r);
		
		basket.info();
		
//		r.setPrice(10000); //값 바꾸기
//		System.out.println(r.getPrice());
//		System.out.println(r.getName()); 
	}
	
}
