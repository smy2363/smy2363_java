package cafe;

public class Drink {
	private String name; // 음료명
	private int price; // 금액
	
	public Drink(String name, int price) {
		this.name=name;
		this.price=price;
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
	
	

}
