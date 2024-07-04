package homeProduct;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Tv tv=new Tv();
		tv.brand="삼성";
		tv.power();
		tv.power();
		
		Aircon air=new Aircon();
		air.brand="LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();
		
		
		
		
	}

}

// 클래스 상속
// 상속 하려면 자식클래스이름 뒤에 extends 부모클래스이름
// extends - 확장, 연장...
// Tv extends House -> Tv클래스가 자식클래스이고 House가 부모클래스이다.
// 상속을 하는 가장큰 이유- 다형성
// 부모클래스의 인스턴스변수, 인스턴스메서드, 클래스변수, 
//			클래스메서드 사용가능하다.
// 단, 부모클래스의 모든걸 사용하지는 못한다.
// 제어걸려있는 변수나 메서드는 사용불가

