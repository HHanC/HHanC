package Day08.bank;

public class View {// c s
	  Count count = new Count();
   
   
   public static void main(String[] args) { // m s
    
      View BankOpened = new View();
      BankOpened.menu();
      
      
      
   } // m e
   void menu() { // v s
      while(true) {         
         System.out.println("--------------------ȸ������----------------------");
         System.out.println(" 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��       ");
         System.out.println("------------------------------------------------");
         System.out.println("��ȣ����:  ");
         int ch = Model.scanner.nextInt();
         Model model = new Model();
         if(ch == 1) { 
            boolean result = model.ȸ������();   
            if(result)
               System.out.println(" ȸ������ ���� ");
            else
               System.out.println(" ȸ������ ���� ");
         }
         else if(ch == 2) {
            String result = model.�α���();
            if(result == null) {
               System.out.println("������ ȸ�� ������ �����ϴ�.");
            }else {
               System.out.println(" �ȳ��ϼ���! "+result+"��");
               Count();
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
   }
   void Count() {
   while(true){
       System.out.println("---------ȸ�� �޴�--------");
       System.out.print("1.���°��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸�� 7.��� ���� : ");
       int ch = Model.scanner.nextInt();                                          
       if(ch == 1) {count.���°���();}
       else if(ch == 2) {count.�Ա�();}
       else if(ch == 3) {count.���();}
       else if(ch == 4) {count.��ü();}
       else if(ch == 5) {count.����();}
       else if(ch == 6) {count.�����¸��();}
       else if(ch == 7) {return;}      
       else {System.out.println(" �� �� ���� ��ȣ�Դϴ�. ");}
    }
     
   }     
      
} //class end
