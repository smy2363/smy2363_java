package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{
	

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO dao = new BoardDAO();
		
		// 검색 결과
		String keyWord = request.getParameter("word");
		if( keyWord == null ) keyWord="";
		
		// 페이징
		int pageNum=1; //현재 페이지 번호
		if(request.getParameter("page") !=null) { //페이지 번호 2번 이상 클릭시
			pageNum = Integer.parseInt( request.getParameter("page"));
		}
		int total=dao.totalCount(keyWord);
		int skip = 5; //화면에 출력되는 페이징 번호갯수
		int pagePost = 10; // 한페이지에 게시글 몇개
		int pageTotalNum = total/pagePost; //총 페이지 수(총 게시글수 / 한페이지 게시글수)
		if(total%pagePost != 0)pageTotalNum++;
		int startPage = 1; // 현재 화면 페이징 시작번호
		int endPage = pageTotalNum>skip ? skip : pageTotalNum ; // 현재 화면 페이징 마지막번호
		if(pageTotalNum > skip && pageNum >= (skip/2+1) ) // 페이지 번호의 위치를 이동시키면서 현재 페이지번호 가운데 출력			
		{
			startPage = pageNum - 2;
			endPage = pageTotalNum > pageNum+2 ? pageNum+2 : pageTotalNum;
		}
		// 게시글 목록 가져오기
		int start = (pageNum-1)*10+1;
		List<BoardDTO> list = dao.findAll(start, keyWord); // 전체 게시글 가져오기
	
		
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("list", list);
		request.setAttribute("skip", skip);
		
		return "board/board.jsp";
	}
	
}