package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static ProductDao productDao = new ProductDao();
	
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}
	
	// 1. 제품 등록 
	public boolean add( Product product ) {
		try {
			String sql = "insert into product(pname,pimg,pcontent,pcategory,pprice,pactivation,mnum) values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString( 1 , product.getPname() );
			ps.setString( 2 , product.getPimg() );
			ps.setString( 3 , product.getPcontent() );
			ps.setString( 4 , product.getPcategory() );
			ps.setInt( 5 , product.getPprice() );
			ps.setInt( 6 , product.getPactivation() );
			ps.setInt( 7 , product.getMnum() );
			ps.executeUpdate();
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;
	}
	// 2. 모든 제품 출력 [ tableview 사용x -> arraylist 사용o ] 
	public ArrayList<Product> list(String category, String serch){
		ArrayList<Product> productlist = new ArrayList<>(); // 리스트 선언 	
		try {
			String sql = null;
			
			if(category == null && serch == null) {
				sql = "select * from product";
				ps = con.prepareStatement(sql);
			}
			
			else if(serch == null) { // 검색이 없을 경우
				sql = "select * from product where pcategory = ? order by pnum desc";	// SQL 작성
				ps = con.prepareStatement(sql); // sql연결
				ps.setString(1, category);
			}else { // 검색이 있을 경우										// 필드명 = 값 [= 비교 연산자] // 필드명 like '%"값"%'
				sql = "select * from product where pcategory = ? and pname like '%"+serch+"%' order by pnum desc";	// SQL 작성
				ps = con.prepareStatement(sql); // sql 연결
				ps.setString(1, category);
				// ps.setString(2, serch);  sql 문자열에 ? 대신에 직접 변수를 넣기기 때문에 생략
			}
			ps = con.prepareStatement(sql);			// SQL 연결 
			ps.setString(1, category);
			rs = ps.executeQuery();					// SQL 실행  
			while( rs.next() ) {					// SQL 결과[ 레코드 단위 ]
				Product product = new Product(  	// 해당 레코드를 객체화
						rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9));
				productlist.add(product);			// 리스트에 객체 담기 
			}	
			return productlist;						// 리스트 반환
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return null; // 만약에 실패시 NULL 반환
	}
	// 3. 제품 조회
	
	// 4. 제품 삭제
	public boolean delete( int pnum ) {
		try {
			String sql = "delete from product where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;
	}
	// 5. 제품 수정 
	public boolean update( Product product ) {
		
		try {
			String sql = "update product set pname=? , pimg=? , pcontent=?,pcategory=? , pprice=? where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setString( 1 , product.getPname() );
			ps.setString( 2 , product.getPimg() );
			ps.setString( 3 , product.getPcontent() );
			ps.setString( 4 , product.getPcategory() );
			ps.setInt( 5 , product.getPprice() );
			ps.setInt( 6 , product.getPnum() );
			ps.executeUpdate();
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;
		
	}
	// 상태변경
	public boolean activation(int pnum) {
		try {
			// 현재 제품의 상태
			String sql = "select pactivation from product where pnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, pnum);
			rs = ps.executeQuery();
			if(rs.next()) { // 검색 결과가 존재하면 다음 레토드 가져오기
				String upsql = null;
				if(rs.getInt(1) == 1) { // 현재 제품의 상태가 
					upsql = "update product set pactivation=2 where pnum=?";
				}else if(rs.getInt(1) == 2) {
					upsql = "update product set pactivation=3 where pnum=?";
				}else if(rs.getInt(1) == 3) {
					upsql = "update product set pactivation=1 where pnum=?";
				}
				
				ps = con.prepareStatement(upsql);
				ps.setInt(1, pnum);
				ps.executeUpdate(); // sql 실행
				return true;				
			}
		}catch (Exception e) {System.out.println(e);}
		return false;
	}
	
	
	
}




































