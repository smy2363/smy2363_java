package study0803;

public class StudentMain {

	public static void main(String[] args) {
		
	
		Student stu1 = new Student("김철수", 90);
		Student stu2 = new Student("김영희", 85);
		
		//인스턴스 메서드 호출: 학생정보표시
		
		stu1.info();
		stu2.info();
		System.out.println();
		
		//클래스 메소드 호출: 학생 점수 더한결과 
		int total=Student.sum(stu1.score,stu2.score);
		System.out.println("총합계 : " + total);
    
	}

}
