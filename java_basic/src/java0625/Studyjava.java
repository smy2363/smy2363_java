package java0625;

public class Studyjava {

	public static void main(String[] args) {
		// �ڹ� �⺻ ���� - ������Ʈ - ��Ű�� - Ŭ����
		System.out.println("�ڹ��׽�Ʈ"); //���
		// �ڵ���� -����ctrl+f11
		// �ڹ� ���� ����
		// ->������Ÿ�� �����̸� = ������;
		// �������� ������ ����, �Ǽ�, ����
		// ���� - byte, short, int, long, char
		// ���� - char
		// �Ǽ� - float, double
		
		
		byte num=10; // 1byte ������ �����
		short num1=200; // 2byte ������ �����
		int num2=2323; // 4byte ������ �����
		long num3=234L; // 8byte ������ ����� /L�� ���� �ٿ�����Ѵ�(�ݵ�ô¾ƴ�)/
		
		char ch='a'; //''��������ǥ�� ����, ""ū����ǥ�� ���ڿ�
		
		float fnum=3.14f;  //f�� ���� �ݵ�� �ٿ�����Ѵ�.
		double dnum=12.3343; //f�� ������ �ʾƵ���
		fnum=35;
		
		
		boolean isTrue=false;
		
		String word="�̼���"; // String�� Ŭ�����̴�.
		// Ŭ���� - ����� ���� Ÿ��
		
		// �簢���� ���̸� ���Ͻÿ�.(�غ��� ���̴� �����̴�)
		int width=15;
		int height=20;
		int area=width*height;
		System.out.println("���� : "+area);
		
		// Ű���带 30�� �����ؾ��Ѵ�.
		// hp���̹�Ű������ ������ 8000���̶�� �� ���űݾ��� ���ΰ�
		
		int keyboard=30;
		int pay=8000;
		int money=keyboard*pay;
		System.out.println("�� ���űݾ���? :"+ money);
		
		System.out.print("java ��� ��� print");
		System.out.print("�ٹٲ� �ȵȴ�.");
		
		System.out.printf("printf \n ���");  //\n �ٹٲ�(println, print, printf  ���λ�밡��)
		// ���� ���� - ������������(�� �ϳ��� ǥ�� ����)
		System.out.printf("�� �ݾ� : %d", money);
		// %d - 10���� ����
		// %u - 10���� ����
		// %f - 10���� �Ǽ�
		// %c - ����
		// %s - ���ڿ�
		// %b - boolean(false, true)
		// %o - 8���� , %x - 16����
		System.out.printf("\n ����: %d�� ����:%d�� \n", 80, 90);
		
		System.out.printf(" ����: %d Ű: %f \n", 34, 172.3);
		System.out.println(172.315);
		System.out.print(172.315);
		System.out.printf("\n %.1f\n",172.315); //�Ҽ��� �ڷ� 6�ڸ����� �⺻������ ǥ����
		System.out.println(3);
		System.out.printf("%5d",3); //������ �ټ��ִ� ����
		

		
	
		
		
		// num=3.14;
		//num="�̼���";
		
		
	}

}
