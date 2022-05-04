package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

/**
 * Servlet implementation class passwordcheck
 */
@WebServlet("/passwordcheck") // 현재 서블릿(클래스)으로 접근할 수 있는 url정의
public class passwordcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public passwordcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 통신된 페이지에게 변수의 데이터를 요청한다.
		System.out.println("post 통신");
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		// 2. 객체화 [변수가 많은경우] = 생략
		// 3. DB처리
		System.out.println(mid);
		System.out.println(mpassword);
		boolean result = MemberDao.getMemberDao().passwordcheck(mid, mpassword);
		
		// 4. 결과
		if(result) {
			// 5. 통신된 페이지로 데이터 응답하기
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}

}












