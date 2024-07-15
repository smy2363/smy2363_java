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
		int 급여=0;
		String 직원이름=null, 소속부서명=null;
		float 세금=0.08f;
		int 실수령액=0;
		
		
		System.out.print("급여는?");
		급여=scan.nextInt();
		System.out.print("직원 이름은?");
		직원이름=scan.next();
		System.out.print("소속 부서명은?");
		소속부서명=scan.next();
	    실수령액=(int)(급여-(급여*세금));
		System.out.print("실수령액은?"+실수령액+"원\n");
		

	
		
		System.out.println("급여는?" + 급여+"원");
		System.out.println("직원 이름은?"+ 직원이름);
		System.out.println("소속 부서명은?"+소속부서명);
		System.out.println("실수령액은?"+실수령액+"원");
		

		System.out.print("급여는?");
		급여=scan.nextInt();
		//Integer.parseInt(sc.nextLine()); 으로 작성시 넥스트라인 사용안해도됨
		System.out.print("직원 이름은?");
		직원이름=scan.next();
		System.out.print("소속 부서명은?");
		소속부서명=scan.next();
		실수령액=(int)(급여-(급여*세금));
		System.out.print("실수령액은?"+실수령액+"원");


		// 숫자다음에 문자가 들어갈경우 scan.nextLine(); 을 꼭 써줘야한다.
		// next() - 스페이스키, 탭키, 엔터키를 누르면 입력 끝
		// nextLine() - 엔터키
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
