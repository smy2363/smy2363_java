
package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book("B1234", "�ڹٿ�������", "�赿��") );
		book.add( new Book("C3241", "��ũ���", "�����") );
		book.add( new Book("G4123", "�̻�����å", "���") );
		dvd.add( new DVD("M3D232", "���ϸ���", "��ũ") );
		dvd.add( new DVD("M4G421", "�����̰��Ӹ����", "ġ��") );
		dvd.add( new DVD("M5F312", "����������", "�տ���") );
		
		
		// �뿩 �ϱ�
		Library lib = new Library();
		lib.addRental( book.get(0), "�̼���" );
		lib.addRental( dvd.get(2), "������" );
		lib.showRentalList();
		
		
//		Rental<DVD> rent = new Rental<>(dvd.get(1), "�̼���" );
//		System.out.println(rent);
//		
//		Rental<Book> brent = new Rental<>(book.get(1), "������" );
//		System.out.println(brent);
		
	}	

}
