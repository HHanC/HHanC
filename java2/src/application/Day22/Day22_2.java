package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;




public class Day22_2 {

	// 1. �ʵ�
		private Connection connection; // DB���� ��ü ����
	// 2. ������
		public Day22_2() {
			try {
				// 1. DB ����̺� Ŭ���� ȣ��[DB ȸ�縶�� �ٸ��� ������ �ϱ�x ����o]
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB ����
				connection = DriverManager.getConnection(
						// JDBC : JAVA DABABASE CONNECTIION
						// "jdbc:mysql://IP�ּ�(�����̸�[����pc] localhost):port
						// , ������ , "DB��й�ȣ"
						"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" ,
						"root",
						"1234");
				// 3. Ȯ��
				System.out.println("[DB���� ����]");
			}catch (Exception e) {System.out.println("[DB���� ����]");}
		}
	// 3. �޼ҵ�
	public boolean write(String �ۼ���, String ����) {
		try {
			
			// 1. SQL �ۼ� [DB�� ����]
				// db�� ���̺� ������ ���� : insert into ���̺��1(�ʵ��1,�ʵ��2) values(�ʵ��1�ǰ�, �ʵ��2�ǰ�)
			String sql = "insert into test(writer, content) values(?,?)";
			// 2. SQL ���� [����� DB�� SQL ����]
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, �ۼ���);
			ps.setString(2, ����);
			// 3. SQL ����
			ps.executeUpdate(); // sql ���� ����
			// * ������ true
			return true;
			
		}catch (Exception e) {
			System.out.println("[sql ���� ���� !!]" + e);
		}
		
		// * ������ true
				
				
		// * ���н� false
		return false;
		
	}
	// 3. ������ ȣ�� �޼ҵ�
	public ArrayList<������> get(){
		
			// *
			ArrayList<������> �����͸�� = new ArrayList<>();
			try {
			// 1. SQL �ۼ� [������ ȣ��]
				// select *(����ʵ�) from ���̺��; : ��� �����͸� ��������
			String sql = "select * from test";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			// * ����� �ϳ��� �ƴϰ� ������ �̹Ƿ� �ݺ��� ����ؼ�
				// ���پ� ��üȭ -> ����Ʈ�� ����
			while(rs.next()) {
				������ temp = new ������(
						rs.getInt(1), // �ش� ��[���ڵ�]�� ù��° �ʵ�[����] �� ��������
						rs.getString(2), // �ش� ��[���ڵ�]�� �ι�° �ʵ�[����] �� ��������
						rs.getString(3) ); // �ش� ��[���ڵ�]�� ����° �ʵ�[����] �� ��������
				�����͸��.add(temp); 
				
			}
			// �ݺ��� ����Ǹ� ����Ʈ ��ȯ
			// * ������ ������ ��� ��ȯ
			
		}catch (Exception e) {
			System.out.println("[sql ���� ���л��� : ]" + e);
		}
		
		
			return �����͸��;
			
			//return null;				
	}
}













