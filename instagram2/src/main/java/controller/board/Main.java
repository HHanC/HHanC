package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dao.MemberDao;
import dto.Board;
import dto.Member;

/**
 * Servlet implementation class Main
 */
@WebServlet("/board/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
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
		
		String uploadpath = request.getSession().getServletContext().getRealPath("/board/upload");
		
		MultipartRequest multipartRequest = new MultipartRequest(
				request, // 요청 방식
				uploadpath, // 파일 저장 경로
				1024*1024*10, // 파일 최대 용량 허용 범위 [10mb]
				"UTF-8", // 인코딩 파일
				new DefaultFileRenamePolicy() // 보안방식 : 동일한 파일명이 있을경우 자동 이름 변환
				);
		
		// 데이터 요청
		String bfile = multipartRequest.getParameter("bfile");
		String bcontent = multipartRequest.getParameter("bcontent");
		HttpSession session = request.getSession();
		String mep = (String)session.getAttribute("login");
		
		int mno = MemberDao.getMemberDao().getmno(mep);
		// 객체화
		Board board = new Board(0, bcontent, mno, null, bfile, null);
		// DB처리
		boolean result = BoardDao.getBoardDao().write(board);
		if(result) {
			response.sendRedirect("/instagram/main.jsp");
		}else {
			response.sendRedirect("/instagram/board/boardwrite.jsp");
		}
		
	}

}













