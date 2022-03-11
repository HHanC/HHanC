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
       //ȸ������
      boolean ȸ������() {
   
          System.out.println("Your id ? : ");
          String id = scanner.next();
          System.out.println("Your pwd? : ");
          String pwd = scanner.next();
          System.out.println("your name? :");
          String name =scanner.next();
          System.out.println("Your ssn? : ");
          String ssn = scanner.next();
    
          Model bankMember = new Model(id,pwd,name,ssn);
          //��ȿ�� �Ǵ�
          for(Model temp : bankMembers) {
             if(temp != null && temp.id.equals(id)) {
                System.out.println("�˸�: ���� ������� ���̵� �ֽ��ϴ�.");
                return false;
             }
          }
          //ȸ�����
          int i = 0;
          for(Model temp :bankMembers) {
             if(temp==null) {
                bankMembers[i]= bankMember;
                System.out.println("ȸ������� �Ϸ�Ǿ����ϴ�.");
                return true;
             }
             i++;
          }
          return false;
       }//
      //�α���
      String �α���() {
         System.out.println("���̵� �Է����ּ���.");
         String id = scanner.next();
         System.out.println("��й�ȣ�� �Է����ּ���.");
         String pwd = scanner.next();
         
         for(Model temp : bankMembers) {
            if(temp != null && temp.id.equals(id) && temp.pwd.equals(pwd)) {
               System.out.println("�α��� ���� !!");
               return  temp.id;
            }
         }
         return null;
      }
      //���̵� ã��
      void ���̵�ã��() {
         System.out.println("ȸ������ �� �Է��Ͻ� �̸��� �������ּ���.");
         String name = scanner.next();
         System.out.println("ȸ�����Խ� �Է��� �ֹι�ȣ�� �Է����ּ���. -¦��⸦ �����ϰ� �����Ͽ��ּ���.");
         String ssn= scanner.next();
         
         for(Model temp: bankMembers) {
            if(temp != null&& temp.name.equals(name) && temp.ssn.equals(ssn)) {
               System.out.println("ȸ������ ���̵��: "+temp.id);
               return;
            }
         }
         System.out.println("������ ȸ�������� �����ϴ�.");
      }
      //��й�ȣ ã��
      void ��й�ȣã��() {
         System.out.println("�����Ͻ� ���̵� �Է��� �ּ���.");
         String checkId = scanner.next();
         System.out.println("�����Ͻ� �̸��� �Է����ּ���.");
         String checkName = scanner.next();
         
         for(Model temp: bankMembers) {
            if(temp != null && temp.id.equals(checkId) && temp.name.equals(checkName)) {
               System.out.println("ȸ������ ��й�ȣ�� :"+temp.pwd);
               return;
            }
         }
         System.out.println("��ġ�ϴ� ȸ�������� �����ϴ�.");
      }
}