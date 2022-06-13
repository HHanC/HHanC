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

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.BoardDao;
import dao.ImageDao;
import dao.MemberDao;
import dto.Board;

/**
 * Servlet implementation class Uploadimage
 */
@WebServlet("/board/Uploadimage")
public class Uploadimage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Uploadimage() {
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
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 프로젝트폴더(개발자PC) 저장 (X) 	// 2. 서버PC(톰캣) 폴더에 저장 (권장)
		
				MultipartRequest multi = new MultipartRequest(
						request,			/*요청 타입 */ 
						request.getSession().getServletContext().getRealPath("/board/upload") , /* 저장 폴더위치 */
						1024*1024*1024, 	/* 파일 최대용량 = 바이트 기준 */
						"UTF-8" ,			/* 파일 인코딩타입 */
						new DefaultFileRenamePolicy()/* 보안 방식 = */
						/* DefaultFileRenamePolicy : 파일명이 중복이면 파일명 뒤에 숫자 자동 부여 = 식별 */
			);
				String ifile = multi.getParameter("ifile");
	}
}











