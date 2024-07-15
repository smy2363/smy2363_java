package java_0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		
		String now ="���̹�";
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("�̵������� �Է�(1.�� 2.��) : ");
			String temp=sc.nextLine();
			
			if(temp.equals("1") && !back.isEmpty()) { // ���� ������ �̵�
				pre.push(now); //���� �������� ���� ���ÿ� ����
				now = back.pop();
				
			}else if(temp.equals("2") && !pre.isEmpty()) { // �� ������ �̵�
				back.push(now);
				now = pre.pop();
				
			}else if(!(temp.equals("1")||temp.equals("2")) ) { // �� ������ �̵�
				back.push(now);
				pre.clear();
				now = temp;
			}
			
			System.out.println("���������� :" + now);
			System.out.println("back ������ ��� : " + back);
			System.out.println("pre ������ ��� : " + pre);
		}
		
		
		
		
		
		
		
		//		Stack<String> st = new Stack<>();
//		
//		st.push("�̼���");
//		st.push("������");
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		
//		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st);
//		System.out.println(st.search("������"));
//		
//		System.out.println(st.size());
//		
//		
//		// st.size() - st.search("������")
//		// pop�޼��带 ���� Ƚ��
//		
//		System.out.println(st.isEmpty());

	}

}


/* stack

	�����͸� �����ϱ����� �Ա��� ����ϱ� ���� �ⱸ�� ����.
	�Ѱ��� ���� ����� ����� �̷������ �����̴�.
	FILO - first in last out
	

*/