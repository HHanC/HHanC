package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dao.MemberDao;
import dto.Reply;

/**
 * Servlet implementation class replywrite
 */
@WebServlet("/board/replywrite")
public class replywrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public replywrite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");	// request 사용시 = 한글 인코딩 
		int bno = Integer.parseInt( request.getParameter("bno") ) ; // 게시물번호 요청 
		String rcontent = request.getParameter("rcontent"); // 댓글내용 요청
			String mid = (String)request.getSession().getAttribute("login"); // 세션 요청 ( 로그인 정보 )
		int mno = MemberDao.getmemberDao().getmno(mid); // 회원번호 찾기 
		// 객체화 [ 댓글번호 , 댓글작성일 , rindex , mid 제외 ]
		Reply reply = new Reply( 0 , rcontent, null , 0, bno, mno,  null );
		// DB처리
		boolean result = BoardDao.getBoardDao().replywrite(reply);
		if( result ) { response.getWriter().print( 1 ); }	// 쓰기 성공시 ajax에게 1 응답
		else {  response.getWriter().print(2); } // 실패시  ajax에게 2 응답
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
