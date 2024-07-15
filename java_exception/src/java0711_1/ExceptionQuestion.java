package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NameValueException extends Exception{
	public NameValueException(String msg) {
		super(msg);
	}
}


public class ExceptionQuestion {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name=null;
		int age=0;
		String userInfo=null;
		
		try {
			System.out.print("�̸� : ");
			name = scan.nextLine();
			// isEmpty() - ���ڿ����̰� 0 �ΰ��true  ""
			// isBlank() - ���ڿ��� ����ְų� ����� �ΰ�� true  "" , " "  
			if( name.isBlank() ) 
				throw new NameValueException("�̸��� �Է��ϼ���");				
		}catch(NameValueException n) {
			System.out.println( n.getMessage() );
		}
		
		try {
			System.out.print("���� : ");
			age= scan.nextInt();
		}catch(InputMismatchException i) {
			System.out.println("10���� ������ ���̸� �Է��ϼ���");
		}finally {
			scan.nextLine();
		}
		
		if(age>=20) {
			System.out.print("�ڱ�Ұ� : ");
			userInfo = scan.nextLine();
		}
		
		System.out.println(age+"�� "+name+"���� "); 
		try {
			System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("�ڱ�Ұ��� 10�� �̻� �ۼ����ּ���");
		}catch(NullPointerException e2) {
			System.out.println("���� �� �Ǹ� �Ͷ�!");
		}
	}

}