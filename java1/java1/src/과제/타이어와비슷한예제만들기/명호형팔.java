package ����.Ÿ�̾�ͺ���ѿ��������;

public class ��ȣ���� extends �ȴٸ� {

	public ��ȣ����(String ����ġ, int �ִ�ȸ����) {
		super(����ġ, �ִ�ȸ����) ;
	}
	
	@Override
	public boolean �ٸ�() {
		����ȸ����++;
		if(����ȸ���� < �ִ�ȸ����) {
			System.out.println(�ٸ���ġ +"��ȣ�� �� ��ü���� : " + (�ִ�ȸ���� - ����ȸ����));
			return true;
		}else {
			System.out.println(�ٸ���ġ + "���� ����� �� �����ϴ�.");
			return false;
		}
	}	
	
}
