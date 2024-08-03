package LibrayLental;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String memberId; //회원 아이디
	private String name;	// 이름
	private String phoneNumber; // 전화번호
	private List<Book> rentalBooks; //대여중인 책들
	
	public Member(String memberId, String name, String phoneNumber){
		this.memberId = memberId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rentalBooks = new ArrayList<>();
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Book> getRentalBooks() {
		return rentalBooks;
	}

	public void setRentalBooks(List<Book> rentalBooks) {
		this.rentalBooks = rentalBooks;
	}
	
	

	

}
