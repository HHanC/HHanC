package application.Day26;

import java.net.InetAddress;

public class Day26_1 {

	// ��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� ��Ÿ��� ���� �����ϰ� ����� �� �ִ� ��
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
		// �������� : ��ǻ�� ���� / ��ǻ�� ���� ������ ��ȯ ����� �����ϴ� ��Ģ[ü��]
			// SMTP : ���� ���� ��������
			// IP : ���ͳ� ��������
	// TCP/IP
		// TCP : Transmission Control Protocol : ��� ����
		// IP : Internet Protocol address : ��� �ν� ��ȣ[�ּ�-PC�ּ�-���ּ�] : 0.0.0.0 ~ 255.255.255.255
			// �� <--------����--------> ģ����
			// 						ģ������ ���ּ�
	
			// ����ǻ�� <--------����--------> ���̹���ǻ��[Ȩ������]
			// 							 www.naver.com [������ �ּ� : �����̱� ������ ��� �ܿ�� ����]
			//							 223.130.200.107 [ip�ּ� : �����̱� ������ ��� �ܿ�� �����]
			//							 �����ּ�(ip) ---> �����ּ�(DNS)
	
	public static void main(String[] args) {
		
		
		try {
		// 1. ���� pc�� ip�ּ� Ȯ�� -> ���������Ʈ
			// cmd
			// ipconfig �Է½� ipȮ�� ����
		// 2. �ڹٿ��� ip �ּ� Ȯ��
			InetAddress inetAddress = InetAddress.getLocalHost();
				// InetAddress ��Ʈ��ũ ������ �����ϴ� Ŭ����
					// InetAddress.getLocalHost(); // ����(��pc)�� ���� ȣ��
						// �ڹ� �� ����� ��� �Ϲݿ��� �߻�
			System.out.println("���� pc�� ��Ʈ��ũ ��ü : " + inetAddress);
			System.out.println("���� pc�� �̸� : " + inetAddress.getHostName());
			System.out.println("���� pc�� ip�ּ� : " + inetAddress.getHostAddress());
		// 3. ���̹� ȸ���� ip �ּ� Ȯ��
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� pc�� ������ü : " + inetAddress2);
			System.out.println("���̹� pc�� �̸� : " + inetAddress2.getHostName());
			System.out.println("���̹� pc�� ip�ּ� : " + inetAddress2.getHostAddress());
		// 4. ���̽��� ȸ�翡 ip �ּ� Ȯ��
			InetAddress inetAddress3 = InetAddress.getByName("www.facebook.com");
			System.out.println("���̽��� pc�� ������ü : " + inetAddress3);
			System.out.println("���̽��� pc�� �̸� : " + inetAddress3.getHostName());
			System.out.println("���̽��� pc�� ip�ּ� : " + inetAddress3.getHostAddress());
		}catch (Exception e) {System.out.println(e);}
		
		
	}
	
}









