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
		// 입력값보다 큰 값중에서 가장 가까운값 검색
		System.out.println(tree.higher(15));
		System.out.println(tree.lower(19));
		
		
		// 입력값보다 작은 모든 값
		System.out.println(tree.headSet(35));
		System.out.println(tree.tailSet(30));
		
		// 입력값들의 사이 값을 검색(10이상 39미만)
		System.out.println(tree.subSet(10, 39));
	
		
		TreeSet<String> word = new TreeSet<>();
		
		word.add("이순신"); word.add("문익점");
		word.add("장보고"); word.add("김유신");
		word.add("정도전"); word.add("박팽년");
		word.add("성상문"); word.add("마골피");
		word.add("나훈아");
		
		System.out.println(word.higher("아"));
		System.out.println(word.headSet("라면"));
		System.out.println(word.subSet("나","자"));
		
		System.out.println(word.subSet("ㄴ", "ㅇ"));
		

	}

}

/*
	Tree 구조를 이용하여 값을 저장시키는 TreeSet
	 - 순차적으로 데이터를 저장하지 않는다.
	 - 중복 허용 하지 않음
	 - 이진트리를 사용하기 때문에 데이터가 정렬 되어 출력된다.
	 - 범위 검색 또는 데이터 중복방비및 정렬에 용이 하다.
	 

*/
