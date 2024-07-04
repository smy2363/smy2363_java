package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaMethod2 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Member member1= new Member("�̼���", 31, "����");
		Member member2= new Member("������", 29, "�����������");
		Member member3= new Member("�念��", 45, "��������");
		// �¾ �⵵
		
		member1.birth();
		member2.birth();
		member3.birth();
		
		//���� - 20���ΰ�? 30���ΰ�? 40���ΰ�? 50���ΰ�?
		
		DataIdenti dataIdenti=new DataIdenti();
		dataIdenti.ageGroup(member3.name,member3.age);
		dataIdenti.ageGroup(member2.name,member2.age);
		dataIdenti.ageGroup(member1.name,member1.age);
		
		// �����з� - �������� �з��� ���� ǥ��
		// ��³��� - �̼��� : 05.����
		
		
		JobGroup jobGroup=new JobGroup();
		jobGroup.workGroup(member2.name,member2.job);
		
		
		
//		System.out.println(today.getYear());
		
		// �⵵ - .getYear();
		// �� - .getMonthValue();
		// �� - .getDayOfMonth();
		// ���� - .getDayOfWeek().getValue(); 
		// 1(������), 2(ȭ����), ...,7(�Ͽ���)

		
		
//		Calendar cal=Calendar.getInstance(); //�߻�Ŭ�����̱⶧���� getInstance(); �� ����� �����
//		int year=cal.get(Calendar.YEAR);
//		int ��=cal.get(Calendar.MONTH)+1;
//		int ��=cal.get(Calendar.DAY_OF_MONTH);
//		int ����=cal.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(year);
//		
//		System.out.println(��);
//		System.out.println(��);
//		System.out.println(����);
		
//		Date today=new Date(); //�������� ����
//		System.out.println(today.get); //�������� ����
		
	}
}

// ��Ʈ�ѿ� Ŭ����, ��������� ���� Ŭ����, ������ Ŭ����
// Controller, Service, DTO(VO)
	


		class JobGroup{
			void workGroup(String name, String job) {
				
				String work=null;
				
				switch(job) {
				case "����": work="05.����";
					break;
				case "�����������": work="18.�����Ǻ�";
					break;
				case "��������": work="15.���";
					break;
				}
				System.out.println(name+":"+work);
			}
		}





		class DataIdenti{ // ���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
			
			void ageGroup(String name, int age) {
				
				String group=null;
				group=(age/10)+"0��";
				System.out.println(name+":"+group);
				
			}
			
		}




		class Member{
			String name; // �̸�
			int age; // ����
			String job; //����
			//�⺻ �����ڸ޼���
			Member(){}
	
			//�Ű������� �ִ� ������ �޼���
			Member(String name, int age, String job){
				this.name=name;
				this.age=age;
				this.job=job;
			}
			
			
	// �¾ �⵵ �����ΰ� ����ϴ� �޼���	
		void birth() {
			 LocalDate today=LocalDate.now();
			 int nowYear=today.getYear();
			 // ȭ�� ��� - �̼��� �¾�⵵ : 0000��
		
			 int birthYear1=nowYear-this.age;
			 System.out.printf("%s �¾�⵵ : %d�� \n", this.name, birthYear1);
		
	}
		
		
			
			
}



// �޼��峪 �Լ��� ����ϴ� ����
// �迭, ���, �ܼ� ��� - �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ��������.
// �޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.
// 