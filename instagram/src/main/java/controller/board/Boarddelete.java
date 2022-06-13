package controller.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;

/**
 * Servlet implementation class Boarddelete
 */
@WebServlet("/board/Boarddelete")
public class Boarddelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Boarddelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		int bno = Integer.parseInt(request.getParameter("bno"));
		boolean result = BoardDao.getBoardDao().boarddelete(bno);
		if(result) {
			writer.print("<script>alert('게시물이 삭제 되었습니다.'); location.href='"+"/instagram/main.jsp"+"'</script>");
		}else {
			writer.print("<script>alert('게시물 삭제 실패, 관리자에게 문의'); location.href='"+"/instagram/board/boardview.jsp"+"'</script>");
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
