package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Day22_2 {

	// 1. �ʵ�
		private Connection connection;
	// 2. ������
		public Day22_2() {
			
			try { // JAVA�� �ܺο� ����� ������ �Ϲݿ��� �߻�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC",
					"root",
					"1234");
			System.out.println("DB���� ����");
			}catch (Exception e) {
				System.out.println("DB ��������");
			}
					
		}
	// 3. �޼ҵ�
	public boolean write(String �ۼ���, String ����) {
		try {
			// 1. sql�ۼ�
				// db�� ���̺� ������ ���� : insert into ���̺��1(�ʵ��,�ʵ��) values(�ʵ��1�ǰ�, �ʵ��2�ǰ�)
			String sql = "insert into test(writer,content) values(?,?)";
			// 2. sql ���� [�ش� sql ����� db�� sql����]
				// PreparableStatement : ����� db���� ���̺� �����Ҷ� ���� �������̽�
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, �ۼ���); // ù��° ?�� ���� �ֱ�
			ps.setString(2, ����); // �ι�° ?�� ���� �ֱ�
			// 3. sql ����
			ps.executeUpdate(); // sql ����
			
			return true;
			
		}catch (Exception e) {
			System.out.println("sql ���� ����" + e);
		}
		return false;
	}
	
	public ArrayList<������> get(){
		
		// DB���� ������ �����͸� ������ ����Ʈ ����
		ArrayList<������> �����͸�� = new ArrayList<>();
		try {
		// 1. sql�ۼ�
		String sql = "select * from test";
		// 2. sql����
		PreparedStatement ps = connection.prepareStatement(sql);
		// 3. sql����
		ResultSet rs = ps.executeQuery();
		
		// ����� �ϳ��� �ƴϰ� ������ �̹Ƿ� �ݺ��� ����ؼ�
			// ���پ� ��üȭ -> ����Ʈ�� ����
		while(rs.next()) {
			������ temp = new ������(
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3));
			�����͸��.add(temp);
		}
		
		return �����͸��;
		}catch (Exception e) {
			System.out.println("sql ���� ����" + e);
		}
		return null;
	}
		
}












