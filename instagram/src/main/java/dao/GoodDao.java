package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.cj.xdevapi.JsonArray;

import dto.Good;

public class GoodDao extends Dao {

	public GoodDao() {
		super();
	}
	
	public static GoodDao goodDao = new GoodDao();
	public static GoodDao getGoodDao() {
		return goodDao;
	}
	
	//1.게시물 좋아요 누르기(등록,삭제포함) 메소드
	public int saveglike( int bno , int mno ) {
		try {
			// 1. 검색  	제품번호와 회원번호가 동일하면 
			String sql = "select gno from good where bno="+bno+" and mno="+mno;
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if( rs.next() ) { // 2. 만약에 존재하면 삭제처리 
				sql = "delete from good where gno = "+rs.getInt(1);
				ps = con.prepareStatement(sql); ps.executeUpdate();
				return 2; // 삭제 
			}else { 	// 3. 만약에 존재하지 않으면 등록처리 
				sql = "insert into good( bno , mno )values( "+bno+","+mno+" ) ";
				ps = con.prepareStatement(sql); ps.executeUpdate();
				return 1; // 등록 
			}
		}catch (Exception e) { System.out.println("좋아요 누르기 버튼 : " + e); } return 3; // DB오류 
	}
	
	//2.게시물 좋아요 여부확인 메소드
	public boolean boardgoodcheck() {
		
		
		return false;
	}
	
	//3.댓글 좋아요 누르기(등록,삭제포함) 메소드
	public int replygood() {
			
			
		return 0;
	}
	
	//4.댓글 좋아요 여부확인 메소드
	public boolean replygoodcheck() {
			
			
		return false;
	}
	
	
	//5.게시물 좋아요 누른 회원 목록 출력
	
	// 일단
	public JSONArray boardgoodlist(int mno){
		System.out.print( mno );
		JSONArray jsonArray = new JSONArray();
		String sql = "select * from good A join member B "
				+ "					on A.mno = B.mno "
				+ "					where A.mno = "+mno+" order by bno desc";
		
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs2 = ps.executeQuery();
			while(rs2.next()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("mno", rs2.getInt(2));
				jsonObject.put("bno", rs2.getInt(3));
				jsonArray.put(jsonObject);
				System.out.println(jsonObject);
			}
			return jsonArray;
		} catch (Exception e) {System.out.println("일단 : " + e);}
		return null;
	}
	
	//6.댓글 좋아요 누른 회원 목록 출력
	public ArrayList<Good> replygoodlist(){
			
		return null;
	}
	
	// 좋아요 개수 출력
	public JSONArray getglikecount() {
		JSONArray array = new JSONArray();
		String sql = "select A.bno, count(B.gno) "
				+ "from board A left join good B "
				+ "on A.bno = B.bno "
				+ "join member C on B.mno = C.mno "
				+ "group by A.bno";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject object = new JSONObject();
				object.put("bno", rs.getInt(1));
				object.put("gno", rs.getInt(2));
				array.put(object);
			}
			return array;
		} catch (Exception e) {System.out.println(e);}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
