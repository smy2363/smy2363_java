package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoin implements MainActive{
	
	public String action(HttpServletRequest req, HttpServletResponse res) {
		// ȸ������ �� ó�����ִ� ��  - ����ڰ� �Է��� ���� �����ͺ��̽��� �����ؾ� �Ѵ�.
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPassword");
		String email = req.getParameter("userEmail");
		String name = req.getParameter("userName");
		
		MemberDTO dto = new MemberDTO(id, pw, email, name);
		
		//�����ͺ��̽� ���� �ϱ�
		MemberDAO dao = new MemberDAO();
		dao.save(dto);
		
		try {
				res.sendRedirect("/");
		} catch (IOException e) {	e.printStackTrace();		}
		
		return null;
	}

}