package java0710_2;

import java.util.Scanner;

public class InnerClass1 {

	public static void main(String[] args) {
		Out out = new Out();
		out.num=100;
		out.obj.age=34;
		out.obj.setName("�̼���");
		
		Out.�ν��Ͻ�����Ŭ���� in =  out.new �ν��Ͻ�����Ŭ����();
		in.age=20;
		in.setName("������");

	}

}
// static���� ���� �� ������ ������ �޼���� 
//  �ν��Ͻ� �޼��忡�� ��밡��
// �ν��Ͻ� ����, �޼����  
//  static �޼��忡�� ��� �Ұ�

// static ������   ���α׷� �����Ҷ� ����
// �������� ���α׷� �����߿� ����



class Out{
	static int count; // Ŭ���� ����
	int num;  // �ν��Ͻ�����
	private String job; // �ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();
	
	interface Car{ // ���� �������̽�
		void make();
	}
	void makeCar() {
		
		Car c = new Car() { 
			@Override
			public void make() {
				System.out.println(" �͸� Ŭ������ ���� �����");
			}
		};
		c.make();
		
	}
	
	
	
	void buyComputer() {
		
		 class ����Ŭ����{ // �޼��� ���ο��� ��� ������ Ŭ����
			int weight;
			void del() {
				
			}
		}
		����Ŭ���� ob = new ����Ŭ����();
	}
	
	
	static void save() {
		
	}
	static class ����Ŭ����{ // Out Ŭ���� ��ü�� ������ �ʴ´�.
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	
	class �ν��Ͻ�����Ŭ����{ // static ����,�޼��� �Ұ�
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		void create() {
			count = 10;
		}
	}
	
}

/* ����Ŭ���� - Ŭ���� ���ο����� ��� ������ Ŭ����
	1. �ν��Ͻ� ���� Ŭ���� 
	2. ���� ���� Ŭ����
	3. ���� ���� Ŭ����
	4. �͸� ���� Ŭ����
	
	
	
*/