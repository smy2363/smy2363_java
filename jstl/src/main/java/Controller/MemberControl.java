package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//RequestDispatcher rds = request.getRequestDispatcher(����ڿ��� ���������������);
			
			String detail="�ű�ȸ�� ���� 10�� ���ҽ��ϴ�.";
		
			// response.sendRedirect("/signin.jsp");
			// ���� Ŭ������ ���� ������ �����͸� ����ڰ� ���� �������� 
			// ����Ϸ��� forward�� ����ؾ��Ѵ�.
			// ����ڰ� ���� �������� html���븸 �ʿ��ϰų� ������ �����Ͱ� ���°��
			// sendRedirect�� ����Ѵ�.
			
		request.setAttribute("message", detail);
		
		RequestDispatcher rds = request.getRequestDispatcher("signin.jsp");
		rds.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("��¥ post��û ó���ϳ�?");
	}

}
