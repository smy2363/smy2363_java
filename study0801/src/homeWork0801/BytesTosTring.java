package homeWork0801;

public class BytesTosTring {

	public static void main(String[] args) {
		String str="stirng to bytes\n";
		byte[] bytes =str.getBytes();
		System.out.println("str: "+str);
		
		String bytesTostr=new String(bytes);
		System.out.println("bytes to str:" + bytesTostr);
		
		String st="sesesese\n";
		byte[] bys=st.getBytes();
		System.out.println(st);
		
		String by2=new String(bys);
		System.out.println(by2);
		
		String qw="�ٳ����� ����";
		byte[] byq=qw.getBytes();
		System.out.println(qw);
		
		String byq2=new String(byq);
		System.out.println(byq2);
		
		String ba="����� ���־�";
		byte[] ba2=ba.getBytes();
		System.out.println(ba);
		
		String ba3=new String(ba2);
		System.out.println(ba3);
		
		String apple="����� �ʹ� ���ְ� �޾ƿ�";
		byte[] apple2=apple.getBytes();
		System.out.println(apple);
		
		String apple3=new String(apple2);
		System.out.println(apple3);
		

	}

}
