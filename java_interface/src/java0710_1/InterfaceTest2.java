package java0710_1;

interface Animal1{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	public void sound(); // �߻�޼���
}
interface bird{
	public void fly();
}


class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}
class Pigeon implements Animal1 , bird{
	@Override
	public void sound() {
		System.out.println("����");
	}
	@Override
	public void fly() {
		System.out.println("Ǫ��� ��ѱ⳯��");
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon p = new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();

	}

}

/*
 	Ŭ���� ���
 	1. ���ϻ�� - �ϳ��� Ŭ������ ��� �����ϴ�.
 	   �ڽ�Ŭ������ �ϳ��� �θ�Ŭ������ ������ �ִ�.
 	   �ٸ� Ŭ������ ����� ����Ϸ��� ���԰���� ����
 	   ���԰���
 	   class A{  }
 	   class B{
 	   		A a=new A();
 	   }
 	   �ڵ��� - Ÿ�̾�, ����, â��, ������, �ڵ�...
 	   �ڵ��� - �ҳ�Ÿ, �ƹݶ�, �׷���, ����Ƽ��, ī�Ϲ�
 	   
 	2. �θ�Ŭ������ ������ �޼��带 ��ӹ޾� ����Ѵ�.
 	   �θ�Ŭ������ public, protected, default������ 
 	      ������ �޼��常 ��ӵȴ�.
 	   �ڽ�Ŭ������ �θ� ������� �ִ� ������ �� �޾ƾ� �Ѵ�.
 	   �ڽ�Ŭ�������忡���� �������� ����. ���������� ����̴�.
 	
 	3. ���� ���� 
 	    �θ� Ŭ������ ������ �ڽ�Ŭ������ ������ �ش�.
 	    
 	�������̽�
 	1. ���� ����
 	   Ŭ������ �������� �������̽��� �����Ͽ� ���� �� �� �ִ�.
 	2. ������
 	   Ŭ������ �ʿ��� �������̽��� �����Ͽ� ���� �� �� �ִ�.
 	3. ���� ����
 	  Ŭ������ �ʿ��� �������̽��� ���� �ϸ� �ǹǷ�  ��Ӱ����϶�����
 	  �������� ���� ����.(��Ӻ��� ������ ����)
 	  
 	  
 	
 */