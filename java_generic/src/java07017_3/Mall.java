package java07017_3;

import java.util.ArrayList;

public class Mall {

	public static void main(String[] args) {
		
		ArrayList<Electronics> ele = new ArrayList<>();
		ArrayList<Clothing> clo = new ArrayList<>();
		
		ele.add( new Electronics("e23","���ڷ���", 150000, "�Ｚ����") );
		ele.add( new Electronics("e25","��������", 250000, "SK����") );
		ele.add( new Electronics("e31","��ǳ��", 100000, "��ũ") );
		ele.add( new Electronics("e23","��Ź��", 1500000, "LG") );
		clo.add( new Clothing("c23", "���ǽ�", 230000, "L") );
		clo.add( new Clothing("c56", "����", 230000, "M") );
		clo.add( new Clothing("c13", "ġ��", 230000, "S") );
		clo.add( new Clothing("c09", "Ƽ����", 230000, "XL") );
		
		ShoppingCart shop = new ShoppingCart();
		

	}

}
