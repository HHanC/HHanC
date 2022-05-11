package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dao.MemberDao;
import dto.Reply;

/**
 * Servlet implementation class rereplywrite
 */
@WebServlet("/board/rereplywrite")
public class rereplywrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rereplywrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// rindex : 어떤 댓글의 대댓글인 식별번호(부모 댓글 번호)
		int rindex = Integer.parseInt(request.getParameter("rno")); // rinsex : 어떤 댓글의 대댓글 번호(rno)
		int bno = Integer.parseInt(request.getParameter("bno"));
		String rcontent = request.getParameter("rrcontent");
		String mid = (String)request.getSession().getAttribute("login");
		int mno = MemberDao.getMemberDao().getmno(mid);
		// 객체화  (댓글번호, 작성일, mid제외)
		Reply reply = new Reply(0, rcontent, null, rindex, bno, mno, null);
		// db처리
		boolean result = BoardDao.getBoardeDao().replywrite(reply);
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