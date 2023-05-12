package quiz12;

public class Product {

	private String name;
	
	
	
	public Product(int price, String name) {
		
		this.price = price;
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price;
	
	
	
	
}
