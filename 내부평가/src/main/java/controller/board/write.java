package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;

@WebServlet("/board/write") // URL 정의 = 현재 클래스와 통신할 경로 설정
public class write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public write() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bwrite = request.getParameter("bwrite");
		String bpassword = request.getParameter("bpassword");
		Board board = new Board( 0 , btitle, bcontent, bwrite, null ,bpassword);
		boolean result = BoardDao.getBoardDao().write(board);
		if( result ) { response.sendRedirect("../board/boardlist.jsp"); }
		else { response.sendRedirect("../board/boardwrite.jsp"); }
		
	}

}
