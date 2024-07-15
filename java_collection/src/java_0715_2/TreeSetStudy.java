package java_0715_2;

import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20);
		tree.add(9);  tree.add(40); tree.add(15);
		tree.add(48); tree.add(2);  tree.add(11);
		tree.add(39); tree.add(40);
		
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());
		// �Է°����� ū ���߿��� ���� ���� �˻�
		System.out.println(tree.higher(15));
		System.out.println(tree.lower(19));
		
		
		// �Է°����� ���� ��� ��
		System.out.println(tree.headSet(35));
		System.out.println(tree.tailSet(30));
		
		// �Է°����� ���� ���� �˻�(10�̻� 39�̸�)
		System.out.println(tree.subSet(10, 39));
	
		
		TreeSet<String> word = new TreeSet<>();
		
		word.add("�̼���"); word.add("������");
		word.add("�庸��"); word.add("������");
		word.add("������"); word.add("���س�");
		word.add("����"); word.add("������");
		word.add("���ƾ�");
		
		System.out.println(word.higher("��"));
		System.out.println(word.headSet("���"));
		System.out.println(word.subSet("��","��"));
		
		System.out.println(word.subSet("��", "��"));
		
		
		// 90���̻� - ���� 10%, 70���̻� - ���� 30%,
		// 40���̻� - ���� 80%,
		
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
	
		
		
		//���� ������ �Է��Ͽ� ���� ���������� ���
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("������ �Է��ϼ��� : ");
		int score=sc.nextInt();
		switch(rank.lower(score)) {
		case 90:
			System.out.println("���� 10%");
			break;
		case 70:
			System.out.println("���� 30%");
			break;
		case 40:
			System.out.println("���� 80%");
		}
		
		
		
		
		
//		if(score>=90) {
//			System.out.println(rank.higher(90) + "���� 10%");
//			
//		}else if(score>=70){
//			System.out.println(rank.higher(70) + "���� 30%");
//			
//		}else if(score>=40) {
//			System.out.println(rank.higher(40) + "���� 80");
//		}
//		
		
		// �� ������ �Է��ϰ� ������ ������ ���� ����� ���
		
		TreeSet<String> score2=new TreeSet<>();
			score2.add("89�� �̼���"); score2.add("67�� ������");
			score2.add("45�� ������"); score2.add("98�� �Ѽ���");
			score2.add("72�� �ڹ���"); score2.add("81�� ������");
			score2.add("59�� �̼���"); score2.add("32�� �����");
			
			//�� ������ �Է��ϰ� ������ ���� ����� ���
			
			String as=sc.nextLine();
			String score3=sc.nextLine();
			System.out.println("�� ������ �Է��ϼ��� : " + score3);
			System.out.println(score2.tailSet(score3));
			
			

		
	}

}

/*
	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
	 - ���������� �����͸� �������� �ʴ´�.
	 - �ߺ� ��� ���� ����
	 - ����Ʈ���� ����ϱ� ������ �����Ͱ� ���� �Ǿ� ��µȴ�.
	 - ���� �˻� �Ǵ� ������ �ߺ����� ���Ŀ� ���� �ϴ�.
	 

*/
