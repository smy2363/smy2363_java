package java_0703;

import java.util.Scanner;

public class JavaMethod4 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// 숫자 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm=new ReturnMth();
		int num=rm.get();
		
		System.out.println(num);
		
		// 메서드로부터 두정수의 합더하기 결과 받아서 출력하기
		int 결과=rm.sum();
		System.out.println(결과);
		
		// 다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게!!

		String userName=rm.getName();
		int age=34;
		
		System.out.println(userName+" "+age);
		
		// 국어(89), 영어(78), 수학(50) 세과목의 총점을 구하는 메서드
		// 세과목의 평균을 구하는 메서드
		// 총 점과 평균을 출력하세요
		int kor=89, eng=78, mat=50;
		
		int 총점=rm.score(kor, eng, mat);
		int 평균=rm.scoreAvg(총점);
		
		System.out.println("총 합계는? "+총점+"\n"+"총 평균은 ?"+평균);
		
	
		
		

	}

}





class ReturnMth{
	
	int scoreAvg(int 총점) {
		int avg=총점/3;
		return avg;
	}
	
	int score(int kor, int eng, int mat) {
		int sum=kor+eng+mat;
		return sum;
		
	}
	
	String getName(){
		String name="이순신"; 
		return name;

	}
	
	int sum() {
		int num1=30, num2=45;
		int result=num1+num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
	
}
