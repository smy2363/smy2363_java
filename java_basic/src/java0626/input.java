package java0626;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
//		System.out.println("자바출력");
//		// system.in - 입력
//		// 입력받을 수 있는 내장 클래스 - Scanner
//		Scanner scan = new Scanner(System.in);
//		
//		// float 타입 - netxFloat()   double - nextDouble()
//		// byte - nextByte() short - nextShort()
//		// char는 없다. (문자는 없다)
//		// 문자열 입력 - nextLine(), next()
//
//		int a=scan.nextInt();
//		System.out.println(a);
//		
//		//점심을 맛있게 먹었으니
//		//철수가 점심을 먹기위해 편의점에 갔다.
//		//대게라면과 삼각김밥, 바나나우유를 먹었따.
//		//철수가 점심값으로 지불한 금액은 얼마인가?
//		
//		int 대게라면=scan.nextInt();
//		int 삼각김밥=scan.nextInt();
//		int 바나나우유=scan.nextInt();
//		int 총합계=대게라면+삼각김밥+바나나우유;
//		
//		System.out.println("대게라면 가격은"+대게라면);
//		System.out.println("삼각김밥 가격은"+삼각김밥);
//		System.out.println("바나나우유 가격은"+바나나우유);
//		System.out.println("총 합계는"+총합계+"원");
//		
		
//		int 대게라면, 삼각김밥, 바나나우유;
//		System.out.println("대게라면 가격 :");
//		대게라면=scan.nextInt();
//		System.out.println("삼각김밥:");
//		삼각김밥=scan.nextInt();
//		System.out.println("바나나우유 :");
//		바나나우유=scan.nextInt();
//		
//		int 지불금액=대게라면+삼각김밥+바나나우유;
//		System.out.println("점심값 :"+지불금액+"원");
		
		
		// 만수가 친구들을 만나기위해 나왔다.
		// 나와서보니 지갑을 놓고와서 집에 갔다왔다.
		// 이번에는 신발을 짝짝이로 신어서 다시 집에갔다왔다.
		// 민수의 집은 5층이다. 민수가 1층 올라가는데 3.4초가 걸린다.
		// 민수가 집에 들어갔다 나왔다 하는데 걸린 총 시간은 몇초?
		
		int 민수집=5;
		int	왕복횟수=2;
		double 일층=3.4;
		double 오층편도=(민수집-1)*일층;
		double 오층왕복=오층편도*2;

		
		double 총시간=오층왕복*왕복횟수;
		
		System.out.println("총 시간은"+총시간+"초");
		
		// 프로그램 코드는 기본 순차적으로 진행된다.
		// if, 함수(메서드), 반복문, goto문
		
		
		/*
		 데이터의 종류는 정수, 실수, 문자, boolean(참, 거짓)
		 데이터 타입
		    정수 - byte, short, int, long
		    문자 - char
		    실수 - float, double
		    참거짓 - boolean
		    
		 변수 선언방법 - 데이터타입 변수이름;
		 
		  	int num; 정수 타입 변수 선언
		  	double dnum; 실수 타입 변수 선언
		  	char ch; 문자 타입 변수 선언
		  	boolean bool; 참 거짓 변수 선언
		  	
		 변수의 초기화
		 	int num=10; 변수 선언과 함께 데이터를 저장
		 	
		 출력방법
		 	System.out.println(출력내용);
		 	System.out.print(출력내용);
		 	System.out.printf(출력내용);
		 	
		 printf 사용시 함께 사용하는 형식지정자
		
		     %d, %u - 정수, %f - 실수, %c - 문자, %s - 문자열 
		     
		 int age=28;    
		 System.out.printf("%s 마을의 나이가 %d살인 폭군지도자 %c",
		 			"코딩빌", age, "박");
		  
		  입력방법
		    Scanner 클래스 객체 필요
		    Scanner 변수= new Scanner(System.in);
		     *Scanner 클래스는 내장외부클래스이므로 import 해야한다.
		    
		      변수.nextInt(); int타입 정수만 입력
		      변수.nextByte(); byte타입 정수만 입력
		      변수.nextShort(); short타입 정수만 입력
		      변수.nextLong(); long타입 정수만 입력
		      변수.nextFloat(); float타입 실수만 입력
		      변수.nextDouble(); double타입 실수만 입력
		      변수.next(); 문자열 입력
		      변수.nextLine(); 문자열 입력
		      
		      
		     c언어, 자바, 건축학개론 시험 성적을 입력하세요/
		     세과목의 총점과 평균을 각각 출력하세요
		     
		     
		  
		 */
		
		
		
	}

}
