package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_Ű����ũ_��� {

	// ��� : ����
	// Ŭ���� : �Ե��̶�, ����ŷ
	// �������̽� : Ű����ũ
	// ����ó�� : ��ǰ��� ����
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
		// * �����Է�
		try {// try {}�ȿ� ����[����] �߻��� �� ���� �ڵ� �ֱ�(����)
		FileInputStream inputStream = new FileInputStream("D:/java/�Ե��������.txt"); // 1. ���� �Է°�ü (���ϰ��)
		// **���� �о���� [���� --- > ��Ʈ��(����Ʈ��) ---> �ڹ�]
			// 1. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			// 2. �о�ͼ� �迭 ����
			inputStream.read(bytes);
			// 3. // ����Ʈ�� -> ���ڿ�
			String ���ϳ��� = new String(bytes); 
				// String ���� �޼ҵ�	split("����");
			// [ , : �ʵ屸�� \n : ��ü(��ǰ ����)]
			String[] ��ǰ��� = ���ϳ���.split("\n"); // String �ڸ��� �޼ҵ� splft("����");
			
			
			for(String temp : ��ǰ���) {
				String[] �ʵ��� = temp.split(",");
				��ǰ ��ǰ = new ��ǰ(�ʵ���[0],
						Integer.parseInt(�ʵ���[1]),
						Integer.parseInt(�ʵ���[2]));
				// ���ڿ� -- > ������ ��ȯ[i] [Integer.parseInt("���ڿ�")] // �����̶� ��� �������̱� ������
				// ����Ʈ ����
				��ǰ����Ʈ.add(��ǰ);
			}
		}catch(Exception e) { // catch : ���� ã�� -> Exception Ŭ������ ��ü�� ����			
		}
		// ���ְ� ���缮�� �Ե����� Ű����ũ ��ü ����
		Ű����ũ �Ե����� = new �Ե�����("���缮", ��ǰ����Ʈ); // �Ե����� Ű����ũ ����
		
		while(true) {
			
			�Ե�����.��ǰ���();
			int ch = scanner.nextInt();
			if(ch == -1) {
				�Ե�����.��ǰ�߰�();
			}
		}
		
	}
	
	
}
