package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpPage implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		return "member/signUp.html";
	}

	
}