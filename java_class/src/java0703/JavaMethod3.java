package java0703;

import java.util.Scanner;

public class JavaMethod3 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		// ���� �ΰ� �Է� �޾� ���� ����ϱ�
		Calc calc=new Calc();
		calc.sum(40,10);
//		calc.sum();
		
		// �������� ������ ���Ͽ� ����ϼ���
		
		
		int kor=89, eng=74, mat=43;
		
		Score score=new Score();
		score.sum(kor, eng, mat);
		
		// �޼��� ȣ���Ͽ� '�޼��� dog����~' ��� ���
		
		calc.dog();
		
		calc.view(); //view �޼��� ȣ��
		
		// �޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		// �Ű����� ���� �޼���, Ű���带 �Է�X
		
		calc.nameAge();
		
		// �޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal="��帮Ʈ����";
		String ������="2024-07-01";
		
		TestMethod testMethod=new TestMethod();
		testMethod.dog(animal,������);
		
		// ���� ��¥�߿��� ���� �ϸ� ����ϼ���
		//���ڿ� �޼��� substring �Ǵ� split ���
		String examDate="2024-08-13";
		
		testMethod.day(examDate);
		
		// �� ����� ������� ���� ���Ͽ� ����ϼ���
		// ��հ��� �����Դϴ�.
		int ���=31, ����=23, ���� =28, ���=37;
		
		testMethod.age(���, ����, ����, ���);


	
	}

}

// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���������� Ŭ�����̸��� ���� ���


		
		class TestMethod{
			
			void age(int ���, int ����, int ����, int ���) {
				int avg=(���+����+����+���)/4;
				System.out.println("\n"+"4���� ���� ��հ���? "+avg);
			    }
			
			void day(String date) {
//				String days=examDate.substring(6,10);
//				System.out.println(days);
				String[] current=date.split("-");
				System.out.print(current[1]+" "+current[2]);
				}
			
			void dog(String animal, String ������){
				System.out.println("������������ ?"+animal+"\n"+"�������� ?"+������);

			}
			
				
		}
		


		class Score{
			void sum(int kor, int eng, int mat) {
				int result1=kor+eng+mat;
				System.out.println("������ ?"+result1);
			}
		}


		class Calc{
			
		
			
			void nameAge() {
				String name="ȫ�浿"; int age=35;
				System.out.println("�̸���? "+name+"\n"+"���̴�? "+age+"��");
			}
			
			
			void view() {// ����a,b�� �� ����ϴ� �޼���
				int a=10, b=20; 
				System.out.println(a+","+b);
			}
			
			void dog() {
				System.out.println("�޼��� dog����~");
			}
			
			void sum(int num1, int num2) {
				int result=num1+num2;
				System.out.println("�� : "+result);
			}
			
			void sum() {
				Scanner scan=new Scanner(System.in);
				System.out.print("ù��° ���� : ");
				int num1=scan.nextInt();
				System.out.print("�ι�° ���� : ");
				int num2=scan.nextInt();
				int result=num1+num2;
				System.out.println("�� : "+ result);
			}
		}