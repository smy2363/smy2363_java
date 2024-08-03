package homeWork0801;

public class aa {

	public static void main(String[] args) {
		
		
		//replace 활용 예제
		
		// banana melon apple 문자열에서  
		// 1. a을 o로 바꾸시오
		// 2. 빈공간을 없게하세요
		// 3. 빈공간을 _로 대체하세요
		
		String fruit="banan melon apple";
		String fruit2=fruit.replace("a","o");
		String fruit3=fruit.replace(" ","");
		String fruit4=fruit.replace(" ", "_");
		System.out.println(fruit2);
		System.out.println(fruit3);
		System.out.println(fruit4);
		
		//subString 활용 예제
		// "세상에서 제일 맛있는 과일은?" 중에서 
		// 1. 세상에서만 추출하시오
		// 2. 맛있는만 추출하시오
		// 3. 제일 맛있는 과일은? 을 추출하시오
//		
//		String str="세상에서 제일 맛있는 과일은?";
//		String str1=str.substring(0,4);
//		String str2=str.substring(8,11);
//		String str3=str.substring(5);
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		
//		

	}

}
