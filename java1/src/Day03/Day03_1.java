package Day03;

public class Day03_1 {	// c s
	
	public static void main(String[] args) {	// m  s
		
		// 1���� : ���, �Է�
		// 2���� : ����(����), ����(����)
		// ���
			// ��ǻ���� �Ǵܷ� => ����Ǽ�
			// ���ǽ��� true �̸� ���๮ ó��
			// ����
				// 1. IF( ���� [true/false] ) ���๮;
				// 2. IF( ���ǽ� ) ���๮;
				// 	  ELSE ���๮[����];
				// 3. ���๮�� 2�� �̻�( ; 2�� �̻��̸� ) { } ����ó��
				// 4. IF( ����1 ) { ���๮[��1]; } 
				// 	  ELSE IF( ����2 ) { ���๮[��2]; }
				// 	  ELSE IF( ����3 ) { ���๮[��3]; }
				// 	  ELSE IF( ����4 ) { ���๮[��4]; }
				// 	  ELSE IF( ����5 ) { ���๮[��5]; }
				// 	  ELSE IF { ���๮[����]; }
				// 5. if ��ø
				//		if ( ���ǽ� ) {
				//			if( ���ǽ� ){ ���๮; }
				//			else { ���๮; }
				//		}else{
				//			if( ���ǽ� ){ ���๮; }
				//			else { ���๮; }
		
		// ����1
		if(3 > 1) System.out.println("��) 3�� 1���� ũ��.");
			// ���࿡ 3�� 1���� ũ�� ��� �ƴϸ� ���x
			// true�̸� ����
		// ����2
		if(3 > 5) System.out.println("��2) 3�� 5���� ũ��.");
			// ���࿡ 3�� 5���� ũ�� ���o �ƴϸ� ���x
		// ����3
		if(1 > 3) System.out.println("��3_1) 3�� 1���� ũ��.");
		else System.out.println("��3_2) 3�� 1���� �۴�.");
			// ���࿡ 3�� 1���� ũ�� ��3_1 ���
			// �ƴϸ� ( 3�� 1���� ������ ) ��3_2 ���
		// ����4
		if(3 > 2) {  // true ���๮ ���� [ ���๮(;) 2�� �̻��϶� ]
			System.out.println("true"); 
			System.out.println("3�� 2���� ũ��."); 
			} // true ���๮ ��
		else { // false ���๮ ����
			System.out.println("true");
			System.out.println("3�� 2���� �۴�.");
		} // false ���๮ ��
		// ����5
		if(3 > 5) System.out.println("��5) 3�� 5���� ũ��.");	// ����x
		else if(3 > 4) System.out.println("��5) 3�� 4���� ũ��.");	// ����x
		else if(3 > 3) System.out.println("��5) 3�� 3���� ũ��.");	// ����x
		else if(3 > 2) System.out.println("��5) 3�� 2���� ũ��.");	// ����o
		else System.out.println("true ����."); // ����x
		
		if(3 > 5) System.out.println("��5) 3�� 5���� ũ��.");	// ����x
		if(3 > 4) System.out.println("��5) 3�� 4���� ũ��.");	// ����x
		if(3 > 3) System.out.println("��5) 3�� 3���� ũ��.");	// ����x
		if(3 > 2) System.out.println("��5) 3�� 2���� ũ��.");	// ����o
		if(3 < 2) System.out.println("true ����."); // ����x
		
		
	}	// m c
}	// c e
