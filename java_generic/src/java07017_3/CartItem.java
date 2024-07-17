package java07017_3;

public class CartItem<T extends Product> {
	private T item;
	private int quantity;
	
	public CartItem(T item, int quantity) {
		this.item = item;
		this.quantity =quantity;
	}
	
	@Override
	public String toString() {
		return "상품 : "+item+", 수량 : "+quantity;
	}
	
	
	public T getItem() {
		return this.item;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	

}
