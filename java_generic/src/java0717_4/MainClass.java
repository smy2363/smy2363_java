package java0717_4;

import java.util.ArrayList;
import java.util.Date;

@FunctionalInterface
interface moveable{
	public void move();
}


class A<T>{
	T item;
	@SafeVarargs
	final void get(T... add) {
			
	}
}

public class MainClass {
	
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {
		aaa();

		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		
		


	}

}

/*
	�����ڸ� ���� �޸� - �ּ�
	annotation - �ּ����� �ǹ̸� ������.
	Ư�� �ڵ���� ��ǻ�Ϳ��� ��������
	ǥ�� annotation, ��Ÿ annotation
	
	ǥ�� annotation
	@Override
	�����Ϸ����� �޼��带 �������̵� �ϴ°��̶�� �˷��ش�.
	
	@Deprecated
	������ ������� ���� ����̶�� �˷��ش�.
	
	@SuperWarnings
	�����Ϸ� ��� ������� �ʰ� �ϵ��� ����
		- @SuppressWarnings("all") ��� ��� ����
						   ("deprecation") ��������ʴ� ��� ��� ����
						   ("null") null�� ���õ� ��� ����
						   ("unchecked") ��Ȯ�� ���۷��̼� ��� ����
						   ("unused") ��������ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ������
						   	
	@FunctionalInterface
	�Լ��� �������̽���°��� �˷��ش�.
	
	@SafeVarargs
	���׸��� ���� ���������� �Ű������� ����Ҷ� ��� ��Ÿ���� �ʱ�
	
	
	��Ÿ annotation
	@Target - annotation�� �����Ҷ� ������ ��� ����
	@Documented - javadoc�� �ۼ��� ������ ����
	@Inherited - ����Ŭ������ ��ӵǵ��� �Ҷ� ���
	@Retention - annotation �Ⱓ ���� (�����߿��Ұ��� ���ϻ��¿��� ����ǰ��Ұ����� Ŭ�������Ͽ��� �����ϰ��Ұ�����)
	@Repeatable - annotation �ݺ� ���� 
	
	
	

*/