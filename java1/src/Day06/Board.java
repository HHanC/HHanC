package Day06;

public class Board {

	// * Board Ŭ���� ����
	
	// 1. �ʵ�
	String title;
	String content;
	String writer;
	String password;
	
	// 2. ������[Ŭ���� �̸��� �����ϸ� �����ڸ�]
	
		// 1. �������
	Board() {}
		// 2. 1�� �ʵ带 �޴� ������
	Board( String title ) { // �ܺκ���
		this.title = title;
		// this.�ʵ�� => ���κ���
		// * �ܺηκ��� ���� ������ ���κ����� ����
	}
		// 3. 2�� �ʵ带 �޴� ������
	Board( String title, String content ) { // �ܺκ���
		this.title = title;
		this.content = content;
	}
		// 4. 3�� �ʵ带 �޴� ������
	Board( String title, String content,
			String writer ) { // �ܺκ���
		this.title = title;
		this.content = content;
		this.writer = writer;
		}
			
		// 5. 4�� �ʵ带 �޴� ������
	Board( String title, String content,
			String writer, String password ) { // �ܺκ���
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
			}
	// 3. �޼ҵ�
	
}
