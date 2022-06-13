package dao;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.Reply;

public class ReplyDao extends Dao {

	public ReplyDao() {
		super();
	}
	
	public static ReplyDao replyDao = new ReplyDao();
	public static ReplyDao getReplyDao() {
		return replyDao;
	}
	
	// 1.댓글등록
	public boolean comment(Reply reply) {
		String sql = "insert into reply(rcontent,rindex,bno,mno) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reply.getRcontent());
			ps.setInt(2, reply.getRindex());	
			ps.setInt(3, reply.getBno());		
			ps.setInt(4, reply.getMno());	
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("댓글 작성 메소드 오류 : " + e);}
		return false;
	}
	
	//2.댓글수정
	public boolean commentupdate() {
		
		return false;
	}
	
	//3.댓글삭제
	public boolean commentdelete() {
		
		return false;
	}
	
	//4.댓글출력
	public JSONArray commentlist(int bno){
		JSONArray jsonArray = new JSONArray();
		String sql = "select * from reply A join member B "
						+ "on A.mno = B.mno "
						+ "where bno = "+bno+" and rindex = 0 order by rno DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject object = new JSONObject();
				object.put("rno", rs.getInt(1));
				object.put("mno", rs.getInt(2));
				object.put("bno", rs.getInt(3));
				object.put("rcontent", rs.getString(4));
				object.put("rdate", rs.getString(5));
				object.put("rfile", rs.getString(6));
				object.put("rindex", rs.getInt(7));
				object.put("mno", rs.getInt(8));
				object.put("memail", rs.getString(9));
				object.put("mname", rs.getString(10));
				object.put("mname2", rs.getString(11));
				object.put("mpassword", rs.getString(12));
				object.put("mdate", rs.getString(13));
				jsonArray.put(object);
			}
			return jsonArray;
		} catch (Exception e) {System.out.println("댓글 출력 메소드 : " + e);}
		return null;
	}
	
	
	//5.댓글개수출력
	public JSONArray commentcount() {
		JSONArray jsonArray = new JSONArray();
		String sql = "select A.bno, count(B.rno) "
				+ "	from board A left join reply B "
				+ "	on A.bno = B.bno "
				+ "	join member C on B.mno = C.mno "
				+ "	group by A.bno";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject object = new JSONObject();
				object.put("bno", rs.getInt(1));
				object.put("rno", rs.getInt(2));
				jsonArray.put(object);
			}
			return jsonArray;
		} catch (Exception e) {System.out.println("댓글 개수 출력 : " + e);}
		return null;
	}
	
	
	//6. 대댓글출력
	public JSONArray replylist(int bno, int rno){
		
		JSONArray jsonArray = new JSONArray();
		String sql = "select * from reply where bno = "+bno+" and rindex = "+rno;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("rno", rs.getInt(1));
				jsonObject.put("mno", rs.getInt(2));
				jsonObject.put("bno", rs.getInt(3));
				jsonObject.put("rcontent", rs.getString(4));
				jsonObject.put("rdate", rs.getString(5));
				jsonObject.put("rfile", rs.getString(6));
				jsonObject.put("rindex", rs.getInt(7));
				jsonArray.put(jsonObject);
			}
			return jsonArray;
		} catch (Exception e) {System.out.println("대댓글 출력 : " + e);}
		return null;
	}
	
	
	
	
}
