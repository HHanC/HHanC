package Day08;

import java.util.Scanner;

import Day08.bank.Count;
import Day08.bank.View;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean ȸ���޴�() {
			System.out.println("-------ȸ�� �޴�-------");
			System.out.println("1.���°��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸�� ���� : ");
			int ch = scanner.nextInt();
			String name = scanner.next();
			if(ch == 1) {
				 for(Count temp : View.counts) {
					 if(temp == null && temp.�̸�.equals(�̸�)) {
						 System.out.println("���¸� �����Ͽ����ϴ�.");
					 }else {
						 System.out.println("�̸��� �ٽ� �� �� Ȯ�����ּ���");
						 
					 }
				 }
				 
			}
			
	}
		
}
}