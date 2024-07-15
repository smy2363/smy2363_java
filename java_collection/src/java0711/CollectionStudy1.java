package java0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		// Byte - byte
		// Short - short
		// Integer - int
		// Long - long
		// Float -float
		// Double - double
		// Character - char
		// Boolean - boolean
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add( 89 );
		list1.add( 230 );
		list1.add( 4542 );
		list1.add( 3434 );
		list1.add( 2 );
		//list1.indexOf("aaa");
		
		System.out.println( list1 );
		System.out.println( list1.get(2) );
		
		for( int i=0; i<list1.size(); i++ ) {
			System.out.println(  list1.get(i)  );
		}
		
		System.out.println(  list1.indexOf(232)  );
		System.out.println( list1.contains(3434)  );
		list1.remove(3);
		System.out.println( list1 );
		// list1.remove(230);
		// System.out.println( list1 );
		
		System.out.println( list1.isEmpty() );
		
		list1.add(1,450 );
		System.out.println( list1 );
		System.out.println( list1.lastIndexOf(230) );
		
		list1.forEach( n -> System.out.println( n ) );
		
		for( Integer n : list1) {
			System.out.println(n);
		}
		
		list1.set( 3 , 15);
		System.out.println(  list1 );
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1]=20;
		aa[2]=30;
		
		ArrayList<Integer> alist = 
				new ArrayList<Integer>(Arrays.asList(aa));
		
		Collections.sort( list1 );
		System.out.println( list1 );
		
		list1.remove( Integer.valueOf(89) );
		System.out.println( list1 );
		
		
		// ������, �念��, �̼���, ������ , ������, ����ȣ
		// �� �̸��� ArrayList�� ���� �ϰ� ����ϼ��� 
		
		ArrayList<String> names = new ArrayList<>();
		names.add("������");   names.add("�念��");
		names.add("�̼���");   names.add("������");
		names.add("������");   names.add("����ȣ");
		
		ArrayList<String> names2 = 
				new ArrayList<>(
						Arrays.asList(
								new String[] {
	"������", "�念��", "�̼���", "������" , "������", "����ȣ"						
								})
						);
		
		for(int i=0; i< names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		
		for( String name : names) {
			System.out.println( name);
		}
		
		names2.forEach( name -> System.out.println(name)  );
		
		//  �̸��� ���� �Ǿ��ִ� ArrayList�� �̼����� ������ �߰����� �ϰ�
		//  ������ ������ϱ�    ����
		
		if( !names.contains( new String("�̼���") ) ) {
			names.add("�̼���");
		}
		System.out.println( names );
	}

}

/*
 	�ڹ� �÷��� �����ӿ�ũ
 	
 	�����͸� ����,���� �ϱ����� �ڷᱸ�� ��
 	�����͸� ���� ó�� �ϴ� �˰����� ���� �Ǿ��ִ� 
 	Ŭ�������� ����ü 
 	
 	Collection  , Map �������̽�
 	
 	Collection �������̽� 
 		- List �������̽�
 			ArrayList Ŭ����
 			vector
 			LinkedList
 			Stack
 			Queue
 		- Set �������̽�
 			HashSet
 			TreeSet
 			LinekdHashSet
 			
 	Map �������̽�
 		- HashMap
 		- TreeMap
 		- LinkedHashMap
 	
 */