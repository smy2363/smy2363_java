package java0626;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
	/*
	  // ���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
	     ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
	     
	      ����2.
	      �����̸�, �ҼӺμ���, ���޿����� Ű���带 ���� �Է¹޴´�.
	      ������ 8%�� ����. �Ǽ��ɾ��� ������ ���
	      �̸�, �μ�, �Ǽ��ɾ��� ����ϼ���

	 */
		int �޿�=0;
		String �����̸�=null, �ҼӺμ���=null;
		float ����=0.08f;
		int �Ǽ��ɾ�=0;
		
		
		System.out.print("�޿���?");
		�޿�=scan.nextInt();
		System.out.print("���� �̸���?");
		�����̸�=scan.next();
		System.out.print("�Ҽ� �μ�����?");
		�ҼӺμ���=scan.next();
	    �Ǽ��ɾ�=(int)(�޿�-(�޿�*����));
		System.out.print("�Ǽ��ɾ���?"+�Ǽ��ɾ�+"��\n");
		


		System.out.println("�޿���?" + �޿�+"��");
		System.out.println("���� �̸���?"+ �����̸�);
		System.out.println("�Ҽ� �μ�����?"+�ҼӺμ���);
		System.out.println("�Ǽ��ɾ���?"+�Ǽ��ɾ�+"��");
		

		System.out.print("�޿���?");
		�޿�=scan.nextInt();
		//Integer.parseInt(sc.nextLine()); ���� �ۼ��� �ؽ�Ʈ���� �����ص���
		System.out.print("���� �̸���?");
		�����̸�=scan.next();
		System.out.print("�Ҽ� �μ�����?");
		�ҼӺμ���=scan.next();
		�Ǽ��ɾ�=(int)(�޿�-(�޿�*����));
		System.out.print("�Ǽ��ɾ���?"+�Ǽ��ɾ�+"��");


		// ���ڴ����� ���ڰ� ����� scan.nextLine(); �� �� ������Ѵ�.
		// next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��
		// nextLine() - ����Ű
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
