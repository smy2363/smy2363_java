package study0803;

public class study0803_2 {

	public static void main(String[] args) {
		
		Test.a=100;
		System.out.println(Test.add(20,10));
		
		
		Test t=new Test(); //��ü������ �ݵ�� �ʿ���
		t.a1=10; //t��ü��  a1������ 10�� ����
		t.b1=20; //t��ü�� b1������ 20�� ����
		System.out.println(t.add()); // �ν��Ͻ� �޼���. �ν��Ͻ� ������ ����� ���� ������
									// �ν��Ͻ� �޼��忡�� ����� �������ش�.

	}

}
