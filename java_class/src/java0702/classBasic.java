package java0702;

public class classBasic {

	public static void main(String[] args) {
		
		
		// ���� �� Ŭ���� Ÿ���� ������ ���� �Ѵ�.
		// ������ ������ �����͸� �����Ѵ�.
		// Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ�����Ѵ�.
		
		//Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name="�̼���";
		member1.age=23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name="������";
		member2.age=34;
		
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		// java - 495p, �޸�����ȭ��� - 893p
		Book book1=new Book();
		Book book2=new Book();
		
		book1.title="java";
		book1.page=495;
		
		book2.title="�޸�����ȭ���";
		book2.page=893;
		
		System.out.println(book1.title);
		
		//����Ʈ�� ��ǰ��, �ü��, �޸�(ram) ũ�⿡ ����
		// ������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ� �����Ͽ�
		// �� ����, ����� �ϼ���
		
		Phone �Ｚ��=new Phone();
		Phone ������=new Phone();
		Phone ������=new Phone();
		
		�Ｚ��.��ǰ�� = "������s24";
		�Ｚ��.�ü�� = "�ȵ���̵�";
		�Ｚ��.�޸� = 12;
		
		������.��ǰ��  = "������15";
		������.�ü�� = "ISO16";
		������.�޸� = 8;
		
		������.��ǰ�� = "�����";
		������.�ü�� = "������OS";
		������.�޸� = 12;

		System.out.println(������.��ǰ��);
		System.out.println(������.�ü��);
		System.out.println(������.�޸�);
		
		
	}

}

class Phone{
	String ��ǰ��;
	String �ü��;
	int �޸�;
	Member a = new Member();

}


//å ����� ������������ �����ϱ����� Ŭ���� ����

class Book{
	String title;
	int page;
}

// Ŭ���� - ���赵, ��ü - ��ǰ
// Ŭ���� - �ؾƲ, ��ü - �ؾ

// Ŭ������ ����� ���� ������ Ÿ�� �̶�� �Ѵ�.

class Member{//Member ��� �̸��� Ŭ���� ����
	String name; //�̸�
	int age; //����
}