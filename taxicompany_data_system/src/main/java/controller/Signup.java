package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.Member;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("mid");
		String pwd=request.getParameter("mpwd");
		String name=request.getParameter("mname");
		String phone=request.getParameter("mphone");
		String memail=request.getParameter("memail");
		String memailaddress=request.getParameter("memailaddress");
		String email=memail+"@"+memailaddress;
		
		Member member = new Member(0, id, pwd, name, phone, email);
		
		boolean result = MemberDao.getMemberDao().signup(member);
		
		if(result) {
			HttpSession session =request.getSession();
			
			session.setAttribute("login", id);	//세션에 값 저장
			
			response.sendRedirect("/taxicompany_data_system/member/signupsuccess.jsp");
			
		}else {
			response.sendRedirect("/taxicompany_data_system/errorpage.jsp");
		}
	}

}
