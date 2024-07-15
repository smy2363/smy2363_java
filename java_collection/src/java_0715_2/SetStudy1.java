package java_0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
		
		HashSet<String> 재학 = new HashSet<>();
		HashSet<String> 상민 = new HashSet<>();
		
		재학.add("짜장면"); 재학.add("볶음밥");
		재학.add("돈까스"); 재학.add("쭈꾸미볶음");
		
		상민.add("김치볶음밥"); 상민.add("떡볶이");
		상민.add("짜장면"); 상민.add("돈까스");
		
		System.out.println(재학);
		System.out.println(상민);
		// 교집합 - 두개 이상의 그룹에 공통적인 값의 집합
		
		HashSet<String> 공통 = new HashSet<>();
		
		Iterator<String> it = 재학.iterator();
		
		while(it.hasNext()) {
			String 재학food=it.next();
			if(상민.contains(재학food)) {
				공통.add(재학food);
			}
			
		}
		
		System.out.println("재학, 상민 교집합 : " + 공통);
		
		// 차집합 - A집합과 B집합과의 교집합데이터를 제외한 데이터의집합
		
		HashSet<String> 차집합=new HashSet<>();
		
		it = 재학.iterator();
		while(it.hasNext()) {
			String 재학food=it.next();
			if(!상민.contains(재학food)) {
				차집합.add(재학food);
			}
		}
		
		System.out.println("상민에 대한 재학 차집합 : " + 차집합);
		
		// 합집합 - A집합과 B집합의 합 (중복없이)
		
		HashSet<String> 합 = new HashSet<>();
		합 = (HashSet<String>)재학.clone();
		합.addAll(상민);
		
		System.out.println(합);
		
		// 합집합 - addAll
		// 교집합 - retainAll   재학. retainAll(상민)
		// 차집합 - removeAll   재학.removeAll(상민)
		
			
		
		
//		HashSet<String> hash=new HashSet<>();
//		
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨국수");
//		hash.add("맑은곰탕");
//		hash.add("짜장면");
//		
//		System.out.println(hash);
//		
//		hash.remove("짬뽕");
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
 	Set 인터페이스 
 	
 	 - HashSet, TreeSet
 	 - 순차대로 저장 되지 않는다.
 	 - 중복 허용하지 않는다.
 	 - 인덱스가 없다.
 	 - Set은 집합(데이터의 그룹)을 다룰때 사용된다.
 	 - HashSet -> 집합을 표현
 	 - TreeSet -> 검색에 특화
 	 
 	
 	
*/
