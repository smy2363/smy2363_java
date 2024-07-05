package homeProduct;

public abstract class House{
	
	protected boolean onOff;
	protected String brand; //제품 브랜드
	protected int price; //제품 구매가격
	
	protected House(){
		this.onOff=false;
	}
	
	protected House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	protected abstract void power(); // 추상 메서드


}

// 추상클래스 - class 앞에 abstract를 붙인다.
// 추상클래스는 객체 생성불가
// 추상메서드를 가지고 있는 클래스는 반드시 추상클래스가 되어야한다.
// 부모클래스가 추상클래스라면 반드시 자식클래스는 추상메서드를
// 정의해야한다.
// 부모의 추상메서드를 재정의 하지 않을거라면 자식클래스는 추상클래스가 
// 되어야 한다.
