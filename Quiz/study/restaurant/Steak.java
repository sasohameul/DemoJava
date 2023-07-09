package study04.restaurant;

public class Steak extends Menu {

	private int perGram;
	
	public Steak() {
		
		super();
	}

	public Steak(int perGram) {
		
		this.perGram = perGram;
		
	}
	
	public Steak(String name, int perGram, int price) {

		super(name,price);
		this.perGram = perGram;
	}


	public int getPerGram() {
		return perGram;
	}

	public void setPerGram(int perGram) {
		this.perGram = perGram;
	}


	public void sell(int orderQuantity) {
		
		int Tprice = orderQuantity * super.getPrice();
		
		System.out.println("스테이크 종류: "+ super.getName() + ", " + "1인분 무게(g):" + this.perGram + ", " + "주문량:"+ orderQuantity + ", "+ "주문 가격:" + Tprice);
		
	}




}
