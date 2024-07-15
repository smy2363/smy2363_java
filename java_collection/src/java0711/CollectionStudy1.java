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
		
		
		// 김춘추, 장영실, 이성계, 정몽주 , 정도전, 김정호
		// 위 이름을 ArrayList에 저장 하고 출력하세요 
		
		ArrayList<String> names = new ArrayList<>();
		names.add("김춘추");   names.add("장영실");
		names.add("이성계");   names.add("정몽주");
		names.add("정도전");   names.add("김정호");
		
		ArrayList<String> names2 = 
				new ArrayList<>(
						Arrays.asList(
								new String[] {
	"김춘추", "장영실", "이성계", "정몽주" , "정도전", "김정호"						
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
		
		//  이름이 저장 되어있는 ArrayList에 이순신이 없으면 추가저장 하고
		//  있으면 저장안하기    문제
		
		if( !names.contains( new String("이순신") ) ) {
			names.add("이순신");
		}
		System.out.println( names );
	}

}

/*
 	자바 컬렉션 프레임워크
 	
 	데이터를 저장,관리 하기위한 자료구조 와
 	데이터를 가공 처리 하는 알고리즘이 구현 되어있는 
 	클래스들의 집합체 
 	
 	Collection  , Map 인터페이스
 	
 	Collection 인터페이스 
 		- List 인터페이스
 			ArrayList 클래스
 			vector
 			LinkedList
 			Stack
 			Queue
 		- Set 인터페이스
 			HashSet
 			TreeSet
 			LinekdHashSet
 			
 	Map 인터페이스
 		- HashMap
 		- TreeMap
 		- LinkedHashMap
 	
 */