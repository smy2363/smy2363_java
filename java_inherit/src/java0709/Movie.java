package java0709;

public class Movie {
	//�ν��Ͻ������� �����ڴ� private
	private String title; //��ȭ����
	private String director; // ����
	private int viewAge; //���� ����
	
	public Movie() {}
	public Movie(String title, String director, int viewAge) { //�Ű����� �ִ� ������ �޼���
		this.title = title;
		this.director = director;
		this.viewAge = viewAge;
	}
	
	//��ü�� �ν��Ͻ������� �� ����ϱ� ���� �޼��� - java�� ��κ� Ŭ������ �������ִ�.
	@Override
	public String toString() {
		return title+", "+director+", "+viewAge;
	}
	
	
	// Ŭ������ ��ü���� �ν��Ͻ��� �����͸� �����ϴ� ���
	// set�޼��带 ���ؼ� ������ ����
	// ������ �޼���� �����͸� ����
	
	// private ������ �ν��Ͻ������� ���� get,set �޼��� ����
	// ������ Ŭ�� - source -> generate getters and setters Ŭ�� 
	// -> ��� ���� ���� -> generate Ŭ��
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
	
	
}