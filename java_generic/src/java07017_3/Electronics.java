package java07017_3;

public class Electronics extends Product{
	
	private String brand;
	
	public Electronics(String id, String name, int price, String brand) {
		super(id, name, price);
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return super.toString()+" , �귣�� : "+brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
