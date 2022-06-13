package dao;

import org.json.JSONArray;
import org.json.JSONObject;

public class Image2Dao extends Dao {

	public Image2Dao() {
		super();
	}
	
	public static Image2Dao image2Dao = new Image2Dao();
	public static Image2Dao getImage2Dao() {
		return image2Dao;
	}
	
	//1.프로필사진저장
	public boolean profileimgsave(int mno2, String ifile2) {
		
		String sql = "insert into image2(mno2,ifile2) values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mno2);
			ps.setString(2, ifile2);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("image2dao profileimgsave오류 : "+e);}
		return false;
	}
	//2.프로필사진출력
	public String getmyprofileimg(int mno) {
		String sql ="SELECT ifile2 from image2 where mno2 = "+mno+" order by ino2 desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
				return rs.getString(1);
				
			}
		} catch (Exception e) {
			System.out.println("image2dao getprofileimg오류 : "+e);
		}
		return null;
	}
	
	//3.팔로우회원프로필사진가져오기
		public JSONArray getfollowerinfo(int followermno) {
			JSONArray jsonArray = new JSONArray();
			String sql = "SELECT ifile2 from image2 where mno2 = "+followermno+" order by ino2 desc";
			try {
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()) {
					JSONObject object = new JSONObject();
					object.put("ifile2",rs.getString(1));
					jsonArray.put(object);
				}
				return jsonArray;
			} catch (Exception e) {
				System.out.println("followdao getfollowerinfo오류 : "+e);
			}

			return null;
		}
		//4.팔로워회원프로필사진가져오기
		public JSONArray getfollowinginfo(int followingmno) {
			JSONArray jsonArray = new JSONArray();
			String sql = "SELECT ifile2 from image2 where mno2 = "+followingmno+" order by ino2 desc";
			try {
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				if(rs.next()) {
					JSONObject object = new JSONObject();
					object.put("ifile2",rs.getString(1));
					jsonArray.put(object);
				}
				return jsonArray;
			} catch (Exception e) {
				System.out.println("followdao getfollowinginfo오류 : "+e);
			}

			return null;
		}
}