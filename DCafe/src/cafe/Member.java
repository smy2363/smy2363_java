package cafe;

public class Member {
	private String name; //고객 이름
	private String hpNumber; //고객 전화번호
	
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
