package cafe;

public class Member {
	private String name; //�� �̸�
	private String hpNumber; //�� ��ȭ��ȣ
	
	public Member(String name, String hpNumber) {
		this.name=name;
		this.hpNumber=hpNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHpNumber() {
		return hpNumber;
	}
	public void setHpNumber(String hpNumber) {
		this.hpNumber = hpNumber;
	}
	
	

}
