package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;

/*
 *
 * 해당 클래스로 접근할 수 있는 URL 정의[만들기]
 * @WebServlet("/login")
 * 
 *  * 목적(서로 다른 언어들간의 통신이 된다) view <----> controller
 *  view(html,jsp) ---- 매핑(@WebServlet) ------> controller(java)
 * 
 * 		// 1. 해당 클래스의 @WebServlet 이노테이션 이용해서 클래스 url 정의
 * 		// 2. view는 해당 클래스의 url로 이동
 * 
 */

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		
		// 1. 요청
				String mid = request.getParameter("mid");
				String mpassword = request.getParameter("mpassword");
				// 2. 객체화 (데이터가 적기때문에 생략)
				// 3. DB처리
				int result = MemberDao.getmemberDao().login(mid,mpassword);
				if(result == 1) {
					// 4. 로그인 성공시 세션 부여 [세션 : 서버에 메모리 할당 -> 모든 페이지에서 동일한 메모리 사용 가능]
					HttpSession session = request.getSession(); // http 내장 세션 호출
					session.setAttribute("login", mid); // 2. 세션에 값 저장
										// 세션명, 데이터
					response.sendRedirect("/jspweb/main.jsp"); // 페이지 전환
				}else if(result == 2){ // 아이디 혹인 비밀번호 다름
					response.sendRedirect("/jspweb/member/login.jsp?result=2");
				}else {
					response.sendRedirect("/jspweb/error.jsp");
				}
		
		doGet(request, response);
	}

}
