package ����.Ÿ�̾�ͺ���ѿ��������;

public class ������ extends ���� {

	public ������() {}
	
	public ������(int �ִ����, int ��������) {
		super(�ִ����);
	}
	
	@Override
	public boolean make() {
		��������++;
		if(�������� < �ִ����) {
			System.out.println("������ �������� : " + (�ִ���� - ��������));
			return true;
		}else {
			System.out.println("������ �����ı�");
			return false;
		}
	}	
}
