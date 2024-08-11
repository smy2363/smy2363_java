package LibrayLental;


public class Book {
	
	private String title; //å ����
	private String author; // å �۰�
	private int code; // å �ڵ�
	private boolean rental; //�뿩����
	
	public Book(String title, String author, int code, boolean rental) {
		this.title = title;
		this.author = author;
		this.code = code;
		this.rental = false;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public boolean isRental() {
		return rental;
	}
	public void setRental(boolean rental) {
		this.rental = rental;
	}
	
	
	

}

