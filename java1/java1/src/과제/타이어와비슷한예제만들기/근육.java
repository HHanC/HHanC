package ����.Ÿ�̾�ͺ���ѿ��������;

public class ���� {

	// 1. �ʵ�
	public int �ִ����; 
	public int ��������;	
	// 2. ������
	public ����() {}
	
	public ����(int �ִ����) {
		this.�ִ���� = �ִ����;
	}	
	// 3. �޼ҵ�
	public boolean make() { // make ����� , make �޼ҵ� ����
		��������++; // ���������� ���� ������
		if(�������� < �ִ����) { // ���������� �ִ� �������� �۴ٸ�
			System.out.println("�������� : " + (�ִ���� - ��������)); // �ִ���� - ���������� �Ͽ� ���� ���� Ȯ��
			return true; // true�� return
		}else { // �� ������ �ƴ϶��
			System.out.println("�����ı�"); // �ش� ���� ��ġ �ı�!!
			return false; // false�� return
		}						
	}
}
