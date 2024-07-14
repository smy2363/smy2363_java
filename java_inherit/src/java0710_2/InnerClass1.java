package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out = new Out();
		out.num=100;
		
	}

}

class Out{
	static int count; // 클래스 변수
	int num; // 인스턴스 변수
	private String job; // 인스턴스 변수

	class 인스턴스내부클래스{
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		
	}

}

/*  내부 클래스 - 클래스내부에서만 사용 가능한 클래스
 	 1. 인스턴스 내부 클래스
 	 2. 정적 내부 클래스
 	 3. 지역 내부 클래스
 	 4. 익명 내부 클래스
 */