package java0717;

import java.util.ArrayList;

public class GenericStudy1 {

	public static void main(String[] args) {
		
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit( new Apple() );
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit( new Banana() );
		
		FruitBox<Grape> grapeBox = new FruitBox<>();
		grapeBox.setFruit( new Grape() );
		
		
		//���׸����� ���ߴٸ� ����ȯ�� �ʿ���
		// Apple apple = (Apple)appleBox.getFruit();
		Apple apple = appleBox.getFruit(); 
		
//		FruitBox<Toy> toyBox = new FruitBox<>();
//		toyBox.setFruit( new Toy() );
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit( new Apple() );
		
		Juice j = new Juice();
		j.makeJuice( appleBox );
		j.makeJuice( bananaBox );
		
		Fruit a = new Apple();
			  a = new Banana();
			  a = new Grape();
			  

		
		
		
		
		
		
		
//		A<String> a = new A<>();
//		// A<String> -> AŬ������ ���׸�Ÿ�� T�� String���� 
//		// �����ȴ�. item������ String item���� ���ȴ�.
//		a.setItem("�̼���");
//		
//		A<Integer> b = new A<>();
//		b.item=123;
		
	}

}

class A<T>{
	T item;
//	T[] arr = new T[3]; // new������ �����Ұ�.Ÿ���� ��Ȯ�����ʱ⶧���� �̻��¿����� �Ұ����� 
	ArrayList<T> list = new ArrayList<>(); //�����迭 ����°� ������. 

	void setItem(T item) {
		this.item=item;
	}
}

class B{
	int item1;
	String item2;
	float item3;
	char item4;
	
	void setItem(int item) {
		this.item1=item;
	}
	void setItem(String item) {
		this.item2=item;
	}
	void setItem(float item) {
		this.item3=item;
	}
	void setItem(char item) {
		this.item4=item;
	}
}



/*

	Generic
	
	- Ŭ���� ������ Ÿ���� ���� �ϴ� ���
	���׸� Ÿ�� ǥ��
	
		T - type
		E - element
		K - key
		N - number
		
	- Ŭ������ ���׸� ǥ�� ���
		class A<T>
	- ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�.
		A<Tea> a = new A<Tea>();
	- ���� ���� Ŭ������� ��� �����ϴ�.
	- ���׸�Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
	  class A<T extends Parent>
	  -> Parent Ŭ������ �ڽ� Ŭ������ Parent Ŭ������
	  	 ���׸����� Ÿ�� ������ �����ϴ�
	  	 �̿� �ٸ� Ŭ�������� �Ұ�
	  -> ���� Ÿ������ ������ ���� �� �� �ִ�.
	  	 �������̽��� ���� Ÿ�� ���� ����, Ŭ������ �ȵ�
	  	 
	- ���׸� ���ϵ� ī�� <?> 
	- ���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
	- �޼����� �Ű�����Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ�
	  Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ �ٽ��ѹ�
	  ���׸� ���� �ؾ� �Ѵ�.
	  �̶� ���Ǵ� ���� ���� ��� �Ѵٶ�� �ؼ� ? �� ǥ��
	  
	- ���ϵ� ī���� ����
	  <? extends T> : T Ŭ������ �� �ڽı��� ����
	  <? super T> : T Ŭ������ �� ������� ����(�ڽľȵ�)
	  
	  
*/
