package LibrayLental;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String memberId; //ȸ�� ���̵�
	private String name;	// �̸�
	private String phoneNumber; // ��ȭ��ȣ
	private List<Book> rentalBooks; //�뿩���� å��
	
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
