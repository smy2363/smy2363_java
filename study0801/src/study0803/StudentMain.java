package study0803;

public class StudentMain {

	public static void main(String[] args) {
		
	
		Student stu1 = new Student("��ö��", 90);
		Student stu2 = new Student("�迵��", 85);
		
		//�ν��Ͻ� �޼��� ȣ��: �л�����ǥ��
		
		stu1.info();
		stu2.info();
		System.out.println();
		
		//Ŭ���� �޼ҵ� ȣ��: �л� ���� ���Ѱ�� 
		int total=Student.sum(stu1.score,stu2.score);
		System.out.println("���հ� : " + total);
    
	}

}
