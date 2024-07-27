package cafe;

public class Reservation {
	private String time; // 예약시간
	private int tableNumber; // 테이블 번호
	private String drinkPick; // 음료 선택
	private String phoneNumber; // 고객 전화번호
	private boolean pay; // 결제 여부
	
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
