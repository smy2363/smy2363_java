package Study1;

import java.util.ArrayList;

public class study2 {

	public static void main(String[] args) {
		// �ڹ��� �ڷᱸ��
		// �ڷᱸ���� �����͸� ȿ�������� ���� �����ϱ� ���� ����
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("�̼���");
		arr.add("�����");
		arr.add("�ۿ���");
		arr.add("�۹̿�");
		
		System.out.println(arr); //��¿� �ƴ�. Ȯ�ο���
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		for(String name:arr) {
			System.out.println(name);
		}
		
		
		// ArrayList�� ����ϱ� - ������ �����迭�� String[]���
		// �̸� 10������
		// �̸� �߿��� �达�� ����ϱ�
		
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("������");
		name.add("������");
		name.add("�Ѽ���");
		name.add("�̸�");
		name.add("�۹̿�");
		name.add("����");
		name.add("������");
		name.add("������");
		name.add("������");
		name.add("���̽�");
		
		for(String kim:name) {
				System.out.println(kim.indexOf("��"));
			
		}
		



	
	
	
	
	}

}
