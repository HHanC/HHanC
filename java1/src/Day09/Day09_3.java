package Day09;

public class Day09_3 {

	public static void main(String[] args) {
		
		// p. 294~295
			// ���� super() ������ �ڵ��߰�
			// super() : �θ�۷����� �� ������ ȣ��
			// super(�μ�1, �μ�2) : �θ�۷����� [2�� �μ�] ������ ȣ��
			// super(�μ�1, �μ�2, �μ�3) : �θ�Ŭ������ [3���μ�] ������ ȣ��
		// 1. ��ü ����
		Student student = new Student("Ȧ�浿", "123", 1);
		// 2. ����Ŭ������ ���� ��ü�� ����Ŭ������ ��� ����
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		// 3.
		System.out.println("studentNo : " + student.studentNo);
		
		
	}
	
}
