package Day08_3;

public class A { // ������ Ŭ������ ���������� ����ǹ�x
// ������ Ŭ���� ����A
	// 1. �ʵ�
	A a1 = new A(true); // �� Ŭ�������� public ȣ�� ����
	A a2 = new A(1);	// �� Ŭ�������� default ȣ�Ⱑ��
	A a3 = new A("���ڿ�");	// �� Ŭ�������� private ȣ�Ⱑ��
	
	public int field1;
	int field2;
	private int field3;
	
	// 2. ������
	public A(boolean b) {
		field1 = 1;
		field2 = 1;
		field3 = 1;
	} // ������
	A(int b) {}			   // �� ��Ű����
	private A(String s) {} // �� Ŭ������
	// 3. �޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
}
