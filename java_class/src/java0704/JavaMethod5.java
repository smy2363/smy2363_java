package java0704;

import java.util.Scanner;

public class JavaMethod5 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// �ΰ��� ������ ��ȯ�ϱ�
	MethodUtil util=new MethodUtil();
	int[] num1=util.twoNum();
	
	// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���
	// ���̴� main�޼��忡�� ��µǰ� �ϼ���

//
//  int width=60;
//	int height=80;
//	
//	Quadrangle qua=new Quadrangle();
//	
//	int res=qua.area(width, height);
//	System.out.println("�簢���� �ʺ��?"+width+"\n ���̴�? "+height+"\n ���̴� ?"+res);

//	int area=util.rectArea();
//	System.out.println("���� : "+area);

	
	// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
	// login�޼��带 �����Ͽ� �α��� ���ɿ��θ� ����ϼ���
	//���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
	// �ϳ��� ����ġ�� �α��� ���� ���
	// �α��ο��� ����� main ����
//	
//	boolean isFail=util.login();
//	if(isFail){
//		System.out.println("�α��� ����");
//	}else {
//		System.out.println("�α��� ����");
//	}
	
	// ���� ������ Ű���带 ���� �Է� ��������.
	// �Է��� �� ������ ���� 100�� ������ 
	// 100 - ���� ����� ����ϰ�
	// 100�� ���� ������ �������� ��������ϼ���
	// main�޼��忡�� ���                                
	int number=util.Sum();

	
	
	if(number>100) {
		System.out.println("�������?" +(100-number));
	}else {
		System.out.println("�������?"+number);
	}
	
	
	


  }
}





class MethodUtil{
	int Sum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ��� : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int result=num1+num2+num3;
		
		return result;
	 
	}
	
	
	boolean login(){
		Scanner sc=new Scanner(System.in);
		 System.out.print("���̵� :  ");
		 String id=sc.nextLine();
		 System.out.print("��й�ȣ : ");
		 String password=sc.nextLine();
		 boolean isSuccess = true;
		 if(id.equals("skyblue")) {
			 if(password.equals("1234sea"))
				 return isSuccess;
		 }
		 return isSuccess=false;
		}
	
	
	int rectArea() {
		int width=45, height=50;
		int area=width*height;
		return area;
	}
	
	
	int[] twoNum() {
		int num1=20, num2=50;
//		int[] temp=new int[] {num1,num2};
		return new int[] {num1,num2};
		// return���� ��ȯ��ų�� �ִ� ���� ���� ���̴�.
		
		

//class Quadrangle{
//	
//	int area(int width, int height) {
//		int reslut=(width*height);
//		return reslut;
//	}
//		
//}



	}
	
	
}