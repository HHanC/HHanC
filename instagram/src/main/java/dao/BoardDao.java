package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.Board;
import dto.Reply;

public class BoardDao extends Dao{

	public BoardDao() {
		super();
	}
	
	public static BoardDao boardDao = new BoardDao();
	public static BoardDao getBoardDao() {return boardDao;}
	
	// 게시물 작성 메소드2
	public int write(Board board) {
		String sql = "insert into board(bcontent, mno)values(?,?)";
		try {
			ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, board.getBcontent());
			ps.setInt(2,board.getMno());
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if(rs.next()) {
				int pk = rs.getInt(1);
				return pk;
			}
		} catch (Exception e) {}
		return 0;
	}
	
	// 모든 게시물 출력 메소드
	public ArrayList<Board> getboardlist(){
		ArrayList<Board> boardlist = new ArrayList<Board>();
		String sql = "select * from board order by bno desc"; // 내림차순
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Board board = new Board(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), null );
				boardlist.add(board);
			}
			return boardlist;
		} catch (Exception e) {System.out.println("모든 게시물 출력 메소드 : " + e);}
		return null;
	}
	// 모든 게시물 출력 메소드
	public JSONArray getorder() {
		
		String sql = "select "
				+ "A.mno as 회원번호, "
				+ "A.memail as 회원이메일, "
				+ "A.mname2 as 회원아이디, "
				+ "B.bno as 게시물번호, "
				+ "B.bcontent as 게시물내용, "
				+ "B.bdate as 게시물날짜, "
				+ "C.ifile as 이미지 "
				+ "from member A JOIN board B on A.mno = B.mno "
				+ "join image C on B.bno = C.bno order by B.bno desc";
		
		try {
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			JSONArray jsonArray = new JSONArray(); /// 모든 게시물를 저장하는 리스트 
			
			int 인덱스 = 0 ;
			while( rs.next() ) { // 검색된 레코드 개수만큼 반복처리 
				// 만약에 앞전 레코드가 현재 레코드의 이미지가 동일하면 이미지만 저장 ~~
				
					// jsonarray 
							// 게시물당 jsonobject
								//  ifile 필드만 값을 Jsonarray
					/*
					 * 	[ 
					 * 		{ 키:값 , 키2:값 , 키3:값 , ifile:[ ] }  , {  }  , {  } 
					 * 	]
					 */
				
					// 만약에 앞전 json의 게시물번호가 동일하면 새로운 json 생성X  --> 앞전 JSON내 ifile 리스트에 이미지만 추가 
				
				
				
				// 1인덱스 앞전 인덱스 -1 
				// 만약에 앞전 jsonobject 게시물번호가 같으면
				if( 인덱스 != 0 && jsonArray.getJSONObject(인덱스-1).getInt("bno")  ==  rs.getInt(4) ) {
						// 앞전 jsonobject 의 게시물번호가       새로 저장예정인 게시물번호 와 같으면
							
						// 이미지 리스트 생성x -> 앞전 객체의 이미지 리스트에 추가 
						JSONObject img = new JSONObject();
						img.put("ifle",  rs.getString(7) );
					
						jsonArray.getJSONObject(인덱스-1).getJSONArray("iflelist").put(img);
						// jsonArray.getJSONObject(인덱스-1) : 앞전 객체 
						// .getJSONArray("iflelist") : 앞전 객체의  iflelist 이라는 키 의 값 [ JSONArray ]  호출
						// .put(img);  이미지 저장 
						// [ {},{},{},{} ] : array  { 키 : 값 } : object
													// 키  : 이름( 아무거나 )
													// 값 : 데이터 , array , object
						
					continue;
				}
				JSONObject jsonObject = new JSONObject();		// 1. 새로운 객체 
				jsonObject.put("mno", rs.getString(1));			// 2. 데이터 넣어준다..
				jsonObject.put("memail", rs.getString(2));
				jsonObject.put("mname2", rs.getString(3));
				jsonObject.put("bno", rs.getInt(4));
				jsonObject.put("bcontent", rs.getString(5));
				jsonObject.put("bdate", rs.getString(6));
				
					JSONArray iflelist = new JSONArray();
						JSONObject img = new JSONObject();
						img.put("ifle",  rs.getString(7) );
					iflelist.put(img);
					
				jsonObject.put("iflelist", iflelist);
					
				
				
				jsonArray.put(jsonObject); 인덱스++; // 저장할때 마다 저장되는 순서번호 기록 
				
			}
			
			System.out.println(  jsonArray.toString()   );
			
			return jsonArray;
		} catch (Exception e) {System.out.println("게시물 출력 오류" + e);}
		return null;
	}
	
	// 나의 게시물 출력 메소드
		public JSONArray getmyorder(int mno) {
			
			String sql = "select "
					+ "A.mname2 as 회원아이디, "
					+ "B.bno as 게시물번호, "
					+ "B.bcontent as 게시물내용, "
					+ "B.bdate as 게시물날짜, "
					+ "C.ifile as 이미지 "
					+ "from "
					+ "member A JOIN board B on A.mno = B.mno join image C on B.bno = C.bno "
					+ "where A.mno = "+mno+" order by B.bno desc";
			
			try {
				
				ps = con.prepareStatement(sql);
				ResultSet rs2 = ps.executeQuery();
				
				JSONArray jsonArray = new JSONArray();
				
				///////모든 게시물 출력 메소드 처럼/////
				int 인덱스 = 0;
				
				while(rs2.next()) {
					if( 인덱스 != 0 && jsonArray.getJSONObject(인덱스-1).getInt("bno")  ==  rs2.getInt(2) ) {

						JSONObject img = new JSONObject();
						img.put("ifile",  rs2.getString(5) );
					
						jsonArray.getJSONObject(인덱스-1).getJSONArray("myifilelist").put(img);

						continue;
					}
					
					JSONObject jsonObject = new JSONObject();
					jsonObject.put("mname2", rs2.getString(1));
					jsonObject.put("bno", rs2.getInt(2));
					jsonObject.put("bcontent", rs2.getString(3));
					jsonObject.put("bdate", rs2.getString(4));
					
						JSONArray myifilelist = new JSONArray();
							JSONObject img = new JSONObject();
							img.put("ifile", rs2.getString(5));
						myifilelist.put(img);
					
					jsonObject.put("myifilelist", myifilelist);
							
					jsonArray.put(jsonObject);
					인덱스++;
				}
				System.out.println("1 "+  jsonArray.toString());
				return jsonArray;
			} catch (Exception e) {System.out.println("나의게시물 출력 오류" + e);}
			return null;
		}

	// 개별 게시물 출력 메소드
	public Board getboard(int bno) {
		String sql = "select * from board where bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4), null);
				return board;
			}
		} catch (Exception e) {System.out.println("개별 게시물 출력 메소드" + e);}
		return null;
	}
	// 게시물 수정 메소드
	public boolean boardupdate(Board board) {
		String sql = "update board set bcontent=? where bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBcontent());
			ps.setInt(2, board.getBno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("게시물 수정 메소드" + e);}
		return false;
	}
	// 게시물 삭제 메소드
	public boolean boarddelete(int bno) {
		String sql = "delete from board where bno=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.err.println("게시물 삭제 메소드" + e);}
		return false;
	}
	
	//나의 게시물 갯수
	public int myboardcount(int mno) {
		String sql = "select count(*) from board where mno="+mno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch (Exception e) {System.out.println("BoardDao myboardcount오류 : "+e);}	
		return 0;
	}
	//나의 게시물 번호출력
		public ArrayList<Board> myboardbno(int mno) {
			ArrayList<Board> bnolist = new ArrayList<Board>();
			
			String sql = "select * from board where mno="+mno;
			try {
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				while(rs.next()) {
					Board board = new Board(rs.getInt(1),null,null,0,null);
					bnolist.add(board);
					System.out.println(bnolist);
				}
				return bnolist;
			}catch (Exception e) {System.out.println("BoardDao myboardbno오류 : "+e);}	
			return null;
		}
}















