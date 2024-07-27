package cafe;

public class Table {
	private int tableNumber;
	private boolean reserved;
	
	
	public Table(int tableNumber) {
		this.tableNumber=tableNumber;
		this.reserved=false;
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	
}
