package homeWork0801;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//사용자로부터 주민등록번호 입력 받기
    	System.out.println("주민등록번호를 입력하세요(형식:YYMMDD-1234567):");
    	String residentNumber = sc.nextLine();
    	
    	//주민등록번호 형식 검사
    	if(residentNumber.length() != 14 ||residentNumber.charAt(6) != '-') {
    		System.out.println("주민등록번호 형식이 잘못되었습니다");
    	}else{
    		//성별 판별 (뒷자리의 첫번째 숫자)
    		char genderCode = residentNumber.charAt(7);
    		if(genderCode =='1' ||genderCode == '3') {
    			System.out.println("성별 : 남자");
    		}else if(genderCode =='2'||genderCode =='4') {
    			System.out.println("성별: 여자");
    		}else {
    			System.out.println("잘못된 성별코드 입니다.");
    		}
    	}
    	
    }
}
