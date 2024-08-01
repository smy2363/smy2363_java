package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class boardControl
 */
@WebServlet("/board")
public class boardControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public boardControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시글 제목 클릭하면 요청방식이 get이기 때문에
		// doGet 메서드가 호출된다.
		RequestDispatcher rd = request.getRequestDispatcher("boardView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//글 작성 클릭하면 클라이언트의 요청방식이 post이기 때문에
		//doPost 메서드가 호출된다.
		RequestDispatcher rd = request.getRequestDispatcher("boardWrite.jsp");
		rd.forward(request, response);
	}

}
