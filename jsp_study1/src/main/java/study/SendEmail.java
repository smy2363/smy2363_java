package study;

import java.util.Properties;

public class SendEmail {
	
	public static void sendEmail(String fromEmail, String title, String content) {
		// ���Ǳ� ��� �Ǹ� ������ �̸��Ϸ� �����ϱ�
		
		
		// ������ �̸��� ���� ����
		final String adminEmail = "smy2363@naver.com";
		final String password = "QS2JHSVPU5X5";
		
		// ������ �̸��� ȯ�漳�� ���
		Properties prop = new Properties();
		prop.put("mail.smtp.host","smtp.naver.com"); // smtp ������
		prop.put("mail.smtp.port", "587"); // smtp��Ʈ��ȣ
		prop.put("mail.smtp.starttls.enable", "true"); // tls ��뿩��
		prop.pit("mail.smtp.auth","true"); // smtp��������
	}
}
