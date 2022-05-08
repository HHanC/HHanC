package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

/**
 * Servlet implementation class idcheck
 */
@WebServlet("/idcheck")
public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public idcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String mid = request.getParameter("mid");
		boolean result = MemberDao.getMemberDao().idcheck(mid);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}








