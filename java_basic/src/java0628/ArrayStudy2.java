package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		// ���� �˻��Ͽ� �����̸��� �ݾ��� ��µǰ� �ϼ���
		// ī�� �迭�� ���� ����˻��� �˼��մϴ�. �غ����Դϴ�.��� ���
		String[] ī��=new String[] {
			"�Ƹ޸�ī�� : 2000��","ȭ��Ʈ �Ƹ޸�ī�� : 2800��",
			"ī��� : 3000��","��ü�� :3800�� ",
			"ī���ī : 3800��","�����ֽ� : 4000��","��Ӿ��̽�Ƽ : 2900��",
			"�����ƾ��̽�Ƽ : 2800��","�ڵξ��̽�Ƽ : 2800��","���ڿ��̵� : 3500��",
			"�����̵� : 3500��","û�������̵� : 3500��"
		};
		
		System.out.println("�̸��˻� : ");
		String search=sc.nextLine();
		
		boolean isDrink=true;
		
		for(int i=0;i<ī��.length;i++) {
			if(ī��[i].contains(search)) {
				System.out.println("�˻� ��� : "+ī��[i]);
				isDrink=false;
			}
			    
			}if(isDrink){
				System.out.println("�˼��մϴ�. �غ����Դϴ�.");
			
		}
		

		
//		String[] name=new String[] {
//			"������","�Ѽ���","�縸��","������","������",
//			"�����","�̼���","�̻��","�̻��","�Ѱ���"
//		};
//		
//		System.out.println("�̸��˻� : ");
//		String search=sc.nextLine();
//		
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains(search)) {
//				System.out.println("�˻� ��� :"+name[i]);
//			}
//		}
//		
//		
		
		
		
		
		
		
		

		
		
		
		
//		String word="i like banana";
//		
//		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� ��ġã�� - indexOf
//		System.out.println(word.indexOf("like"));
//		// ���ڿ����� Ư�� ���ڳ� ���ڿ��� �������� - true, false
//		System.out.println(word.contains("banana"));
//		String[] a=new String[] {"banana","orange"};
//		
//		a[0].indexOf("na"); // 2������ (�տ��͸� ã�´�)
//		a[1].indexOf("ge"); // 4 true
//		
//		
		
		
		
		
		// name �迭�� ���ڿ��߿��� 3,4,5 �̼���, ������, ������, �ֿ���
		// ���ߴ� �迭�� �����ϰ� ����ϼ���
//		String[] name=new String[] {
//			"�̼���","������","�庸��","�̼���","������","������",
//			"�ֿ�","�縸��",
//		};
//		
//		String[] ���ߴ�=new String[4];
//		
//		System.arraycopy(name,3,���ߴ�,0,4);
//		
//		System.out.println(Arrays.toString(���ߴ�));
//		
		
		
		
		
		// 6���� Ű�� tall�迭�� �����Ͽ���.
		// Ű 175�̸��� ����ϼ���
//		float[] tall=new float[] {173.4f, 175.1f,
//				169.5f, 181.4f, 178.8f, 185.3f};
//		
//		
//		for(int i=0; i<tall.length; i++) {
//			if(tall[i]<175) {
//				System.out.println(tall[i]);
//			}
//		}
//	
		
		// ���� �迭�� �����ϴ� ������ �ǸŰ����� Ű����� �Է��Ͽ� 
		// �����ϼ���.
		// ���� �迭�� ����� �ǸŰ��ݵ��� ���հ������ ���ϼ���
//		int[] ����=new int[5];
//		
//		for(int i=0; i<����.length; i++) {
//			System.out.print("����"+(i+1)+"����: ");
//			����[i]=sc.nextInt();
//		}
//		
//		int total=0, avg=0; //���հ� ���
//		for(int i=0; i<����.length; i++) {
//			total=total+����[i];
//		}
//		avg=total/����.length;
//		
//		System.out.println("���� : "+total+","+"��� : "+avg);
//		
	
	
	
	}
		
		
		
}


