package homeWork0801;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//����ڷκ��� �ֹε�Ϲ�ȣ �Է� �ޱ�
    	System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(����:YYMMDD-1234567):");
    	String residentNumber = sc.nextLine();
    	
    	//�ֹε�Ϲ�ȣ ���� �˻�
    	if(residentNumber.length() != 14 ||residentNumber.charAt(6) != '-') {
    		System.out.println("�ֹε�Ϲ�ȣ ������ �߸��Ǿ����ϴ�");
    	}else{
    		//���� �Ǻ� (���ڸ��� ù��° ����)
    		char genderCode = residentNumber.charAt(7);
    		if(genderCode =='1' ||genderCode == '3') {
    			System.out.println("���� : ����");
    		}else if(genderCode =='2'||genderCode =='4') {
    			System.out.println("����: ����");
    		}else {
    			System.out.println("�߸��� �����ڵ� �Դϴ�.");
    		}
    	}
    	
    }
}
