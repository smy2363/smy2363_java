package study0803;

public class DollMain {

	public static void main(String[] args) {
		
		Doll doll = new Doll();
		Doll doll2 = new Doll();
		Doll doll3 = new Doll();
		
		//Ŭ���� ������ ��� ���̰����ϱ⶧���� doll�� �ٲ� ���Ŭ���� ������ �ٲ��
		
		doll.factory = "��ũ���丮";
		doll.name = "�̹�";
		doll.gender= "����";
		
		doll2.name = "ö��";
		doll2.gender= "����";
		
		doll3.name = "���";
		doll3.gender= "����";
		
		System.out.println("doll****");
		doll.info();
		System.out.println("doll2****");
		doll2.info();
		System.out.println("doll3****");
		doll3.info();

	}

}
