package Study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) {
		// 자바의 자료구조
		// 자료구조란 데이터를 효율적으로 저장 관리하기 위한 구조
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("이순신");
		arr.add("김경제");
		arr.add("송영진");
		arr.add("송미연");
		
		System.out.println(arr); //출력용 아님. 확인용임
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		for(String name:arr) {
			System.out.println(name);
		}
		
		
		// ArrayList를 사용하기 - 어려우면 정적배열로 String[]방식
		// 이름 10개저장
		// 이름 중에서 김씨만 출력하기
		
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("김유신");
		name.add("김정희");
		name.add("한석봉");
		name.add("이림");
		name.add("송미연");
		name.add("김사랑");
		name.add("박진희");
		name.add("김희진");
		name.add("오연수");
		name.add("박이슬");
		
		for(String kim:name) {
				System.out.println(kim.indexOf("김"));
			
		}
		



	
	
	
	
	}

}
