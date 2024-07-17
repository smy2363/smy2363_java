
package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book("B1234", "자바완전정복", "김동형") );
		book.add( new Book("C3241", "뭉크모모", "고양이") );
		book.add( new Book("G4123", "이상적인책", "모모") );
		dvd.add( new DVD("M3D232", "포켓몬스터", "뭉크") );
		dvd.add( new DVD("M4G421", "지렁이게임만들기", "치즈") );
		dvd.add( new DVD("M5F312", "웹툰모음집", "뿜여사") );
		
	}	

}
