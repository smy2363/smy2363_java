package cafe;

public class Reservation {
	private String time; // ����ð�
	private int tableNumber; // ���̺� ��ȣ
	private String drinkPick; // ���� ����
	private String phoneNumber; // �� ��ȭ��ȣ
	private boolean pay; // ���� ����
	
	public Reservation(String time, int tableNumber, String drinkPick, String phoneNumber, boolean pay) {
		this.time=time;
		this.tableNumber=tableNumber;
		this.drinkPick=drinkPick;
		this.phoneNumber=phoneNumber;
		this.pay=pay;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String getDrinkPick() {
		return drinkPick;
	}
	public void setDrinkPick(String drinkPick) {
		this.drinkPick = drinkPick;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public Reservation get(String phoneNumber2) {
		
		return null;
	}
}
