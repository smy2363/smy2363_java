package java0627;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		// ���ǹ� - if, switch
		// �ݺ��� - for, while, do~while
		
		// if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		//			     ��, ���� ������ ���� �� �ִ� ��
		// Ű�� 150�̻��̴�. Ű >=150
		// 10������ ���⳻��    ��ü���⳯¥ ��==10
		// 32000�� �̻��� ���⳻��    �����>=32000
		// �Ǹ����� ��ǰ�鸸 ���   ��ǰ����==�Ǹ���, ������>0
		
		
		int tall=135;
		
		if(tall>=150) {

		}else {
			//Ű�� 150�̻��� �ƴ϶�� ������ �Ұ�����
		}
		
		// ���� �հ� ���� - �հ�(60�̻�), ���հ�(60�� �̸�)
		
		int score=72;
		
		if(score>=60) {
			System.out.println("�հ�");
			
		}else
		{System.out.println("���հ�");}
		
		// if ~else - ���ǽ��� ��, ������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ°�쿡 if ~ else ������ �ۼ�
		
		// ���� ���� ��� - A(90���̻�), B(80���̻�), C(70�� �̻�), D(������)
		
		score=89;
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70){
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		// switch - �����ڵ带 case�� �����Ͽ�
		//			case�� ��ġ�ϴ� ���� ��� �ߵ� �Ǵ� ���ǹ� 
		
		// ������ ������ �����. ����Ű�� w,a,s,d �̰�
		// pŰ�� �Ͻ�����, oŰ�� ����ϱ�, i�� ó������ �ٽý���
		// ctrl+s �� ���ӽ����̶�� �Ѵٸ�
		
		
		/* switch(Ű���尪){
				case 'a':
				case 'w':
				case 's':
				case 'd':
				case 'p':
				case 'o': 
				case 'i':
				case 'ctrl':
					switch(Ű2){
						case's'
						}
					}
						
			 ���α׷��� �޴� ����
			 
			 witch(menu){
			 case "open":
			 case "save":
			 case "build":
			 case "git":
			 case "exit":
				}
				
			���ǽ��� == �����ڰ� ���ȴٸ� switch���� �ۼ��ϴ°��� ��� �غ���
			
			
		*/	
		
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		// ���� ��ư�� Ŭ���ϸ� ������ �����ض�
		
		String buttom="�ڵ�����";
		
		switch(buttom) {
			case "����":
				System.out.println("���� ����");
				break;
			case "�ڵ�����":
			case "����":
				System.out.println("���� ����");
				break;
			case "����":
				System.out.println("���� ����");
		}
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���(������ �Ű澲������)
		// ���� �Ǵ� ������ ���̰� ũ�ٸ� ���簢��
		//���ο� ������ ���̰� ���ٸ� ���簢���̶�� ����ϼ���
		//switch������ (if�� ���� ��������)
		
		Scanner scan=new Scanner(System.in);
		
		int width, height;
		
		
	 
		
		System.out.printf("���δ�?");
		width=scan.nextInt();
		System.out.printf("���δ�?");
		height=scan.nextInt();
		
		int result=width-height;
		
		
		switch(result) {
			case 0:
				System.out.println("���簢��");
				break;
			default:
				System.out.println("���簢��");	}
		
				
			// switch������ default�� �ѹ��� ���
			// switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����ȴ�.
			// �־��� case�� ��ġ�ϴ°� �ϳ��� ������ default�� �����ϰ� ����
		
		
		
		
		
		
		
		
		
	}
	

}
