package controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

/**
 * Servlet implementation class Findid
 */
@WebServlet("/Findname2")
public class Findname2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Findname2() {
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
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String femail = request.getParameter("femail");
		String fname = request.getParameter("fname");
		String mname2 = MemberDao.getMemberDao().getname2(femail, fname);
		
		if(mname2 != null) {
			writer.print("<script>alert('아이디 찾기 성공'); location.href='"+"/instagram/member/findname2success.jsp?mname2="+mname2+"'</script>");
		}else {
			writer.print("<script> alert('아이디 찾기 실패'); location.href='"+"/instagram/error.jsp"+"'</script>");
		}
		
	}

}










