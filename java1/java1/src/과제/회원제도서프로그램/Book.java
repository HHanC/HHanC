package ����.ȸ�����������α׷�;

public class Book {
	// 1. book
	// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
	// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
	
	String ������ȣ;
	String ������;
	String �۰�;
	boolean �����뿩����;
	String �뿩ȸ��;
	
	public Book() {}

	public Book(String ������ȣ, String ������, String �۰�, boolean �����뿩����, String �뿩ȸ��) {
		super();
		this.������ȣ = ������ȣ;
		this.������ = ������;
		this.�۰� = �۰�;
		this.�����뿩���� = �����뿩����;
		this.�뿩ȸ�� = �뿩ȸ��;
	}
	
	void �����˻�() {
		
	}
	void �������() {
		while(true) {
			System.out.println("������ȣ\t������\t�۰�\t�����뿩����");
			for(Book temp : ȸ�����������α׷�.books) {
				if(temp.�����뿩����) {
					System.out.println(temp.�����뿩����+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�����뿩����");
				}else {
					System.out.println(temp.�����뿩����+"\t"+temp.������+"\t"+temp.�۰�+"\t"+"�����뿩��");
				}
			}
		}
	}
	void �����뿩() {
		
	}
	void �����ݳ�() {
		
	}
	void �������() {
		while(true) {			
			System.out.println("������ȣ : "); String ������ȣ = ȸ�����������α׷�.scanner.next();
			System.out.println("������ : "); String ������ = ȸ�����������α׷�.scanner.next();
			System.out.println("�۰� : "); String �۰� = ȸ�����������α׷�.scanner.next();
			Book book = new Book(������ȣ, ������, �۰�, true, null);
			int i = 0;
			for(Book temp : ȸ�����������α׷�.books) {
				if(temp == null) {
					ȸ�����������α׷�.books[i] = book;
					return;
				}
			}
			
		}
	}
	void ��������() {
		
	}
	
}

















