package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao { // DB

	private Connection con; // DB������ ���Ǵ� Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL ���� �ҋ� ���Ǵ� �������̽� : DB����
	private ResultSet rs; // ������� �����ϴ� �������̽�
	
	public static MemberDao memberDao = new MemberDao(); // DB������ü
	
	public MemberDao() {
		try {
			// DB����
			Class.forName("com.mysql.cj.jdbc.Driver");// 1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");// 2. DB �ּ� ����'
		
		}catch (Exception e) {
			System.out.println("DB���� ����" + e);
		}
	}
	// �޼ҵ�
		// ���̵� �ߺ�üũ �޼ҵ� (�μ� : ���̵� �μ��� �޾� db�� �����ϴ��� üũ)
	public boolean idcheck(String id) {
		try {
			// 1. SQL �ۼ�
			String sql = "select * from member where mid=?";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL ����
			rs = ps.executeQuery();
			// 4. SQL ���
			if(rs.next()) {
				return true; // �ش� ���̵�� �ߺ��� ����
			}
		}catch (Exception e) {
				System.out.println("SQL���� ����" + e);
		}
			
		return false; // �ش� ���̵� �ߺ��� ����
	}
		// 1. ȸ������ �޼ҵ�(�μ� : db�� ���� ���̵�, ��й�ȣ,�̸���,�ּ�)
	public boolean signup(Member member) {
		try {
		// 1. sql �ۼ�
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,mcince)values(?,?,?,?,?,?)";
		// 2. sql ����
		ps = con.prepareStatement(sql); // prepareStatement �������̽��� ����� db�� sql �ֱ�
		ps.setString(1, member.getMid()); // 1�� ?�� id �־��ֱ�
		ps.setString(2, member.getMpassword()); // 2�� ?�� ��й�ȣ �־��ֱ�
		ps.setString(3, member.getMemail()); // 3�� ?�� �̸��� �־��ֱ�
		ps.setString(4, member.getMaddress()); // 4�� ?�� �ּ� �־��ֱ�
		ps.setInt(5, member.getMpoint()); // 5�� ?�� ����Ʈ �־��ֱ�
		ps.setString(6, member.getMcince()); // 6�� ?�� ������ �־��ֱ�		
		// 3. sql ����
		ps.executeUpdate();
		return true;
		}catch (Exception e) {
			System.out.println("SQL���� ����" + e);
		}
		return false;
		}
		// 2. �α��� �޼ҵ�(�μ� : �α��ν� �ʿ��� ���̵�, ��й�ȣ)
	public boolean login(String id, String password) {return false;}
		// 3. ���̵�ã�� �޼ҵ�(�μ� : ���̵�ã�� �� �ʿ��� �̸���)
	public String finid(String email) {return null;}
		// 4. ��й�ȣã�� �޼ҵ�(�μ� : ��й�ȣ ã�� �� �ʿ��� ���̵� �̸���)
	public String findpassword(String id, String email) {return null;}
}















