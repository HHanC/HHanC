package Day17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class �ڽ���� {

	public static void main(String[] args) {
		
		
	}
		// ����Ʈī�� : ? [��� Ŭ���� �̸�]
			// �ڽ�< ? > : ��� ���׸� ����
			// �ڽ�< ? extends Ŭ������ > : �ش� Ŭ�����κ��� ��ӹ��� (�ڽ�) ���׸� Ŭ���� ����
			// �ڽ�< ? super Ŭ������ > : �ش� Ŭ�����κ��� ��� �� (�θ�) ���׸� Ŭ���� ����
	
	public static void �ڽ����(�ڽ�<?> �ڽ����) {
		
		System.out.println(�ڽ����.getName() + "��������� : "
				+ Arrays.toString(�ڽ����.getStudents()));
		
	}
	
	// 2.
	public static void �л��ڽ�������(�ڽ�<? extends �л�> �ڽ����) {
						// * �л� Ŭ�����κ��� ��ӹ��� ��� Ŭ������ ����
		System.out.println(�ڽ����.getName() + "��������� : "
				+ Arrays.toString(�ڽ����.getStudents()));
	}
	
	
}
