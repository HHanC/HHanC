package ����2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ����0325 {
	
	public static void main(String[] args) {
		
		// * �����Է½�Ʈ�� , ������ ������ ���
			// * ��� ���� : ����Ʈ �� �ٴҼ� �ִ�.
				// ����Ʈ : ����[0,1] -> 1010101010 -> 1byte
			// ���ڿ� -> ����Ʈ�� ��ȯ : ���ڿ�.getBytes()
		try {
			// 1. ���� ���Ŭ���� ��ü ���� [ ���ϰ�� ] 
			FileOutputStream outputStream  = new FileOutputStream("D:/java/����.txt"); // ������ ���� �߻�[ ����ó�� ] 
		// Ŭ������		������(�ƹ��ų�) = new ������( ���ϰ��/���ϸ�.Ȯ���� );
			// 2. ���Ͽ��� ������[ ����Ʈ�� ] ������
			outputStream.write( "������������".getBytes() );
			
			// 1. ���� �Է½�Ʈ�� ��ü 
			FileInputStream inputStream = new FileInputStream("D:/java/����.txt");
			// 2. ����Ʈ�� ������ �迭 ���� [ ���� : ���Ͽ��� ������ �ö� ����Ʈ�� �������� ������ ] 
			byte[] bytes = new byte[1000]; // 100����Ʈ => ��1����: 1����Ʈ // ��1���� : 2����Ʈ 
			// 3. ���Ͽ��� �о���� [ read( ����Ʈ�迭 ) �޼ҵ�  : �ش� ����Ʈ�迭�� �о�� ����Ʈ�� ���� ]  
			inputStream.read( bytes );
			// 4. ����Ʈ�� -> ���ڿ� ��ȯ 
			String ���ڿ� =  new String(bytes);
			System.out.println("���Ͽ� �о�� ���� : " + ���ڿ�  );
			
		}catch( Exception e ) {
			System.out.println("����ó���� ����");
		}
		
	}

}