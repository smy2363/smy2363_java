package Study1;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		
		//���� ������ 12�� �����Ҽ� �ִ� �迭 �����
		
		int[] arr=new int[12];
		
		//5�� �Ǽ������� �����Ҽ� �ִ� �迭 �����
		
		float[] arr2=new float[5];
		
		// 4���� �̸��� �����Ҽ� �ִ� �迭
		
		String[] name=new String[4];
		
//		 
//		Member[] mem=new Member[120];
//		mem[0].age=10;
//		System.out.println(mem[0].age);
		
		// ���� ������ 42�� ���� �Ѵ�.
		
		int[] data=new int[42];
		
		// 10, 20, 30,40, 50�� �迭�� ����
		
		int[] num= {10,20,30,40,50};
		
		
		int[]num1=new int[5]; 
		num1[0]=10;
		num1[1]=20;
		num1[2]=30;
		num1[3]=40;
		num1[4]=50;
		
		for(int i=0;i<5;i++) {
			System.out.println(num[i]);

		}
		
		int[] width=new int[] {10,20,30,44,55,11,22,33,66,77};
		
		for(int i=0;i<width.length;i++) {
			System.out.println(width[i]);
		}
		
		String[] we=new String[] {"�̼���","������","������",
				"�庸��","�念��","�̻��","�̼���","���","��������"};
		// �迭 ���
		
		for(int i=0;i<we.length;i++) {
			System.out.println(we[i]);
		}
		
		
		// 7���� ���� ������ �迭
		
		int[] seven=new int[7];
		
		Scanner sc=new Scanner(System.in);
//
		
//		for(int i=0;i<seven.length;i++) {
//			System.out.print("���� �Է�: ");
//			seven[i]=sc.nextInt();
//		}
		
	// 6���� �����Ը� �Է��ϼ���(�Ҽ���1�ڸ�������)
	// �Է��ϰ� ��±���
//		
//		float[] weight=new float[6];
//		
//		for(int i=0; i<weight.length;i++) {
//			System.out.println("�����Ը� �ۼ��Ͻÿ�");
//			weight[i]=sc.nextFloat();
//		}
//		
//		// �����԰� ����� �迭���� 50�̻� ���
//			
//		for(int i=0; i<weight.length;i++) {
//			if(50<=weight[i]) {
//				System.out.println(weight[i]);
//			}
//		}
//		
//		
		// number �迭�� �� ���
		// ¦���� ����ϼ���
		int[] number=new int[] {
			55, 44, 33, 88, 99, 54, 14, 28, 91, 4, 6, 9
		};
		
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
			System.out.println(number[i]);
			}
		}
		
	
	}
}