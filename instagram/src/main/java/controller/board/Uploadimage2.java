package controller.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;

import dao.BoardDao;
import dao.ImageDao;
import dao.MemberDao;
import dto.Board;

/**
 * Servlet implementation class Uploadimage2
 */
@WebServlet("/board/Uploadimage2")
public class Uploadimage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Uploadimage2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String data = request.getParameter("fileList");
		 String content = request.getParameter("content");
		 	// 데이터 요청
			HttpSession session = request.getSession();
			String memail = (String)session.getAttribute("login");
			int mno = MemberDao.getMemberDao().getmno(memail);
			
				// 객체화
				Board board = new Board(0, content, null, mno, null);
				// DB처리
				int bno = BoardDao.getBoardDao().write(board);
				if(bno!=0) {
					try {
						JSONArray jsonArray = new JSONArray( data );
						for(  int i = 0 ; i<jsonArray.length(); i++ ) {
							JSONObject jsonObject = jsonArray.getJSONObject(i);
							String ifile = jsonObject.get("fname").toString();
							boolean result2 = ImageDao.getImageDao().imagewrite(ifile,bno);
							if(result2) {
								System.out.println("사진이름저장성공");
							}else {
								System.out.println("사진저장실패");
							}
						}
					}
					catch (Exception e) { 
					 System.out.println( "board/uploadimage2서블릿오류 : "+e );
					}
				}else {
					response.sendRedirect("/instagram/board/boardwrite.jsp");
				}
				
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
