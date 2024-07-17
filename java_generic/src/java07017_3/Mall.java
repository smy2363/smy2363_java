package java07017_3;

import java.util.ArrayList;

public class Mall {

	public static void main(String[] args) {
		
		ArrayList<Electronics> ele = new ArrayList<>();
		ArrayList<Clothing> clo = new ArrayList<>();
		
		ele.add( new Electronics("e23","전자렌지", 150000, "삼성전자") );
		ele.add( new Electronics("e25","가스렌지", 250000, "SK매직") );
		ele.add( new Electronics("e31","선풍기", 100000, "뭉크") );
		ele.add( new Electronics("e23","세탁기", 1500000, "LG") );
		clo.add( new Clothing("c23", "원피스", 230000, "L") );
		clo.add( new Clothing("c56", "바지", 230000, "M") );
		clo.add( new Clothing("c13", "치마", 230000, "S") );
		clo.add( new Clothing("c09", "티셔츠", 230000, "XL") );
		
		ShoppingCart shop = new ShoppingCart();
		

	}

}
