package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardWrite implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getParameter("method");
		if( method != null ) { // �Խñ� �ۼ� �Ұ��
			String title= request.getParameter("title");
			String content = request.getParameter("content");
			String writer = (String)request.getSession().getAttribute("user");
			
			BoardDTO dto = new BoardDTO(writer, title, content);
			
			BoardDAO dao = new BoardDAO();
			dao.save(dto);
			try { response.sendRedirect("/board.do"); }catch(Exception e) {}
			return null;
			
		}else {// �Խñ� �ۼ������� ��û�� ���
			return "board/boardWrite.jsp";
		}
	}

}