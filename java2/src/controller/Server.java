package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server { // fxml  ������� �ʴ� Ŭ����[���� ��Ʈ�� ���]
	
	// ��ø Ŭ����[Ŭ���� �ȿ� Ŭ������ ����Ǹ� ��ø]	
	public class Client { // ������ ���ӵ� Ŭ���̾�Ʈ�� Ŭ����
		public Socket socket; // 1. �ʵ� [��Ĺ]
		public Client(Socket socket) { // 2. ������
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
					
						while(true) {
							try {
								InputStream inputStream = socket.getInputStream(); // 1. �Է� ��Ʈ��
								byte[] bytes = new byte[1000]; // 2. ����Ʈ �迭 ���� [��Ʈ���� ����Ʈ �迭 ����]
								inputStream.read(bytes); // 3. �Է½�Ʈ������ ���Ʈ �о����
								String msg = new String(bytes); // 4. ����Ʈ�� -> ���ڿ��� ��ȯ
								// ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
								for(Client client : clientlist) {
									client.send(msg); // ���� �޽����� ������ ���ӵ�[clientlist] ��� Ŭ���̾�Ʈ���� �޽��� ������
									
								}					
							
							}catch (Exception e) {
								serverstop();
								System.out.println("������ �޽���  �ޱ� ���� : " + e);
								break;
							}
					}
				
				}
				// ��Ƽ ������ ���� ��
			};
			// �ش� ��Ƽ�����带 ������Ǯ�� �־���
			threadpool.submit(runnable);
		}
		
		// 4. ������ ������ �޽��� �޼ҵ� [�������� : ������ �޽����� �޾�����]
		public void send(String msg) { // ��Ƽ������
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); // 1. ��� ��Ʈ��	
						outputStream.write(msg.getBytes()); // 2. ��������
					}catch (Exception e) {
						System.out.println("������ �޽��� ������ ���� : " + e);}
				
				}
			}; // ��Ƽ������ ���� ��
			threadpool.submit(runnable);
		}
		
	} // ��øŬ���� end

	    // * ������ ����� Ŭ���̾�Ʈ�� �����ϴ� ����Ʈ
	    public Vector<Client> clientlist = new Vector<>();
	    	// Vector ����ϴ� ���� : ����ȭ ����.	// ����ȭ : ���� ���׵尡 �ϳ��� �޼ҵ� ������ ��� ��� ���� �������
	    // * ��Ƽ�����带 �������ִ� ������Ǯ	  
	    public ExecutorService threadpool;
	    	// ExecutorService : ������Ǯ ���� �������̽� [����Ŭ����(implements) vs ��������(�͸�ü)]
	    
	    // 1. �������� ����
	    ServerSocket serverSocket;
	    // 2. �������� �޼ҵ� [�μ��� ip�� port �޾Ƽ� ���� ip�� port�� �������� ���ε�(����)] 
	    public void serverstart(String ip, int port) {
	    	try {
		    	// 1. �������� �޸��Ҵ�
		    	serverSocket = new ServerSocket();
		    	// 2. �������� ���ε� [ip�� port ����]
		    	serverSocket.bind(new InetSocketAddress(ip, port));		    	
	    	}catch (Exception e) {
	    		System.out.println("���� ���� ���� : " + e);}
	    		// 3. Ŭ���̾�Ʈ�� ��û ��� [��Ƽ������ ����ϴ� ���� : 1.���� 2.������ 3.�ޱ� ���� ó��]
	    	Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						while(true) {
							Socket socket = serverSocket.accept(); // ��û �����Ŀ� ��ȯ�� ������ ����
							clientlist.add(new Client(socket)); // 2. ����� Ŭ���̾�Ʈ(����� ����) �����Ŀ� ����Ʈ�� ����
						}
					}catch (Exception e) {
						System.out.println("���� Ŭ���̾�Ʈ ������� : " + e);}
					
					
				}
			}; // ��Ƽ������ ���� ��
	    	// ������Ǯ�� �޸� �ʱ�ȭ
			threadpool = Executors.newCachedThreadPool(); // ����ƮǮ�� �޸� �ʱ�ȭ[�Ҵ�]
			threadpool.submit(runnable); // ������ ������ ��Ƽ�����带 ������Ǯ�� �־��ֱ�
			
	    }
	    // 3. �������� �޼ҵ�
	    public void serverstop() {
	    	try {
		    	// 1. ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �ݱ�
		    	for(Client client : clientlist) {	    		
		    		client.socket.close();	    		
		    	}
		    	// 2. �������� �ݱ�
		    	serverSocket.close();
		    	// 3. ������Ǯ �ݱ�
		    	threadpool.shutdown();
	    	}catch (Exception e) {}
	    }    
}








