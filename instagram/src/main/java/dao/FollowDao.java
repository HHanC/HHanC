package dao;

import org.json.JSONArray;
import org.json.JSONObject;


public class FollowDao extends Dao {

	public FollowDao(){
		super();
	}
	
	public static FollowDao followDao = new FollowDao();
	public static FollowDao getFollowDao() {
		return followDao;
	}
	
	//1.팔로우하기
	public boolean follow(int followingmno, int followermno ) {
		String sql = "insert into follow(followingmno,followermno)values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, followingmno);
			ps.setInt(2, followermno);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {
			System.out.println("followdao follow오류 : "+e);
		}
		
		return false;
	}
	
	//2.팔로우 여부확인
	public boolean followcheck(int followermno, int loginmno) {
		String sql = "select * from follow where followingmno = "+loginmno+" and followermno = "+followermno;
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("followdao followcheck오류 : "+e);
		}
		return false;
	}
	
	//3.팔로우한 회원 목록출력
	public JSONArray followlist(int mno){
		JSONArray jsonArray = new JSONArray();
		String sql = "select followermno from follow where followingmno ="+mno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				JSONObject object = new JSONObject();
				object.put("followermno",rs.getInt(1));
				jsonArray.put(object);
			}
			return jsonArray;
		} catch (Exception e) {
			System.out.println("followdao followlist오류 : "+e);
		}
				
		
		return null;
	}
	//4.팔로워 회원 목록출력
	public JSONArray followerlist(int mno){
		JSONArray jsonArray = new JSONArray();
		String sql = "select followingmno from follow where followermno ="+mno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				JSONObject object = new JSONObject();
				object.put("followingmno",rs.getInt(1));
				jsonArray.put(object);
			}
			return jsonArray;
		} catch (Exception e) {
			System.out.println("followdao followerlist오류 : "+e);
		}
		return null;
	}
	
	//5.팔로우한 회원수
	public int followcount(int mno) {
		String sql = "select count(*) from follow where followingmno="+mno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("followdao followcount오류 : "+e);
		}
		return 0;
	}
	
	//6.팔로워수
	public int followercount(int mno) {
		String sql = "select count(*) from follow where followermno="+mno;
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("followdao followercount오류 : "+e);
		}
		return 0;
	}
	
	//7. 팔로우 취소
	public boolean followcancel(int followermno) {
		String sql = "delete from follow where followermno="+followermno;
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("followdao followcancel오류 : "+e);
		}
		
		return false;
	}
}