package ����.Ÿ�̾�ͺ���ѿ��������;

public class �κ��ϼ� {

	public static void main(String[] args) {
	
		�κ� �����κ� = new �κ�();
		
		for(int i = 1; i<=5; i++) {
			
			int problemLocation = �����κ�.run();
			
			switch(problemLocation) {
			
			case 1:
				System.out.println("��ȣ�� ������ ��ü");
				�����κ�.������ = new ��ȣ����("������", 15);
				break;		
			case 2:
				System.out.println("������ �������� ��ü");
				�����κ�.������ = new ��ȣ����("������", 13);
				break;	
			case 3:
				System.out.println("����� ���ʴٸ� ��ü");
				�����κ�.������ = new ��ȣ����("������", 14);
				break;	
			case 4:
				System.out.println("������ �����ʴٸ� ��ü");
				�����κ�.������ = new ��ȣ����("������", 17);
				break;	
			}
			System.out.println("-----------------------");
		}
	}
}
