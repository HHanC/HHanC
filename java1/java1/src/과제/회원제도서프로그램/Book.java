package 과제.회원제도서프로그램;

public class Book {
	// 1. book
	// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원
	// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제
	
	String 도서번호;
	String 도서명;
	String 작가;
	boolean 도서대여여부;
	String 대여회원;
	
	public Book() {}

	public Book(String 도서번호, String 도서명, String 작가, boolean 도서대여여부, String 대여회원) {
		super();
		this.도서번호 = 도서번호;
		this.도서명 = 도서명;
		this.작가 = 작가;
		this.도서대여여부 = 도서대여여부;
		this.대여회원 = 대여회원;
	}
	
	void 도서검색() {
		
	}
	void 도서목록() {
		while(true) {
			System.out.println("도서번호\t도서명\t작가\t도서대여여부");
			for(Book temp : 회원제도서프로그램.books) {
				if(temp.도서대여여부) {
					System.out.println(temp.도서대여여부+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"도서대여가능");
				}else {
					System.out.println(temp.도서대여여부+"\t"+temp.도서명+"\t"+temp.작가+"\t"+"도서대여중");
				}
			}
		}
	}
	void 도서대여() {
		
	}
	void 도서반납() {
		
	}
	void 도서등록() {
		while(true) {			
			System.out.println("도서번호 : "); String 도서번호 = 회원제도서프로그램.scanner.next();
			System.out.println("도서명 : "); String 도서명 = 회원제도서프로그램.scanner.next();
			System.out.println("작가 : "); String 작가 = 회원제도서프로그램.scanner.next();
			Book book = new Book(도서번호, 도서명, 작가, true, null);
			int i = 0;
			for(Book temp : 회원제도서프로그램.books) {
				if(temp == null) {
					회원제도서프로그램.books[i] = book;
					return;
				}
			}
			
		}
	}
	void 도서삭제() {
		
	}
	
}

















