package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		// �ݺ��� - for, while, do~while
		// for(�ʱⰪ; ���ǽ�; ������){�ݺ�����}
		// ���ǽ��� ������ �ɶ����� �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������
		// -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������ ->
		// -> ���ǽ� �� -> �����̶�� -> ��

//		for(int i=1; i<=17; i+=2) {
//			System.out.println("��... �ݺ���...."+i);
//			}
//		
//		for(int i=1; i<=17; i++) {
//			System.out.println("��... �ݺ���...."+i);
//			i++;
//			}
//		
//		for(int i=1; i<10; i++) {
//			System.out.println("��... �ݺ���...."+((2*i)-1));
//			i++;
//			}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i);
//		}
////		
//		int num=1;
//		int a=1;
//		
//		num=num+a;
//		System.out.println(num); // 2
//		a++;
//		
//		num=num+a;
//		System.out.println(num); // 4
//		a++;
//		
//		num=num+a;
//		System.out.println(num); // 7
//		a++;
//		
//		int num=1;
//		
//		for(int a=1; a<=5; a++) {
//		num+=a;
//		System.out.println(num);
//		}
		
		//1���� ���� �Է��� ���ڱ����� ������ ���ϼ���

		Scanner scan=new Scanner(System.in);
		
		int num1;
		
		System.out.printf("���ڸ� �Է��ϼ��� :");
		num1=scan.nextInt();
		
		int sum=0;
		for(int i=1; i<=num1; i++)
		{sum =sum+i;
			System.out.println("����: "+sum);
		}
		
		

		
	}

}
