package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//����
		
		// ���� ���Ӹ����
		// 1. 25�� ũ�⸦ ������ �迭 ����
		// 2. �迭�� ���� ���� ����
		// 3. �ߺ����� ����
		// 4. 25�� ���ڸ� ȭ�鿡 ���
		// 5. ���� ���� - ���ڼ���(�Է�)
		// 6. ������ ����  ��ġ�� ǥ���ϱ�
		// 7. �� �� ���� ���� Ȯ���ϱ�
		// 8. ������ ȭ�鿡 ���
		
		
		int[] bingo=new int[25];
		
		// 25�� ���� �ߺ����� ����
		for(int i=0; i<bingo.length; i++) {
			bingo[i]=(int)(Math.random()*50)+1;
			for(int k=0; k<i;k++) {
				if(bingo[k]==bingo[i]) {
					i--;break;
				}
			}
		}
		
		// 5�� 5ĭ ���
		while(true) {
		for(int i=0;i<bingo.length; i++) {
			if(i%5==0)
				
				System.out.println();
			if(bingo[i]==0)
				System.out.printf(" %2c ", '��' );
			else
				System.out.printf(" %2d ",bingo[i]);
		}
		
		// ���� ���� ����
		System.out.print("������� �Է� : ");
		int num=sc.nextInt();
		
		// ������ ���� ǥ�� �ϱ�
		for(int i=0; i<bingo.length;i++) {
			if(num==bingo[i]) {
				bingo[i]=0;break;
			}
		}
		
		// 5�� �����? ���� �����
		int ����=0, ����=0, �밢��1=0, �밢��2=0, end=0;
		
		for(int i=0; i<5; i++) {
			for(int k=0;k<5;k++) {
				if(bingo[i*5+k]==0) ����++;
				if(bingo[k*5+i]==0) ����++;
			}
			
			
			if(bingo[i*6] == 0) �밢��1++;
			if(bingo[i*4+4]==0) �밢��2++;
			
			if(�밢��1==5)end++;
			if(�밢��2==5)end++;
			if(����==5)end++; // ���ٿ� 0�� 5����� 1�ٺ���
			if(����==5)end++; // �����⿡ 0�� 5����� 1�ٺ���
			
			���� = 0;
			���� = 0;
		}
		
		if(end==5) { // 5�� �����̴�
			System.out.println("5�ٺ��� �ϼ�!!");
			break; //���ѷ��� ����
			
		}
	}
	

		
		
		
		
		// �迭�� 20���� ���� ���� ����(���� ���� - 1~30)
		// �迭�� ����� ������ �߿��� 5�� ����� ����� ����ϱ�
		
//		
//		int[] number=new int[20];
//		
//		for(int i=0; i<number.length; i++) {
//			number[i]=(int)(Math.random()*30)+1;
//		}
//		int count=0; // 5�� ��� ������ ������ ����
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%5==0)
//				count++;		
//		}
//		
//		System.out.println("5�ǹ�� �?"+ count);
		
		
	    // �迭 �������, �迭�� ������ �����ϴ� ���, 
	    // �迭�� ����� ������ ���� �Ǵ� ���
	    // 
		
		
		
		
			
	}
} 