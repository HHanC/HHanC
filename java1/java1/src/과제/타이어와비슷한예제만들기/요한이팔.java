package ����.Ÿ�̾�ͺ���ѿ��������;

public class �������� extends �ȴٸ� {

	public ��������(int �ִ�ȸ����, String ����ġ) {
		super(�ִ�ȸ����, ����ġ);
	}
	
	@Override
	public boolean �ٸ�() {
		����ȸ����++;
		if(����ȸ���� < �ִ�ȸ����) {
			System.out.println(�ٸ���ġ +"������ �� ��ü���� : " + (�ִ�ȸ���� - ����ȸ����));
			return true;
		}else {
			System.out.println(�ٸ���ġ + "���� ����� �� �����ϴ�.");
			return false;
		}
	}	
}
