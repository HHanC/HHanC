package controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.Image2Dao;
import dao.MemberDao;
import dto.Image2;

/**
 * Servlet implementation class profile
 */
@WebServlet("/member/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
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
		String memail = (String)request.getSession().getAttribute("login");
		int mno2 = MemberDao.getMemberDao().getmno(memail);
		MultipartRequest multi = new MultipartRequest(
				request, 			//요청타입 
				request.getSession().getServletContext().getRealPath("/member/profileimg"),	//저장 폴더위치
				1024*1024*1024,		//파일 최대용량 = 바이트 기준
				"UTF-8",				//파일 인코딩타입
				new DefaultFileRenamePolicy()//보안방식->DefaultFileRenamePolicy : 파일명이 중복이면 파일명 뒤에 숫자 자동 부여 =식별해준다는
				);
		
		String ifile2 = multi.getFilesystemName("profileimg");
		
		
		boolean result = Image2Dao.getImage2Dao().profileimgsave(mno2,ifile2);
		if(result) {
			response.getWriter().print(1);
		}else {
			response.getWriter().print(2);
		}
	}

}