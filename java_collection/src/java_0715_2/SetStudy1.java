package java_0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		
//		while(num1.size()<15) {
//		num1.add(Integer.valueOf((int)(Math.random()*50)+1) );
//		}
//		System.out.println(num1);
//		
//		while(num2.size()<15) {
//		num2.add(Integer.valueOf((int)(Math.random()*50)+1) );
//		}
//		System.out.println(num2);
//		
//		while(num3.size()<15) {
//		num3.add(Integer.valueOf((int)(Math.random()*50)+1) );
//		}
//		System.out.println(num3);
//		
//		//num1�� num3�� ������
//		
//		num1.retainAll(num3);
//		System.out.println("num1��num3�� ������ : "+num1);
//		
//		//num1�� num2�� ������
//		
//		num1.removeAll(num2);
//		System.out.println("num1��num2�� ������ : "+num1);
//		
//		// num2�� num3�� ������
//		
//		num2.retainAll(num3);
//		System.out.println("num2�� num3�� ������ : "+num2);
//	
//		// num1, num2, num3�� ������
//		
//		HashSet<Integer> ������ =new HashSet<>();
//		������=(HashSet<Integer>)num1.clone();
//		������.addAll(num2);
//		������.addAll(num3);
//	
//		
//		System.out.println("num1+num2+num3�� ������ : ������);

		

		
		
		
//		HashSet<String> �� = new HashSet<>();
//		�� = (HashSet<String>)����.clone();
//		��.addAll(���);
//		
//		System.out.println(��);
		
		// ������ - addAll
		// ������ - retainAll   ����.retainAll(���)
		// ������ - removeAll   ����.removeAll(���)
		
			
		
		
	
		
		// num1, num2, num3 ������ ������ �����
		// ���� 1~50������ ������ 15�� ������ �ϼ���
		// num1�� num3�� ������
		// num1�� num2�� ������
		// num2�� num3�� ������
		// num1, num2, num3�� ������
		
		
		
			while(num1.size()<15) {
	
			num1.add(Integer.valueOf((int)(Math.random()*50)+1) );
			}
			System.out.println(num1);
			
			while(num2.size()<15) {
			num2.add(Integer.valueOf((int)(Math.random()*50)+1) );
			}
			System.out.println(num2);
			
			while(num3.size()<15) {
			num3.add(Integer.valueOf((int)(Math.random()*50)+1) );
			}
			System.out.println(num3);
		
			
			HashSet<Integer> ������1_3, ������2_3, ��, ������;
			
			������1_3=(HashSet)num1.clone();
			������1_3.retainAll(num3);
			System.out.println(������1_3);
			
			������2_3=(HashSet)num2.clone();
			������2_3.retainAll(num3);
			System.out.println(������2_3);
		
			��=(HashSet)num1.clone();
			��.removeAll(num2);
			System.out.println(num1);
			
			������=(HashSet)num1.clone();
			������.addAll(num2);
			������.addAll(num3);
			System.out.println(������);
		
		
		
		
		
		
//		HashSet<String> ���� = new HashSet<>();
//		HashSet<String> ��� = new HashSet<>();
//		
//		����.add("¥���"); ����.add("������");
//		����.add("���"); ����.add("�޲ٹ̺���");
//		
//		���.add("��ġ������"); ���.add("������");
//		���.add("¥���"); ���.add("���");
//		
//		System.out.println(����);
//		System.out.println(���);
//		// ������ - �ΰ� �̻��� �׷쿡 �������� ���� ����
//		
//		HashSet<String> ���� = new HashSet<>();
//		
//		

//		
//		while(it.hasNext()) {
//			String ����food=it.next();
//			if(���.contains(����food)) {
//				����.add(����food);
//			}
//			
//		}
//		
//		System.out.println("����, ��� ������ : " + ����);
//		
//		// ������ - A���հ� B���հ��� �����յ����͸� ������ ������������
//		
//		HashSet<String> ������=new HashSet<>();
//		
//		it = ����.iterator();
//		while(it.hasNext()) {
//			String ����food=it.next();
//			if(!���.contains(����food)) {
//				������.add(����food);
//			}
//		}
//		
//		System.out.println("��ο� ���� ���� ������ : " + ������);
//		
//		// ������ - A���հ� B������ �� (�ߺ�����)
//		
//		HashSet<String> �� = new HashSet<>();
//		�� = (HashSet<String>)����.clone();
//		��.addAll(���);
//		
//		System.out.println(��);
		
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
