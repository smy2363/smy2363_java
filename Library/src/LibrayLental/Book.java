package LibrayLental;


public class Book {
	
	private String title; //책 제목
	private String author; // 책 작가
	private int code; // 책 코드
	private boolean rental; //대여여부
	
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

