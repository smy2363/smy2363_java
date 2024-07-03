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
		
		String 이름=rm.getName(); 
		String userName=이름;
		int age=34;
		System.out.println(userName+" "+age);
		

	}

}

class ReturnMth{
	
	String getName(){
		String name="이순신"; 
		int age=34;
		String info=name+age;
		return info;
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
