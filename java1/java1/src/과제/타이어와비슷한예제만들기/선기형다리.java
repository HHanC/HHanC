package ����.Ÿ�̾�ͺ���ѿ��������;

public class �������ٸ� extends �ȴٸ� {

	public �������ٸ�(int �ִ�ȸ����, String �ٸ���ġ) {
		super(�ִ�ȸ����, �ٸ���ġ);
	}
	
	@Override
	public boolean �ٸ�() {
		����ȸ����++;
		if(����ȸ���� < �ִ�ȸ����) {
			System.out.println(�ٸ���ġ +"������ �ٸ� ��ü���� : " + (�ִ�ȸ���� - ����ȸ����));
			return true;
		}else {
			System.out.println(�ٸ���ġ + "���� �� �����ϴ�.");
			return false;
		}
	}
}
