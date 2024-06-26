package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
	/*
	  // 문자열 - " " 큰따옴표로 표현하여 작성한다.
	     문자열은 String 클래스타입을 사용해야한다.
	     
	      문제2.
	      직원이름, 소속부서명, 월급여액을 키보드를 통해 입력받는다.
	      세금은 8%를 낸다. 실수령액은 얼마인지 출력
	      이름, 부서, 실수령액을 출력하세요

	 */
		int 급여;
		String 직원이름, 소속부서명;
		float 세금=0.08f;

		급여=scan.nextInt();
		직원이름=scan.next();
		소속부서명=scan.next();
		int 실수령액=(int)(급여-(급여*세금));
		

		System.out.println("급여는?" + 급여+"원");
		System.out.println("직원 이름은?"+ 직원이름);
		System.out.println("소속 부서명은?"+소속부서명);
		System.out.println("실수령액은?"+실수령액+"원");

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
