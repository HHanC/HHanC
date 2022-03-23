package Day08.bank;

public class View {// c s
	  Count count = new Count();
   
   
   public static void main(String[] args) { // m s
    
      View BankOpened = new View();
      BankOpened.menu();
      
      
      
   } // m e
   void menu() { // v s
      while(true) {         
         System.out.println("--------------------회원가입----------------------");
         System.out.println(" 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기       ");
         System.out.println("------------------------------------------------");
         System.out.println("번호선택:  ");
         int ch = Model.scanner.nextInt();
         Model model = new Model();
         if(ch == 1) { 
            boolean result = model.회원가입();   
            if(result)
               System.out.println(" 회원가입 성공 ");
            else
               System.out.println(" 회원가입 실패 ");
         }
         else if(ch == 2) {
            String result = model.로그인();
            if(result == null) {
               System.out.println("동일한 회원 정보가 없습니다.");
            }else {
               System.out.println(" 안녕하세요! "+result+"님");
               Count();
            }
         }
         else if(ch == 3) {
            //model.아이디찾기();
         }      
         else if(ch == 4) {
            //model.비밀번호찾기();
         }      
         else {
            System.out.println("알 수 없는 번호입니다.");
         }
      }
   }
   void Count() {
   while(true){
       System.out.println("---------회원 메뉴--------");
       System.out.print("1.계좌개설 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록 7.취소 선택 : ");
       int ch = Model.scanner.nextInt();                                          
       if(ch == 1) {count.계좌개설();}
       else if(ch == 2) {count.입금();}
       else if(ch == 3) {count.출금();}
       else if(ch == 4) {count.이체();}
       else if(ch == 5) {count.대출();}
       else if(ch == 6) {count.내계좌목록();}
       else if(ch == 7) {return;}      
       else {System.out.println(" 알 수 없는 번호입니다. ");}
    }
     
   }     
      
} //class end
