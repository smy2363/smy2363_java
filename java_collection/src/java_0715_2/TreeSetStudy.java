package java_0715_2;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(30); tree.add(45); tree.add(20);
		tree.add(9);  tree.add(40); tree.add(15);
		tree.add(48); tree.add(2);  tree.add(11);
		tree.add(39);
		
		System.out.println(tree);
		
		

	}

}

/*
	Tree 구조를 이용하여 값을 저장시키는 TreeSet
	 - 순차적으로 데이터를 저장하지 않는다.
	 - 중복 허용 하지 않음
	 - 이진트리를 사용하기 때문에 데이터가 정렬 되어 출력된다.
	 - 범위 검색 또는 데이터 중복방비및 정렬에 용이 하다.
	 

*/
