package ����.Ÿ�̾�ͺ���ѿ��������;

public class ��� {
	// ���⼺ , �θ� = new�ڽ����
	���� ���� = new ����(2); // ���� ������ ������ 2
	���� ������ = new ����(3); // ������ ������ ������ 3
	���� �޴ٸ� = new ����(4); // �޴ٸ� ������ ������ 4
	���� �����ٸ� = new ����(5); // �����ٸ� ������ ������ 5
	
	int start() {
		System.out.println("������ ����ϴ�.");
		if(����.make() == false) {stop(); return 1;} // ������ 1�̸� �ı�
		if(������.make() == false) {stop(); return 2;} // ������ 2�̸� �ı�
		if(�޴ٸ�.make() == false) {stop(); return 3;} // ������ 3�̸� �ı�
		if(�����ٸ�.make() == false) {stop(); return 4;} // ������ 4�̸� �ı�
		return 0;
	}
	void stop() {
		System.out.println("������ �ı��Ǿ����ϴ�.");
	}
}
