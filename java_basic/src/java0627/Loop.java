package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan=new Scanner(System.in);

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


		
//		int num1;
//		
//		System.out.printf("���ڸ� �Է��ϼ��� :");
//		num1=scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=num1; i++)
//		{sum =sum+i;
//			System.out.println("����: "+sum);
//		}
//		
		
//		for(int i=1;true; i++) {
//			if(i>6)break;
//			System.out.println("���ѷ���");
//		}
		
		// �ݺ����� �ۼ��Ϸ��� ��� �ݺ��Ǵ°�, ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ��������� ���ؼ� ���� �����ؾ� �Ѵ�.
		// for��, while��, do~while �� ��� ���� �ݺ��� �������ϴ°��� 
		// ã�����ϸ� �ۼ��� �� ����.(���ѷ����̵�, n�� �ݺ��̵�)
		
//		int num1=-1;
//		for(;num1!=0;) {
//			System.out.printf("���� �Է� : ");
//			 num1=scan.nextInt();
//		}
		

//		for(;true;) {
//			System.out.printf("���� �Է� : ");
//			 int num=scan.nextInt();
//			 if(num==0)break;
//		}
//		

//		for(;true;) {
//			System.out.printf("���� �Է� : ");
//			 int num=scan.nextInt();
//			 if(num==0)return;
//		}
		
		
		//���ѷ��� �����Ű�¹��
		//1. if���� ���ǽ��� ���̵Ǹ�  break  ����
		//2. for(;���ǽ�;)
		//3. return; - �ݺ����ڵ尡 �ִ� �޼��带 �����Ű�⶧����
		//			   �ݺ����� ����ȴ�.
		// break; - �ݺ���, switch ��밡��
		// 			if�� �ܵ����δ� break��� �Ұ�
		//if(10>5)break; �̰� ����!! (���Ǿ��� ����߱⶧����)
		
		// continue; 
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"��° �ݺ� ����");
//			if(i%3==0)continue;
//			System.out.println(i+"��° �ݺ� ������");
//			System.out.println(i+"��° �ݺ� ����������");
//		}
//		
//		
//		// �ڹ��� ����
//		int random=(int)Math.floor(Math.random()*50)+1;
	
		// ������ ����(1~50)
		// ���� �� ��� ���
		// �������� 11�� ����ϰ�� �ݺ��� ����
		
//		for(;true;) {
////			int random1=(int)Math.floor(Math.random()*50)+1;
////			double random1=Math.floor(Math.random()*50)+1;
////			int random1=Interger.parseInt(Math.random()*50)+1;
//			int random1=(int)(Math.random()*50)+1;
//			if(random1 %11 == 0)break;
//			
//			System.out.println(random1);
//		}
//		
		
		// up & down �����
		// ��ǻ�Ͱ� ������ ���� ���߱�
		// ��ǻ�������ϴ� ���ڴ� ��������(�������� 20~100)
		// ��ǻ�Ͱ� ������ ���ڰ� 74 ���
		// ���� �Է��� ���ڰ� 40�� ���  up�̶�� ���
		// ���� �Է��� ���ڰ� 80�� ��� down�̶�� ���
		
		

//		int com=(int)(Math.random()*81)+20;
//		for(;true;) {
//			int user=scan.nextInt();
//			System.out.println("���ڸ� ��������:"+user);
//			if(com>user) {
//				System.out.println("Up!!");
//			}else if(com==user){
//				System.out.println("����");
//				break;
//			}else{
//				System.out.println("Down!!");}
//				
//			}
//		 }
//	

		//�̸��� �ִ� �ݺ���
//		int sum=0;
//		
//		 ���ϱ�:for(int i=1;i<=10; i++) {
//			 for(int k=1; k<=4;k++) {
//			if(sum+k>=40)break ���ϱ�;
//			sum=sum+k;
//			System.out.println(i+"  "+k);
//			 }
//			System.out.println(i); 
//		    sum=sum+i;
//		 }
//		 if(sum<40) {	
//			System.out.println("sum ���: "+ sum);
//		}
//		 
		 
		// ����Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		// �ѹ��� ������ �� �ִ� ���ڴ� �ּ� 1��, �ִ� 3��
		// 31�� �Է��ϸ� �й�
		
		
		int num=1;
		
		����Ų:
		for(;;) {
			System.out.println("���� �: ");
			int user=scan.nextInt();
			System.out.print("�� : ");
			for(int u=1;u<=user; u++) {
				System.out.print(num+"  "  );
				if(num==31) break ����Ų;
				num++;
			}

			int com=(int)(Math.random()*3)+1;
			System.out.print("com : ");
			for(int c=1;c<=com;c++) {
				System.out.print(num + " ");
				if(num==31) break ����Ų;
				num++;
			}
			System.out.println();
		}
		
		
		
		
	}
}

	

