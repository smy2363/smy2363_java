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
		int �޿�;
		String �����̸�, �ҼӺμ���;
		float ����=0.08f;

		�޿�=scan.nextInt();
		�����̸�=scan.next();
		�ҼӺμ���=scan.next();
		int �Ǽ��ɾ�=(int)(�޿�-(�޿�*����));
		

		System.out.println("�޿���?" + �޿�+"��");
		System.out.println("���� �̸���?"+ �����̸�);
		System.out.println("�Ҽ� �μ�����?"+�ҼӺμ���);
		System.out.println("�Ǽ��ɾ���?"+�Ǽ��ɾ�+"��");

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
