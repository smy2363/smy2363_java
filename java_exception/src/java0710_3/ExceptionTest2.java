package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		boolean is=true;
		do {
			try {
				
				System.out.print("���� �Է� : " );
				num = scan.nextInt();
				
				is=false;
//				if(is) break;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���!");
			}finally {
				scan.nextLine();
			}
		}while(is);
		
		System.out.println( num + 100 );
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.println( name );
	}

}
