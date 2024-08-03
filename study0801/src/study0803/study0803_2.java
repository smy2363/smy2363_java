package study0803;

public class study0803_2 {

	public static void main(String[] args) {
		
		Test.a=100;
		System.out.println(Test.add(20,10));
		
		
		Test t=new Test(); //객체생성이 반드시 필요함
		t.a1=10; //t객체의  a1변수에 10을 저장
		t.b1=20; //t객체의 b1변수에 20을 저장
		System.out.println(t.add()); // 인스턴스 메서드. 인스턴스 변수에 저장된 값을 가져와
									// 인스턴스 메서드에서 계산후 리턴해준다.

	}

}
