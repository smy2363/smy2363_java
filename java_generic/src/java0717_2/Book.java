package java0717_2;

public class Book extends Media{
	
	private String author; // ������
	
	public Book(String id, String title, String author){
		super(id, title);
		this.author = author;
	}
	
	@Override
	public String toString() {
		return super.toString()+" , ���� :"+author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
