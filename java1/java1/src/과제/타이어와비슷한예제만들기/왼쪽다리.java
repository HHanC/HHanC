package ����.Ÿ�̾�ͺ���ѿ��������;

public class ���ʴٸ� extends ���� {

	public ���ʴٸ�() {}
	
	public ���ʴٸ�(int �ִ����, int ��������) {
		 super(�ִ����);
	}
	
	@Override
	public boolean make() {
		��������++;	
		if(�������� < �ִ����) {
			System.out.println("���ʴٸ� �������� : " + (�ִ���� - ��������));
			return true;
		}else {
			System.out.println("���ʴٸ� �����ı�");
			return false;
		}
	}	
}
