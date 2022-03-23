package Day08.bank;

import java.util.Scanner;

public class Model {
   static Scanner scanner = new Scanner(System.in);
   static Model [] bankMembers = new Model[2000];
   
   
   //1.field
     
    private String id;
    private String pwd;
    private String name;
    private String ssn;
   
      
   //2.constructor
   public Model() {}
   public Model( String id,String pwd, String name,String ssn) {
       this.id=id;
       this.pwd=pwd;
       this.name=name;
       this.ssn =ssn;
   }
      
   
   //3.method
       //회원가입
      boolean 회원가입() {
   
          System.out.println("Your id ? : ");
          String id = scanner.next();
          System.out.println("Your pwd? : ");
          String pwd = scanner.next();
          System.out.println("your name? :");
          String name =scanner.next();
          System.out.println("Your ssn? : ");
          String ssn = scanner.next();
    
          Model bankMember = new Model(id,pwd,name,ssn);
          //유효성 판단
          for(Model temp : bankMembers) {
             if(temp != null && temp.id.equals(id)) {
                System.out.println("알림: 현재 사용중인 아이디가 있습니다.");
                return false;
             }
          }
          //회원등록
          int i = 0;
          for(Model temp :bankMembers) {
             if(temp==null) {
                bankMembers[i]= bankMember;
                System.out.println("회원등록이 완료되었습니다.");
                return true;
             }
             i++;
          }
          return false;
       }//
      //로그인
      String 로그인() {
         System.out.println("아이디를 입력해주세요.");
         String id = scanner.next();
         System.out.println("비밀번호를 입력해주세요.");
         String pwd = scanner.next();
         
         for(Model temp : bankMembers) {
            if(temp != null && temp.id.equals(id) && temp.pwd.equals(pwd)) {
               System.out.println("로그인 성공 !!");
               return  temp.id;
            }
         }
         return null;
      }
      //아이디 찾기
      void 아이디찾기() {
         System.out.println("회원가입 시 입력하신 이름을 기입해주세요.");
         String name = scanner.next();
         System.out.println("회원가입시 입력한 주민번호를 입력해주세요. -짝대기를 제외하고 기입하여주세요.");
         String ssn= scanner.next();
         
         for(Model temp: bankMembers) {
            if(temp != null&& temp.name.equals(name) && temp.ssn.equals(ssn)) {
               System.out.println("회원님의 아이디는: "+temp.id);
               return;
            }
         }
         System.out.println("동일한 회원정보가 업습니다.");
      }
      //비밀번호 찾기
      void 비밀번호찾기() {
         System.out.println("기입하신 아이디를 입력해 주세요.");
         String checkId = scanner.next();
         System.out.println("기입하신 이름을 입력해주세요.");
         String checkName = scanner.next();
         
         for(Model temp: bankMembers) {
            if(temp != null && temp.id.equals(checkId) && temp.name.equals(checkName)) {
               System.out.println("회원님의 비밀번호는 :"+temp.pwd);
               return;
            }
         }
         System.out.println("일치하는 회원정보가 없습니다.");
      }
}