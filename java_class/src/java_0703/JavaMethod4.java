package java_0703;

import java.util.Scanner;

public class JavaMethod4 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// ���� �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm=new ReturnMth();
		int num=rm.get();
		
		System.out.println(num);
		
		// �޼���κ��� �������� �մ��ϱ� ��� �޾Ƽ� ����ϱ�
		int ���=rm.sum();
		System.out.println(���);
		
		// ������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ�!!
		
		String �̸�=rm.getName(); 
		String userName=�̸�;
		int age=34;
		System.out.println(userName+" "+age);
		

	}

}

class ReturnMth{
	
	String getName(){
		String name="�̼���"; 
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
