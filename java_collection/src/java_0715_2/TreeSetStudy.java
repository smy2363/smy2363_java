package java_0715_2;

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
		

	}

}

/*
	Tree ������ �̿��Ͽ� ���� �����Ű�� TreeSet
	 - ���������� �����͸� �������� �ʴ´�.
	 - �ߺ� ��� ���� ����
	 - ����Ʈ���� ����ϱ� ������ �����Ͱ� ���� �Ǿ� ��µȴ�.
	 - ���� �˻� �Ǵ� ������ �ߺ����� ���Ŀ� ���� �ϴ�.
	 

*/
