package study04.restaurant;

public class Drink extends Menu{


	private int size;

	public Drink() {

	}


	public Drink(int size) {

		this.size = size;
	}


	public Drink(String name, int size, int price) {

		super(name, price);
		this.size = size;

	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public void sell(int orderQuantity) {
		
		 int Tprice = orderQuantity * super.getPrice();

		System.out.println("음료 종류: "+ super.getName() + ", " + "사이즈(ml):" + this.size + ", "+ "주문량:"+ orderQuantity + ", " + "주문 가격:" + Tprice);

	}




}
