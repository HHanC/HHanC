package Day08.bank;

import java.util.Scanner;

public class View { // c s
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) { // m s
		
		View BankOpened = new View();
		BankOpened.menu();
		
	} // m e
	void menu() { // v s
		while(true) {			
			System.out.println("--------ȸ������-------");
			System.out.print(" 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã�� ���� : ");
			int ch = scanner.nextInt();
			Model model = new Model();
			if(ch == 1) { //if
				boolean result = model.ȸ������();	
				if(//result)
					System.out.println(" ȸ������ ���� ");
				else
					System.out.println(" ȸ������ ���� ");
			}
			else if(ch == 2) {
				String result = model.�α���();
				if(result == null) {
					System.out.println("������ ȸ�� ������ �����ϴ�.");
				}else if(result.equals("admin")) {
					System.out.println(" �ȳ��ϼ���! "+result+"��"); // ?
					adminmenu(); // ?
				}else {
					System.out.println(" �ȳ��ϼ���! "+result+"��");
				}
			}
			else if(ch == 3) {
				//model.���̵�ã��();
			}		
			else if(ch == 4) {
				//model.��й�ȣã��();
			}		
			else {
				System.out.println("�� �� ���� ��ȣ�Դϴ�.");
			}
		}
		void modelmenu() {
			while(true){
				System.out.println("---------ȸ�� �޴�--------");
				System.out.print("1.���°��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸�� 7.��� ���� : ");
				int ch = scanner.nextInt();
				
				if(ch == 1) {Cotoller.���°���();}
				else if(ch == 2) {Cotoller.�Ա�();}
				else if(ch == 3) {Cotoller.���();}
				else if(ch == 4) {Cotoller.��ü();}
				else if(ch == 5) {Cotoller.����();}
				else if(ch == 6) {Cotoller.�����¸��();}
				else if(ch == 7) {return;}
				else {System.out.println(" �� �� ���� ��ȣ�Դϴ�. ");}
			}
		}
		}
		
	} // v e
	
	
} // c e