package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		
//		// �ڹٿ��� ���ڿ��� ����Ϸ��� String Ŭ������ ����ؾ� �Ѵ�.
//		// String Ŭ������ ���������� char �⺻������Ÿ���� �迭
//		// char Ÿ������ ������ �迭�� ���� �迭�� �������Ѵ�.
//		// ���α׷����� ���Ǵ� �������� 70%������ ���ڿ� �������̴�.
//		// ���ڿ� ���� �޼���� ���� �� �ݵ�� �������Ѵ�.
//		
//		// ���ڿ� �����͸� �����ϴ¹��
//		
//		String word="i like banana";
//		
//		// ���ڿ��� - �������ڿ��ΰ�?
//		// equals
//		System.out.println("equals:"+(word.equals("i like orange")));
//		
//		// ���ڿ� ���Կ���
//		System.out.println("contains:"+(word.contains("banana")));
//		System.out.println("indexOf :"+word.indexOf("orange"));
//		
//		// ���ڿ� ��ġ��
//		System.out.println(word +"��ġ��");
//		System.out.println(word.concat("��ġ��"));
//		
//		// Ư�� ���� �Ǵ� ���ڿ� ��ġ ã��
//		System.out.println(word.indexOf('b'));
//		System.out.println(word.lastIndexOf('a'));
//
//		// ���ڿ����� Ư�� ���� ����(���ڸ�!!)
//		System.out.println(word.charAt(5));
//		
//		Scanner sc=new Scanner(System.in);
//		
//		// Ű����� �����Է� �ޱ�
////		System.out.println("���ĺ� �ϳ� �Է� : ");
////		char alp=sc.nextLine().charAt(0);
////		System.out.println("�Է��� ���� :"+alp);
//		
//		
//		// �����ڵ��߿��� �⺻ �����ڵ�� �ƽ�Ű�ڵ��̴�.
//		// �ƽ�Ű�ڵ�ǥ�� �� 128������
//		// �ƽ�Ű�ڵ忡�� 65�� �빮��A, 97�� �ҹ��� a�̴�.
//		char ch='��';
//		System.out.println(ch+4);
//		
//		// ���ڿ��� ����
//		System.out.println("���ڿ� ���ڼ� : "+word.length() );
//		
//		//�빮�� �ҹ��� ��ȯ
//		String �빮��=word.toUpperCase();
//		String �ҹ���=word.toLowerCase();
//		
//		System.out.println(�빮��);
//		System.out.println(�ҹ���);
//		
//		// ���� ����
//		String word2="  i hate java ";
//		System.out.println(word2);
//		System.out.println(word2.trim());
//		
//		// �� �޼��� �� ���� ���� ���Ǵ°͵�
//		// equals, contains
//		
//		
//		// ���ڿ� ����
//		System.out.println(Arrays.toString(word.split(" ")) );
//		String name="�̼���@������@������@";
//		
//		String[] names=name.split("@");
//		System.out.println(names[2]);
//		
//		// ���ڿ� �ڸ���(����)
//		
//		System.out.println(word.substring(2));
//		System.out.println(word.substring(6));
//		System.out.println(word.substring(2,6));
//				
//		
//		// ���ڿ� ��ȯ
//				
//		String �ǻǻ�="�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ "
//				+ "�ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
//		
//		String ����=�ǻǻ�.replace("�ǻǻ�", "�׻׻�");
//		System.out.println(����);
//		
//		����=����.replaceAll("�׻׻�","�ѿ��");
//		System.out.println(����);
//		
		//replaceAll������ ����ǥ���� ��밡��
		
		/*
		 
		  ����ǥ����  
		  ^ - ���ڿ��� ����
		  $ - ���ڿ��� ����
		  . - ������ �� ����
		  * - �� ���ڰ� �ְų� ���ų� ( *�� -> �� �γ����� �ܾ�)
		  + - �� ���ڰ� �ϳ� �̻� 
		  ? - �� ���ڰ� ���ų� �ϳ�����
		  []- ������ �����̳� ������ ��Ÿ��
		  {}- Ƚ�� �Ǵ� ����
		  ()- �Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		  | - ���� �ȿ��� or ���� ����
		  \s- ���鹮��
		  \S- ���鹮�ڰ� �ƴ� ������ ����
		  \w- ���ĺ��̳� ����
		  \W- ���ĺ��̳� ���ڸ� ������ ����
		  \d- ���ڸ� ������ ��� ����
		  \D- ����
		  
		  
		  ���ڿ����� ���ڸ� ���� - replace("[0-9]","")
		  ����ó - ^010-\d{4}-\d{4}$
		  �ѱ۸� �ۼ� Ȯ�� - ^[��-�H]
//		  
//		*/
//		String a="abc73jd82kd74j";
//		System.out.println( a.replaceAll("[0-9]",""));
//		System.out.println( a.replaceAll("[\\d]","")); // ����ǥ���Ŀ��� �������� \\2������ؾ���
//		System.out.println( a.replaceAll("[\\`D]",""));

		
		String str="�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�";
		String name;
		int age=0;
		
		name=str.substring(str.indexOf("ȫ�浿"),str.indexOf("]"));

        String temp=str.substring(str.lastIndexOf("[")+1,str.lastIndexOf("]"));
		age=Integer.parseInt(temp);
		
		
		System.out.println(name);
		
		System.out.println(age);
		
		


		

		
		
		
		
		
		
		
	}
	

}
