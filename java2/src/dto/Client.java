package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	// ������ ���ӵ� Ŭ���̾�Ʈ�� Ŭ����
	
	// 1. �ʵ� [��Ĺ]
	public Socket socket;
	
	// 2. ������
	public Client(Socket socket) {
		this.socket = socket;
		recive(); // ������ ����� Ŭ���̾�Ʈ ��ü�� �����ɶ� �ޱ� �޼ҵ� ����
	}
	
	// 3. �����κ��� �޴� �޽��� �޼ҵ� [�������� : ������ Ŭ���̾�Ʈ�� ����Ǿ�����] 
	public void recive() { 
		
		// ��Ƽ������ [ Thread Ŭ���� vs Runnable �������̽� ]
			// run �޼ҵ带 �ʼ������� �����ؾ���
		// �������̽��� �߻� �޼ҵ尡 �����ϱ� ������ ���� �ʼ�[Ŭ�������� implement �ϰų�]
		Runnable runnable = new Runnable() { // �͸� ����
			@Override
			public void run() { // �߻� �޼ҵ� ����
				// ��������� �޽��� �޴� ����
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // 1. �Է� ��Ʈ��
						byte[] bytes = new byte[1000]; // 2. ����Ʈ �迭 ���� [��Ʈ���� ����Ʈ �迭 ����]
						inputStream.read(bytes); // 3. �Է½�Ʈ������ ���Ʈ �о����
						String msg = new String(bytes); // 4. ����Ʈ�� -> ���ڿ��� ��ȯ
						// ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
						for(Client client : Server.clientlist) {
							client.send(msg); // ���� �޽����� ������ ���ӵ�[clientlist] ��� Ŭ���̾�Ʈ���� �޽��� ������
						}
						
					}
				}catch (Exception e) {System.out.println(e);}
			}
			// ��Ƽ ������ ���� ��
		};
		// �ش� ��Ƽ�����带 ������Ǯ�� �־���
		Server.threadpool.submit(runnable);
	}
	
	// 4. ������ ������ �޽��� �޼ҵ� [�������� : ������ �޽����� �޾�����]
	public void send(String msg) { // ��Ƽ������
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					// 1. ��� ��Ʈ��
					OutputStream outputStream = socket.getOutputStream();
					// 2. ��������
					outputStream.write(msg.getBytes());
				}catch (Exception e) {System.out.println(e);}			
			}
		}; // ��Ƽ������ ���� ��
		Server.threadpool.submit(runnable);
	}
	
}








