package java0709_3;

interface RestCustomer{ //�Ĵ翡 ã�� ���� �մ�
	
	public void setCustomer(String customer);
	public String food();
}

class ReservCustomerA implements RestCustomer{
	String customer; // ���� �մ�

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" û���� �ش�";		
	}
} // ����մ� A
class ReservCustomerB implements RestCustomer{
	String customer; // ���� �մ�
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;		
	}

	@Override
	public String food() {
		return customer+" ������ �ش�";		
	}
} // ����մ� B



class Owner{ //����
	void food( RestCustomer cus ) {
		System.out.println( cus.food());
	}
}



public class Interface_test1 {

	public static void main(String[] args) {
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
	}

}

// ����
//  �ʵ��л�, ���л�, ����л�, ���л�

//  ��ȣ��, �˻�, �ҹ��, �ǻ� , ��ȭ��
// �̸�, ����, �ٹ���, ����, ����

// ����� ��û ó�� Ŭ����,  - ��Ʈ�� Ŭ����
// ����� ��û�� �ʿ��ѵ����� ������ ���� ����Ŭ����  - ���� Ŭ���� , �������̽�
// �����͸� ���� �ϴ� Ŭ���� - ����ڿ��� ������ ������ Ŭ���� - VO,DTO
//                      - �����ͺ��̽��� ������ ������ Ŭ���� - Entity
// �����ͺ��̽� ó�� �������̽� - repository
//