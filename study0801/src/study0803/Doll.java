package study0803;

public class Doll {
	
	static String factory; //클래스변수 (제조공장)
	String name; // 인형이름
	String gender; //이름 성별
	
	void info() {
		System.out.println("factory" + factory);
		System.out.println("name: " + name);
		System.out.println("gender:" + gender);
		
	}
}
