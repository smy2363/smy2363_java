package java0627;

public class Bitop {

	public static void main(String[] args) {
		
		// ������
		// ������ ������ �����ϸ� ����� ����
		// ������ �Ǽ��� �����ϸ� ����� �Ǽ�
		// 
		// ��������� - +, -, *, /, %(������)
		
		System.out.println(10/4);
		System.out.println(10/(float)4);
		System.out.println(10/4.0);
		System.out.println(10%3);
		
		//���������� - ++, --
		//���� ������ - =
		//���մ��Կ����� - +=, -=, *=, /=, %=
		
		int a=10;
		a+=3; // a=a+3
		
		// �񱳿����� - >, <, >=, <=, ==, !=
		// �񱳿����ڴ� ���ڸ� ����
		System.out.println(10==20);
		System.out.println(10==3.4);
		
		String name1="�̼���";
		String name2="������";
		System.out.println(name1.equals(name2)); //�ڹٿ��� ���ڿ��� equals�� ���Ѵ�.
		
		// �� ������ - &&, ||, !
		// ���ǿ����� - (���ǽ�)?������:��������;
		
		// ��Ʈ ������
		// ��Ʈ �� ������ - &, |, ~, ^
		// ��Ʈ ����Ʈ ������ - >>, <<, >>>
		
	 System.out.println(34&15);
	 System.out.println(42|21);
	 System.out.println(42^30);
	 System.out.println(~1);
	 System.out.println(~-15);
	 
	// 1024 512 256 128 64 32 16 8 4 2 1
	 
	
	 System.out.println(32<<3);
	 
	 
	 //2��n�� ���Ҷ� 
	 
	 System.out.println(1<<20); //2�� 4��
	 // >> 2�� n�� ��ŭ ������
	 System.out.println(1024>>3); //1024�� 2�� 3�� ������	 
	
	
	int red=188;
	int green=229;
	int blue=92;
	int color=(red<<16)|(green<<8)|blue;
	
	System.out.printf("#%6X \n",color);
	// rgb ���� ����ڵ�� ��ȯ
	
	}
	

}
