package ����.����������α׷�;

import java.util.Random;

public class ������Ʈ�ѷ� {

	// ����� ���X
		// V[ ����� ] <-----> C[ �ڵ� ]
		// �ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
		// M : �� [ ������ ]
		// V : �� [ ����� ]
		// C : ��[M] �� ��[V] ���� ����
	
	// ����������α׷� [ ��� ] 
				// ����[super]
				// ��������[sub] , ��������[sub] , �ϳ�����[sub]
				// �� ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.���� 
	
	public String ���»���(String ��й�ȣ, String ������, int �����ȣ) {
		
		String ���¹�ȣ = null;
		while(true) {
			
			Random random = new Random();
			int ���� = random.nextInt(10000);
			���¹�ȣ = String.format("%04d", ����);
			
			Boolean �ߺ����� = false;
			for(���� temp : ����������α׷�.���¸���Ʈ) {
				if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
					�ߺ����� = true;
				}
			}
			if(!�ߺ�����) {
				break;
			}
		}	
		
		���� temp = null;
		if(�����ȣ == 1) {
			temp = new ��������(���¹�ȣ, ��й�ȣ, ������, �����ȣ);
		}else if(�����ȣ == 2) {
			temp = new ��������(���¹�ȣ, ��й�ȣ, ������, �����ȣ);
		}else if(�����ȣ == 3) {
			temp = new �ϳ�����(���¹�ȣ, ��й�ȣ, ������, �����ȣ);
		}
		
		int i = 0;
		for(���� temp2 : ����������α׷�.���¸���Ʈ) {
			if(temp2 == null) {
				����������α׷�.���¸���Ʈ[i] = temp;
				return ���¹�ȣ;
			}
		}		
		return null;
	}
	
	public boolean �Ա�(String ���¹�ȣ, int �Աݾ�) {
		
		int i = 0;
		for(���� temp : ����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)) {
				����������α׷�.���¸���Ʈ[i].set���ݾ�(temp.get���ݾ�()+�Աݾ�);
				return true;
			}
			i++;
		}	
		return false;
	}
	
	public int ���(String ���¹�ȣ, String ��й�ȣ, int ��ݾ�) {
		
		int i = 0;
		for(���� temp : ����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)
					&& temp.get��й�ȣ().equals(��й�ȣ)) {
				if(temp.get���ݾ�() < ��ݾ�) {
					return 1;
				}else {
					����������α׷�.���¸���Ʈ[i].set���ݾ�(temp.get���ݾ�()-��ݾ�);
					return 2;
				}
			}
			i++;
		}
		
		return 3;
	}
	public int ��ü(String ���¹�ȣ, String ��й�ȣ, int ��ü�ݾ�, String �޴°���) {
		
		int i = 0;
		for(���� temp : ����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get���¹�ȣ().equals(���¹�ȣ)
					&& temp.get��й�ȣ().equals(��й�ȣ)) {
				int j = 0;
				for(���� temp2 : ����������α׷�.���¸���Ʈ) {
					if(temp2 != null && temp2.get���¹�ȣ().equals(�޴°���)) {
						if(temp.get���ݾ�() < ��ü�ݾ�) {
							return 1;
						}else {
							����������α׷�.���¸���Ʈ[i].set���ݾ�(temp.get���ݾ�()-��ü�ݾ�);
							����������α׷�.���¸���Ʈ[j].set���ݾ�(temp2.get���ݾ�()+��ü�ݾ�);
							return 2;
						}
					}
					j++;
				}
			}
			i++;
		}				
		return 4;
	}
	public ����[] ���¸��(String ������) {
		
		����[] �����¸�� = new ����[100];
		for(���� temp : ����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.get������().equals(������)) {
				
				int i = 0;
				for(���� temp2 : �����¸��) {
					if(temp2 == null) {
						�����¸��[i] = temp;
						break;
					}
					i++;
				}
			}
		}	
		return �����¸��;
	}
	public boolean ����() {
		return false;
	}
}

















