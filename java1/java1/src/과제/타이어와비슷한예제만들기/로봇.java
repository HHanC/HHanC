package ����.Ÿ�̾�ͺ���ѿ��������;

public class �κ� {

	�ȴٸ� ������ = new �ȴٸ�("������", 6);
	�ȴٸ� �������� = new �ȴٸ�("��������", 2);
	�ȴٸ� ���ʴٸ� = new �ȴٸ�("���ʴٸ�", 3);
	�ȴٸ� �����ʴٸ� = new �ȴٸ�("�����ʴٸ�", 4);
	
	int run() {
		System.out.println("�κ��� �����Դϴ�.");
		if(������.��() == false) {stop(); return 1;}
		if(��������.��() == false) {stop(); return 2;}
		if(���ʴٸ�.�ٸ�() == false) {stop(); return 3;}
		if(�����ʴٸ�.�ٸ�() == false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("�κ��� ����ϴ�.");
	}
}
