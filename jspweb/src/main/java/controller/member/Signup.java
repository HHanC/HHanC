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
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
			String address = address1+"_"+address2+"_"+address3+"_"+address4;
			
		Member member = new Member(0, mid, mpassword, mname, mphone, email, address, 0, null);
		
		// System.out.println(member.toString()); // toString() : 객체 정보 확인 -> 주소값 나옴
			// toString() : object클래스[최상위클래스] 의 객체 주소 반환 메소드
		boolean result = MemberDao.getmemberDao().signup(member);
		if(result) {
			response.sendRedirect("/jspweb/member/signupsuccess.jsp");
		}else {
			response.sendRedirect("/jspweb/error.jsp");
		}
		
		doGet(request, response);
	}

}













