package study0803;

public class Student {
		
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//�ν��Ͻ� �޼ҵ�
	
	public void info() {
		System.out.println("�̸�: "+name+", ����: "+score);
	}
	
	// Ŭ���� �޼ҵ�
	public static int sum(int score1, int score2) {
		return score1 + score2;
	}
	
	
	
}
