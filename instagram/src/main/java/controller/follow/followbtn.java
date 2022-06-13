package controller.follow;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FollowDao;
import dao.MemberDao;

/**
 * Servlet implementation class follow
 */
@WebServlet("/follow/followbtn")
public class followbtn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public followbtn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("팔로우btn서블릿");
		String memail = (String)request.getSession().getAttribute("login");
		
		int followingmno = MemberDao.getMemberDao().getmno(memail);
		//followingmno : 현재 로그인중인 회원의 mno
		
		int followermno = Integer.parseInt(request.getParameter("mno"));
		//followermno : (현재 로그인중인 회원에게) 팔로우버튼 누름당한 회원의 mno
		System.out.println("팔로잉넘 : "+followingmno+" 팔로워넘 : "+followermno);
		
		boolean result = FollowDao.getFollowDao().follow(followingmno , followermno);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}