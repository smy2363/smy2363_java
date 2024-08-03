package study0803;

public class DollMain {

	public static void main(String[] args) {
		
		Doll doll = new Doll();
		Doll doll2 = new Doll();
		Doll doll3 = new Doll();
		
		//클래스 변수는 모두 같이공유하기때문에 doll만 바뀌어도 모든클래스 변수가 바뀐다
		
		doll.factory = "뭉크팩토리";
		doll.name = "미미";
		doll.gender= "여자";
		
		doll2.name = "철수";
		doll2.gender= "남자";
		
		doll3.name = "라라";
		doll3.gender= "여자";
		
		System.out.println("doll****");
		doll.info();
		System.out.println("doll2****");
		doll2.info();
		System.out.println("doll3****");
		doll3.info();

	}

}
