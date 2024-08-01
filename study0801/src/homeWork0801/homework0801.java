package homeWork0801;

import java.util.Scanner;

public class homework0801 {

	public static void main(String[] args) {
		
		/* String �޼���
		charAt(int index) - Ư�� ��ġ�� ���ڸ� ����/ ����Ÿ�� char
		equals(Object anObject) - �� ���ڿ��� �� / ����Ÿ�� boolean
		getBytes() - byte[]�� ����/ ����Ÿ�� byte[]
		getBytes(Charset charset) - �־��� ���ڼ����� ���ڵ��� byte[]�� ����/����Ÿ��byte[]
		indexOf(String str) - ���ڿ� ������ �־��� ���ڿ��� ��ġ�� ����/ ����Ÿ�� int
		length() - �� ������ ���� ���� / ����Ÿ�� int
		replace (CharSequence target, CharSequence replacement) - target�κ��� replacement�� ��ġ��
																	���ο� ���ڿ��� ����/ ����Ÿ�� String
		substring(int beginIndex) - beginIndex ��ġ���� ������ �߶� ���ο� ���ڿ��� ����/ ����Ÿ�� /String
		substring(int beginIndex, int endIndex) - beginIndex��ġ���� endIndex ������ �߶�
												���ο� ���ڿ��� �����մϴ�. /����Ÿ�� String
		toLowerCase() - ���ĺ� �ҹ��ڷ� ��ȯ�� ���ο� ���ڿ��� ���� / ����Ÿ�� String
		toUpperCase() - ���ĺ� �빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ����/ ����Ÿ�� String
		trim() - �յ� ������ ������ ���ο� ���ڿ��� ���� / ����Ÿ�� String
		valueOf(int i), valueOf(double d) - �⺻Ÿ�� ���� ���ڿ��� �����մϴ�. / ����Ÿ�� String															
		
		*/
		
		//charAt() �޼ҵ�� �Ű������� �־��� �ε����� ���ڸ� �����Ѵ�. (�ѱ��ڸ� ���ð���/char�� ����)
		String subject ="�ڹ� ���α׷���";
		char c1=subject.charAt(0);
		char c2=subject.charAt(4);
		
		System.out.println(subject.charAt(3));
		System.out.println("ù��° ���ڴ� "+c1);
		System.out.println("�׹�° ���ڴ� "+c2);
	
		String str="abcde";
		char c=str.charAt(0);
		char c3=str.charAt(3);
		System.out.println(c);
		System.out.println(c3);
		
		String sto="�����ٶ� ���ٻ��";
		char a=sto.charAt(3);
		char a2=sto.charAt(8);
		System.out.println(a);
		System.out.println(a2);
		
		String ppe="����� ���־�";
		char p=ppe.charAt(5);
		char p1=ppe.charAt(2);
		System.out.println(p);
		System.out.println(p1);
		
		String bana="�ٳ����� �ʹ��ʹ� ���־�";
		char ba=bana.charAt(7);
		char ba1=bana.charAt(10);
		System.out.println(ba);
		System.out.println(ba1);
		
		String sr="Hello, World";
		
		char d=sr.charAt(0);
		System.out.println(d);
		
		char e=sr.charAt(2);
		System.out.println(e);
		
		char f=sr.charAt(4);
		System.out.println(f);
		
		String bb="����� �ٳ����� ��� ��������?";
		char r=bb.charAt(5);
		char r1=bb.charAt(9);
		char r2=bb.charAt(13);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		
		String text="���α׷��� ��� �ڹ�";
		char charvalue=text.charAt(6);
		System.out.println(charvalue);

		//equals(Object anObject) - �� ���ڿ��� �� / ����Ÿ�� boolean
		//���ڿ� �񱳽� �����ڸ� �� ����ؾ��Ѵ�. 
		
		String strVar1=new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		String strVar3 = "�Ź�ö";
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		String str1="Strong";
		String str2="Strong";
		String str3=new String("Strong");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3); //�ּҰ��� �޶� false ����/�׷��� equals�� ����ؾ���
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3)); //�ּҰ��� �޶� ���ڿ� ������ ���Ƽ� true
		
		String tr1="abc";
		String tr2=tr1;
		String tr3=new String("abc");
		
		System.out.println(tr1==tr2);
		System.out.println(tr1.equals(tr3));
		
		
		//getBytes()- byte[]�� ����/ ����Ÿ�� byte[] ���ڿ��� ����Ʈ �迭�� ��ȯ�Ҷ����
		//byte[] bytes="���ڿ�".getBytes();
		// �־��� ���ڼ����� ���ڵ��� byte[]�� ����
		//byte[] bytes="���ڿ�".getByte(Charset charset);
		
//		try {
//			byte[] bytes1 = "���ڿ�".getBytes("EUC-KR");
//			byte[] bytes2 = "���ڿ�".getBytes("UTF-8");
//		}catch(UnsupportedEncodingException e) {
//			
//		}
		
		//String str = new String(byte[]byte, String charsetName);
		
		//indexOf(String str) - ���ڿ� ������ �־��� ���ڿ��� ��ġ�� ����/ ����Ÿ�� int
		// ���ڿ��� ���ԵǾ����������� -1�� ��ȯ��
		
		String subject2="�ڹ� ���α׷���";
		int index = subject2.indexOf("���α׷���");
		
		if(subject.indexOf("���α׷���") != -1) {
			System.out.println("���ԵǾ�����");
		}else {
			System.out.println("���ԵǾ����� ����");
		}
		
		String jaana="�ٳ��� ���־�";
		if(jaana.indexOf("�ٳ�") != -1) {
			System.out.println("���ԵǾ�����");
		}else {
			System.out.println("���Ծȵ�");
		}
		
		String str5="Hello, world!";
		int position = str5.indexOf('o');
		System.out.println("��ġ��?"+position);
		
		String bla="����� ��ŭ��";
		int bla2=bla.indexOf("ŭ");
		System.out.println("��ġ��?"+bla2);
		
		
		//length() - �� ������ ���� ���� / ����Ÿ�� int
		//���ڿ��� ���� ���� �����϶� ���ڼ� Ȯ��//��й�ȣ ����, �����Ǳ���Ȯ��
		
		String sub="�ڹ� ���α׷���";
		System.out.println(sub.length());
		
		String su="���������������������ôϤ�����";
		System.out.println(su.length());
		
		//replace (CharSequence target, CharSequence replacement) - target�κ��� replacement�� ��ġ��
		//���ο� ���ڿ��� ����/ ����Ÿ�� String/ ���ڿ� �ٲٱ�(��ġ), ����� �Է� ���� �� ���͸�, ���� ġȯ
		
	String oldStr="�ڹ� ���α׷���";
	String newStr=oldStr.replace("�ڹ�","JAVA");
	System.out.println(newStr);
	
	String rice="���ִ� �����";
	String newrice=rice.replace("�����","bobbob");
	System.out.println(newrice);
	
	String lemon="������ �ʹ� �ô�";
	String lemon2=lemon.replace("������","Ű����");
	System.out.println(lemon2);
	
	
	//substring(int beginIndex) - beginIndex ��ġ���� ������ �߶� ���ο� ���ڿ��� ����/ ����Ÿ�� /String
	//substring(int beginIndex, int endIndex) - beginIndex��ġ���� endIndex ������ �߶�
	//���ڿ� �߶󳻱� ����������, ��ȭ��ȣ ���ĺ�ȯ, �α����Ͽ��� ��¥�� �ð�����, �̸��� �� ����, ������ �м��� �Ľ�
	
	String ssn="880815-1234567";
	String firstNum=ssn.substring(0,6); //0~6���� ���� �ڸ��°�
	String secondNum=ssn.substring(7);	// 7���ʹ� ����ǥ��ǰ� ������ ���� �ڸ��°�
	
	System.out.println(firstNum);
	System.out.println(secondNum);
	
	String ori="����� ���ϸԾ ���ֳ�";
	String fir=ori.substring(0,8); //0~8���� ����
	String sec=ori.substring(9); //9���� �Ⱥ��� 10���ͺ���
	System.out.println(fir);
	System.out.println(sec);
	
	String rara="������ �ʹ��� ���ִ� ����";
	String ra1=rara.substring(0,8); //0~8��������
	String ra2=rara.substring(8); //8���� �Ⱥ��� 9���� ����
	System.out.println(ra1);
	System.out.println(ra2);
	
	//toLowerCase() - ���ĺ� �ҹ��ڷ� ��ȯ�� ���ο� ���ڿ��� ���� / ����Ÿ�� String
	//toUpperCase() - ���ĺ� �빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ����/ ����Ÿ�� String
	
	String original="Java Programming";
	String lowerCase=original.toLowerCase(); //���� �ҹ��ڷκ�ȯ
	String upperCase = original.toUpperCase(); //���� �빮�ڷ� ��ȯ
	System.out.println(lowerCase);
	System.out.println(upperCase);
	
	
	String val="SdkslfjASDFDF";
	String vla2=val.toLowerCase();
	String vla3=val.toUpperCase();
	System.out.println(vla2);
	System.out.println(vla3);
	
	String name="AaaBbb";
	
	String nameUp;
	String nameLo;
	nameUp=name.toUpperCase();
	nameLo=name.toLowerCase();
	
	System.out.println("�빮��"+ nameUp);
	System.out.println("�ҹ���"+nameLo);
	

	        // ���� ���ڿ�
	        String original1 = "aBBdddAA";
	        // ��ȯ�� ���ڿ��� ������ ����
	        String converted = "";

	        // ���� ���ڿ��� �� ���ڸ� �ϳ��� Ȯ��
	        for (int i = 0; i < original1.length(); i++) {
	            char currentChar = original1.charAt(i); // ���� ����

	            // �ҹ����� ��� �빮�ڷ� ��ȯ
	            if (currentChar >= 'a' && currentChar <= 'z') {
	                converted += (char)(currentChar - ('a' - 'A'));
	            }
	            // �빮���� ��� �ҹ��ڷ� ��ȯ
	            else if (currentChar >= 'A' && currentChar <= 'Z') {
	                converted += (char)(currentChar + ('a' - 'A'));
	            }
	        }

	        // ��� ���
	        System.out.println("Original: " + original1);
	        System.out.println("Converted: " + converted);
	        
	        
	        //trim() - �յ� ������ ������ ���ο� ���ڿ��� ���� / ����Ÿ�� String
	        //replace�� ��� ��
	        
	        String trr=" Hi Anna!  ";
	        String stripTrr=trr.strip();
	        System.out.println(stripTrr);
	        System.out.println(trr.replace(" ",""));
	    
	      // valueOf(int i), valueOf(double d) - �⺻Ÿ�� ���� ���ڿ��� �����մϴ�. / ����Ÿ�� String	
	        
	       
	        int int1=1234;
	        int int2=-1234;
	        
	        String st1=String.valueOf(int1);
	        String st2=String.valueOf(int2);
	        System.out.println("String sr1 :" + st1);
	        System.out.println("String sr2 :" + st2);
	        
	        
	
	        
	    }


	}

	




