package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		
		Out out = new Out();
		out.num=100;
		
	}

}

class Out{
	static int count; // Ŭ���� ����
	int num; // �ν��Ͻ� ����
	private String job; // �ν��Ͻ� ����

	class �ν��Ͻ�����Ŭ����{
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		
	}

}

/*  ���� Ŭ���� - Ŭ�������ο����� ��� ������ Ŭ����
 	 1. �ν��Ͻ� ���� Ŭ����
 	 2. ���� ���� Ŭ����
 	 3. ���� ���� Ŭ����
 	 4. �͸� ���� Ŭ����
 */