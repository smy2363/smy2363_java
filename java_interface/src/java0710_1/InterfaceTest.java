package java0710_1;

abstract class animal{ // 부모클래스
	
	//public abstract void fly(); 
	public abstract void sound(); // 추상메서드
}

class dog extends animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
class cat extends animal{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}




public class InterfaceTest {

	public static void main(String[] args) {
		animal d = new dog();
		animal c = new cat();
		
		d.sound();
		c.sound();
	}

}


/*
	동물들의 소리를 출력한다.
	개,고양이,닭, 비둘기, 소 등등
	각 동물은 서로 다른 개체 이기 때문에 각각의 클래스로 구현
	하지만 개, 고양이, 닭 들은 동물로 통합 이 가능 하므로
	animal이라는 부모 클래스를 두겠다.
	
	
	
 */