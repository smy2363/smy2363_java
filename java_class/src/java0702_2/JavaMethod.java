package java0702_2;

import java.util.Scanner;

public class JavaMethod {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// Ŭ�����޼��忡���� ���� Ŭ���� ������ Ŭ���� �޼��常
		// ���� - �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ͻ����� ����
		// �̷�����⶧���� �ν��Ͻ������� �ν��Ͻ��޼���� �ȵȴ�.
		
		int num=300;
		output(num);
		

	
	}
	
	static void output(int a) {
		System.out.println(a);
		System.out.println("���� �޼��� �Դϴ�.");
	}

}

class a{
	static int num=10;
	
	static void out() { // Ŭ���� �޼���
		System.out.println(num);
		
	}
}

// main �޼��� -> JVM



// �ڹ� �޼���
// ��ȯŸ�� �޼����̸�(�Ű�����){  }

// ��ȯŸ�� -  int, short, float, double, char, boolean
// 		    void, String
//			�޼����� return ������ Ÿ��
//	return 10; ->��ȯŸ�� int, short, byte, long
// return income; -> income ������ Ÿ���� ��ȯŸ������ 

// void Ÿ���� ��ȯ���� ���ٶ�� �ǹ�


/*	990101-1234567
	�ֹε�Ϲ�ȣ�� �������� �������� ����
	String gender(String jumin){
	 String gen=jumin.substring(7,8);
	 if(gen.equals("1")||gen.equals("3"){
	 	return "����";
	}else if(gen.equals("2")||gen.equals("4")){
		return "����";
	}
	return "ȥ��";
	  
	}
*/
