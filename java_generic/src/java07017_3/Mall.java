package java07017_3;

public class Mall {

	public static void main(String[] args) {
		Electronics elec = new Electronics("E12001", "냉장고", 
				1702000, "삼성");
		Clothing clt = new Clothing("C12032", "바지",30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(  elec ,3 );// 상품과 수량
		shop.addCart( clt ,2 );
		
		shop.showCart();
	}

}