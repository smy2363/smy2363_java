package study;

import java.util.Properties;

public class SendEmail {
	
	public static void sendEmail(String fromEmail, String title, String content) {
		// 문의글 등록 되면 관리자 이메일로 전송하기
		
		
		// 관리자 이메일 계정 설정
		final String adminEmail = "smy2363@naver.com";
		final String password = "QS2JHSVPU5X5";
		
		// 관리자 이메일 환경설정 등록
		Properties prop = new Properties();
		prop.put("mail.smtp.host","smtp.naver.com"); // smtp 서버명
		prop.put("mail.smtp.port", "587"); // smtp포트번호
		prop.put("mail.smtp.starttls.enable", "true"); // tls 사용여부
		prop.pit("mail.smtp.auth","true"); // smtp서버인증
	}
}
