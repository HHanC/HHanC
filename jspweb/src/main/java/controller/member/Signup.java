package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.Member;

/**
 * Servlet implementation class member
 */
@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Signup() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test");
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		String memailaddress = request.getParameter("memailaddress");
			String email = memail+"@"+memailaddress;
		String adress1 = request.getParameter("adress1");
		String adress2 = request.getParameter("adress2");
		String adress3 = request.getParameter("adress3");
		String adress4 = request.getParameter("adress4");
			String adress = adress1+"_"+adress2+"_"+adress3+"_"+adress4;
			
		Member member = new Member(0, mid, mpassword, mname, mphone, email, adress, 0, null);
		
		// System.out.println(member.toString()); // toString() : 객체 정보 확인 -> 주소값 나옴
			// toString() : object클래스[최상위클래스] 의 객체 주소 반환 메소드
		boolean result = MemberDao.getMemberDao().signup(member);
		if(result) {
			response.sendRedirect("/jspweb/member/signupsuccess.jsp");
		}else {
			response.sendRedirect("/jspweb/error.jsp");
		}
		
		doGet(request, response);
	}

}













