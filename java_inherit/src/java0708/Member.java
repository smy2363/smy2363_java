package java0708;

public class Member {
	
	private int id; // member_id �÷�
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private int std_avg;
	// ������Ŭ�� ->source->generate getters and setters
	// ���� ��ü Ŭ�� -> generate��ư Ŭ��
	
	public Member() {}
	// ����� �Է¿� ������ �޼���
	public Member(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	// ������ ���̽����� ������� ������ ����� ������ �޼���
	public Member(int id, String name, int kor, int eng, int mat,
			int total, int std_avg) {
		this(name,kor,eng,mat);
		this.id=id;
		this.total=total;
		this.std_avg=std_avg;
	}
	
	@Override
	public String toString() {
		return "["+id+","+name+","+kor+","+eng+","+mat+","
				+total+","+std_avg+"]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStd_avg() {
		return std_avg;
	}
	public void setStd_avg(int std_avg) {
		this.std_avg = std_avg;
	}
	
	
	
}	
