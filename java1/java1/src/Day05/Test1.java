package Day05; // 패키지명  

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {// c s
	
	
	
	public static void main(String args[]) {// m s
		
		Scanner sc1 = new Scanner(System.in);
		String[][] 회원 = new String[100][2];
		String[][] 도서 = new String[100][2];
		
		//도서기본값
		//도서0
		도서[0][0]= "이것이자바다";
		도서[0][1]= "대여중X";
		//도서1
		도서[1][0]= "이것은자바?";
		도서[1][1]= "대여중X";
		
		while(true) {
			
			
			System.out.println("---------------");
			System.out.println("1.회원가입 2.로그인");
			System.out.println("---------------");
			
			int ch1 = sc1.nextInt();
			
			
			//회원가입
			if(ch1==1) {
				//인트로
				System.out.print("원하는 ID : ");
				String ID = sc1.next();
				System.out.print("원하는 PW : ");
				String PW = sc1.next();
					
				//아이디중복 확인
				boolean idCheck = true;
				for(int i=0; i<회원.length; i++) {
					if(회원[i][0]!=null&&회원[i][0].equals(ID)) {
						System.err.println("아이디 중복");
						idCheck = false;
						break;
					}
				}
					
				//저장
				if(idCheck) {
					for(int i=0; i<회원.length; i++) {
						if(회원[i][0]==null) {
							회원[i][0] = ID;
							회원[i][1] = PW;
							System.err.println("알림)) 회원가입  완료");
							break;
						}//if e
					}//for e
				}//if e
			}
					
				
				//로그인
			else if(ch1==2) {
				//인트로
				System.out.print("당신의 ID : ");
				String ID = sc1.next();
				System.out.print("당신의 PW : ");
				String PW = sc1.next();
					
				boolean loginCheck = false;
				
				//회원 확인
				for(int i=0; i<회원.length; i++) {
					if(loginCheck==true) {break;}

					//if어드민
					if(ID.equals("admin")) {
						System.out.println("알림)) 로그인 성공");
						loginCheck = true;
		/////////어드민의 로그아웃 방지/////////
						while(true) {
							//인트로
							System.out.println("-----------------------------------------");
							System.out.println("1.도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃");
							System.out.println("-----------------------------------------");
							int ch2 = sc1.nextInt();
							
							//어드민 1도서등록
							if(ch2==1) {
								
								//인트로
								System.out.print("등록할 도서 이름을 입력 하세요 : ");
								String name = sc1.next();
								//중복도서확인
								for(int j = 0; j<도서.length; j++) {
									if(도서[j][0]==null) {
										도서[j][0]=name;
										도서[j][1]="대여중X";
										System.out.println("등록완료");
										break;
									}
								}
							}
							else if(ch2==2) {
								System.out.print("도서등록번호\t\t도서이름\t\t대여여부\n");
								for(int j =0; j<도서.length; j++) {
									if(도서[j][0]!=null) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												도서[j][0],
												도서[j][1]);
									}
								}
							}
							else if(ch2==3) {
								System.out.println("삭제할 도서의 이름은..?");
								String name2 = sc1.next();
								for(int j =0; j<도서.length; j++) {
									if(도서[j][0].equals(name2)) {

											System.out.println("삭제하시겠습니까?");
											System.out.println("1.네 2.아니오");
											int 대답4 = sc1.nextInt();
											if(대답4==1) {
												도서[j][0] = "삭제됨";
												도서[j][1] = "삭제됨";
												break;
											}
											else { break;}
										
									}
								}
							}
							else if(ch2==4) {
								System.err.println("로그아웃");
								break;
							}
							else {
								System.err.println("알 수 없는 입력");
							}
							
						}
					
					}
					else if(회원[i][0]!=null&&회원[i][0].equals(ID)&&회원[i][1].equals(PW)) {
						System.out.println("알림)) 로그인 성공");
						loginCheck = true;
		/////////로그아웃 방지/////////
						while(true) {
							//인트로
							System.out.println("-----------------------------------------");
							System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
							System.out.println("-----------------------------------------");
							int ch2 = sc1.nextInt();
							
							//1도서검색
							if(ch2==1) {
								
								//인트로
								System.out.print("검색할 도서 이름을 입력 하세요 : ");
								String name = sc1.next();
								//안내
								System.out.print("도서등록번호\t도서이름\t대여여부\n");
								//도서찾기
								for(int j = 0; j<도서.length; j++) {
									
									boolean a = 도서[j][0].equals(name);
									if(a) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												도서[j][0],
												도서[j][1]);
												break;
									}
								}
							}
							else if(ch2==2) {
								System.out.print("도서등록번호\t\t도서이름\t\t대여여부\n");
								for(int j =0; j<도서.length; j++) {
									if(도서[j][0]!=null) {
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												도서[j][0],
												도서[j][1]);
									}
								}
							}
							else if(ch2==3) {
								System.out.print("대여할 도서 이름을 입력 하세요 : ");
								String name = sc1.next();
								//안내
								System.out.print("도서등록번호\t도서이름\t대여여부\n");
								//도서찾기
								for(int j =0; j<도서.length; j++) {
									if(도서[j][0].equals(name)) {
										//도서안내
										System.out.printf("%d\t\t%s\t\t%s\n",
												j,
												도서[j][0],
												도서[j][1]);
										//대여여부
										if(도서[j][1].equals("대여중X")) {
											System.err.println("대여가능합니다.");
											System.out.println("대여하시겠습니까?");
											System.out.println("1.네 2.아니오");
											int ch2_1 = sc1.nextInt();
											if(ch2_1==1) {
												도서[j][1] = "대여중("+ID+")";
											}
											else { break;}
											System.out.printf("%s~대여중\n",도서[j][0]);
											break;
										}
										else {
											System.err.println("대여중입니다.");
											break;
										}
									}
								}
							}
							else if(ch2==4) {
								System.out.println("반납할 도서의 이름은..?");
								String name2 = sc1.next();
								for(int j =0; j<도서.length; j++) {
									if(도서[j][0].equals(name2)) {
										if(도서[j][1].equals("대여중("+ID+")")) {
											System.out.println("당신이 대여한 도서입니다...반납가능");
											System.out.println("반납하시겠습니까?");
											System.out.println("1.네 2.아니오");
											int 대답4 = sc1.nextInt();
											if(대답4==1) {
												도서[j][1] = "대여중X";
												break;
											}
											else { break;}
										}
										else {
											System.out.println("당신이 대여한 도서가 아닙니다.");
											break;
										}
									}
								}
							}
							else if(ch2==5) {
								System.err.println("로그아웃");
								break;
							}
							else {
								System.err.println("알 수 없는 입력");
							}
							
						}
						
						
						
					}
				}
			}
			
		}
	
	
	}// m e
	
	
	
	
}// c e