package java_0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> ���� = new HashSet<>();
		HashSet<String> ��� = new HashSet<>();
		
		����.add("¥���"); ����.add("������");
		����.add("���"); ����.add("�޲ٹ̺���");
		
		���.add("��ġ������"); ���.add("������");
		���.add("¥���"); ���.add("���");
		
		System.out.println(����);
		System.out.println(���);
		// ������ - �ΰ� �̻��� �׷쿡 �������� ���� ����
		
		HashSet<String> ���� = new HashSet<>();
		
		Iterator<String> it = ����.iterator();
		
		while(it.hasNext()) {
			String ����food=it.next();
			if(���.contains(����food)) {
				����.add(����food);
			}
			
		}
		
		System.out.println("����, ��� ������ : " + ����);
		
		// ������ - A���հ� B���հ��� �����յ����͸� ������ ������������
		
		HashSet<String> ������=new HashSet<>();
		
		it = ����.iterator();
		while(it.hasNext()) {
			String ����food=it.next();
			if(!���.contains(����food)) {
				������.add(����food);
			}
		}
		
		System.out.println("��ο� ���� ���� ������ : " + ������);
		
		// ������ - A���հ� B������ �� (�ߺ�����)
		
		HashSet<String> �� = new HashSet<>();
		�� = (HashSet<String>)����.clone();
		��.addAll(���);
		
		System.out.println(��);
		
		// ������ - addAll
		// ������ - retainAll   ����. retainAll(���)
		// ������ - removeAll   ����.removeAll(���)
		
			
		
		
//		HashSet<String> hash=new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("�������");
//		hash.add("��������");
//		hash.add("¥���");
//		
//		System.out.println(hash);
//		
//		hash.remove("«��");
//		System.out.println(hash);
//		
//		for(String food : hash) {
//			System.out.println(food);
//		}
//		
//		ArrayList<String> list=new ArrayList<>(hash);
//		System.out.println(list);
//		System.out.println(list.get(3));
		

	}

}

/*
 	Set �������̽� 
 	
 	 - HashSet, TreeSet
 	 - ������� ���� ���� �ʴ´�.
 	 - �ߺ� ������� �ʴ´�.
 	 - �ε����� ����.
 	 - Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�.
 	 - HashSet -> ������ ǥ��
 	 - TreeSet -> �˻��� Ưȭ
 	 
 	
 	
*/
