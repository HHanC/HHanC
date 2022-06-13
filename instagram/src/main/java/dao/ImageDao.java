package dao;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import dto.Image;

public class ImageDao extends Dao {
	
	public ImageDao() {
		super();
	}
	
	public static ImageDao imageDao = new ImageDao();
	public static ImageDao getImageDao() {
		return imageDao;
	}
	
	//1. 사진저장
	public boolean imagewrite(String ifile , int bno) {
		
		String sql = "insert into image(ifile , bno) values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, ifile);
			ps.setInt(2, bno);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println(e);}
		return false;
	}
	//2. 사진불러오기
	public JSONArray imagelist(int bno){
		
		JSONArray images = new JSONArray();
		
		String sql = "select ifile from image where bno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				// json 형식으로 저장해야 합니다.
				JSONObject object = new JSONObject();
				object.put("ifile", rs.getString(1));
				images.put(object);
			}
			return images;
		} catch (Exception e) {System.out.println("사진 불러오기 출력 메소드 : " + e);}
		return null;
	}
	
	//3. 사진수정
	public boolean imageupdate() {
		
		return false;
	}
}
