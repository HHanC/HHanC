package ����.Ÿ�̾�ͺ���ѿ��������;

public class �ȴٸ� {

//	���� �κ��� ���� 10�� �����̸� �ٸ� �ȷ� ��ü
//	���� �κ��� �ٸ��� 10�� �����̸� �ٸ� �ٸ��� ��ü
//
//	///////////////////////////
//	�κ�
//
//	��, �ٸ�, ����
//
//	��, �ٸ�, �������� �κ��� �����
//
//	�κ�1, �κ�2, �κ�3
	public int �ִ�ȸ����;
	public int ����ȸ����;
	public String ����ġ;
	public String �ٸ���ġ;
	
	public �ȴٸ�() {}
		
	public �ȴٸ�(String �ٸ���ġ, int �ִ�ȸ����) {
		this.�ٸ���ġ = �ٸ���ġ;
		this.�ִ�ȸ���� = �ִ�ȸ����;		
	}
	
	public �ȴٸ�(int �ִ�ȸ����, String �ٸ���ġ) {
		this.�ִ�ȸ���� = �ִ�ȸ����;
		this.�ٸ���ġ = �ٸ���ġ;
	}

	public �ȴٸ�(int �ִ�ȸ����, int ����ȸ����, String ����ġ, String �ٸ���ġ) {
		this.�ִ�ȸ���� = �ִ�ȸ����;
		this.����ȸ���� = ����ȸ����;
		this.����ġ = ����ġ;
		this.�ٸ���ġ = �ٸ���ġ;
	}

	public boolean ��() {
		����ȸ����++;
		if(����ȸ���� < �ִ�ȸ����) {
			System.out.println(����ġ + "�� ���� Ƚ�� : " + (�ִ�ȸ���� - ����ȸ����));
			return true;
		}else {
			System.out.println(����ġ + "�� ����");
			return false;
		}
	}
	
	public boolean �ٸ�() {
		����ȸ����++;
		if(����ȸ���� < �ִ�ȸ����) {
			System.out.println(�ٸ���ġ + "�ٸ� ���� Ƚ�� : " + (�ִ�ȸ���� - ����ȸ����));
			return true;
		}else {
			System.out.println(�ٸ���ġ + "�ٸ� ����");
			return false;
		}
	}
	
}
















