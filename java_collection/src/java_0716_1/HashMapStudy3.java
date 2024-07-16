package java_0716_1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudy3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> url=new HashMap<>();
		url.put(1, "login"); url.put(2, "signup");
		url.put(3, "notice_view"); url.put(4, "notice_write");
		
		
		// �� ����Ʈ���� ����ڰ� ���ϴ� �������� ������ ��û ó��
		HashMap<String,PageAction> map = new HashMap<>();
		
		map.put("login", new Login());
		map.put("notice_write", new NoticeWrite());
		map.put("signup", new SignUp());
		map.put("notice_view", new NoticeView());
		
		// ����Ʈ�� �޴��� �����ϰ� ����ڰ� �����ϸ� �ش� �޴� �������� �����ش�.
		Scanner sc=new Scanner(System.in);
		System.out.println("=== �ڹ� ������ ����Ʈ ===");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. �� ����");
		System.out.println("4. �� �ۼ�");
		
		System.out.println("�޴� ���� : ");
		int menu=sc.nextInt();
		String cmd=null;

		cmd=url.get(menu);
		
		PageAction obj = map.get(cmd);
		String view =obj.action();
		System.out.println(view);
	}

}

