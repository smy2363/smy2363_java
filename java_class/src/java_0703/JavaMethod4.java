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

		String userName=rm.getName();
		int age=34;
		
		System.out.println(userName+" "+age);
		
		// ����(89), ����(78), ����(50) �������� ������ ���ϴ� �޼���
		// �������� ����� ���ϴ� �޼���
		// �� ���� ����� ����ϼ���
		int kor=89, eng=78, mat=50;
		
		int ����=rm.score(kor, eng, mat);
		int ���=rm.scoreAvg(����);
		
		System.out.println("�� �հ��? "+����+"\n"+"�� ����� ?"+���);
		
	
		
		

	}

}





class ReturnMth{
	
	int scoreAvg(int ����) {
		int avg=����/3;
		return avg;
	}
	
	int score(int kor, int eng, int mat) {
		int sum=kor+eng+mat;
		return sum;
		
	}
	
	String getName(){
		String name="�̼���"; 
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
