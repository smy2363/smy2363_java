package study0803;

public class Student {
		
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//인스턴스 메소드
	
	public void info() {
		System.out.println("이름: "+name+", 점수: "+score);
	}
	
	// 클래스 메소드
	public static int sum(int score1, int score2) {
		return score1 + score2;
	}
	
	
	
}
