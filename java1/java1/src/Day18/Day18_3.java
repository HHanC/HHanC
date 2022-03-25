package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		
		// p.731~732 : LinkedList Ŭ����
		// 						 ArrayList				vs				LinkedList
		//							�迭										��ũ
		//���ε���������		�ε��� �������� �޸� ����[��]				���� �ٸ� �޸� �ּ� ����
		// �ӵ�					
		// add[�߰�]					����										
		// add[����=�߰�]														����
		// �˻�						����	
		// ����																����
		
		/*
		 * 
		 * 						������������������						��		��		��		��
		 * 
		 * 
		 * 
		 */
		
		// 1. ArrayList ��ü ���� [���׸� : String]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList ��ü ���� [���׸� : String]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. �ð�����
		Long stattime; // ���� �ð�
		Long endtime; // ������ �ð�
		
		// 4. ArrayList ��ü�� ���� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
			stattime = System.nanoTime(); // ���� �ð��� ����ð� ȣ��
		for(int i=0; i<10000; i++) {
			list1.add(0, i+""); // ������ -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2. ����+""
								// ���ڿ� -> ���� ��ȯ : Integer.parseInt(���ڿ�)
			
		}
		
			endtime = System.nanoTime(); // ������ = 10��/1��
			System.out.println("ArrayList�� ���� �����ϴµ� �ɸ��� �ð� : " + (endtime - stattime) + "ns");
			// 5. LinkedList ��ü�� ���� ��ü�� �����ϴµ� �ɸ��� �ð� üũ
			
			stattime = System.nanoTime(); // ���� �ð��� ����ð� ȣ��
			for(int i=0; i<10000; i++) {
				list2.add(0, i+""); // ������ -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2. ����+""
									// ���ڿ� -> ���� ��ȯ : Integer.parseInt(���ڿ�)
				
			}
			
				endtime = System.nanoTime(); // ������ = 10��/1��
				System.out.println("LinkedList�� ���� �����ϴµ� �ɸ��� �ð� : " + (endtime - stattime) + "ns");
	}
	
}













