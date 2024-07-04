package java0703;

import java.util.Scanner;

public class JavaMethod3 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		// 정수 두개 입력 받아 합을 출력하기
		Calc calc=new Calc();
		calc.sum(40,10);
//		calc.sum();
		
		// 세과목의 총점을 구하여 출력하세요
		
		
		int kor=89, eng=74, mat=43;
		
		Score score=new Score();
		score.sum(kor, eng, mat);
		
		// 메서드 호출하여 '메서드 dog쉽네~' 라고 출력
		
		calc.dog();
		
		calc.view(); //view 메서드 호출
		
		// 메서드를 호출하여 이름과 나이를 출력하세요
		// 매개변수 없는 메서드, 키보드를 입력X
		
		calc.nameAge();
		
		// 메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골드리트리버";
		String 공고일="2024-07-01";
		
		TestMethod testMethod=new TestMethod();
		testMethod.dog(animal,공고일);
		
		// 다음 날짜중에서 월과 일만 출력하세요
		//문자열 메서드 substring 또는 split 사용
		String examDate="2024-08-13";
		
		testMethod.day(examDate);
		
		// 네 사람의 나이평균 값을 구하여 출력하세요
		// 평균값은 정수입니다.
		int 흥민=31, 강인=23, 희찬 =28, 재범=37;
		
		testMethod.age(흥민, 강인, 희찬, 재범);


	
	}

}

// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스변수는 클래스이름을 통해 사용


		
		class TestMethod{
			
			void age(int 흥민, int 강인, int 희찬, int 재범) {
				int avg=(흥민+강인+희찬+재범)/4;
				System.out.println("\n"+"4명의 나이 평균값은? "+avg);
			    }
			
			void day(String date) {
//				String days=examDate.substring(6,10);
//				System.out.println(days);
				String[] current=date.split("-");
				System.out.print(current[1]+" "+current[2]);
				}
			
			void dog(String animal, String 공고일){
				System.out.println("강아지종류는 ?"+animal+"\n"+"공고일은 ?"+공고일);

			}
			
				
		}
		


		class Score{
			void sum(int kor, int eng, int mat) {
				int result1=kor+eng+mat;
				System.out.println("총점은 ?"+result1);
			}
		}


		class Calc{
			
		
			
			void nameAge() {
				String name="홍길동"; int age=35;
				System.out.println("이름은? "+name+"\n"+"나이는? "+age+"살");
			}
			
			
			void view() {// 변수a,b의 값 출력하는 메서드
				int a=10, b=20; 
				System.out.println(a+","+b);
			}
			
			void dog() {
				System.out.println("메서드 dog쉽네~");
			}
			
			void sum(int num1, int num2) {
				int result=num1+num2;
				System.out.println("합 : "+result);
			}
			
			void sum() {
				Scanner scan=new Scanner(System.in);
				System.out.print("첫번째 정수 : ");
				int num1=scan.nextInt();
				System.out.print("두번째 정수 : ");
				int num2=scan.nextInt();
				int result=num1+num2;
				System.out.println("합 : "+ result);
			}
		}