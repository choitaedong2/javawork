package _10_ex;

import java.util.Scanner;

public class BookMenu {
	int input;
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	Book book = new Book();
	
	static void info() {
		System.out.println("1: 새 도서 추가");
		System.out.println("2: 전체 도서 조회");
		System.out.println("3: 도서 검색");
		System.out.println("4: 도서 삭제");
		System.out.println("5: 도서 오름차순 정렬");
		System.out.println("9: menu 정보");
		System.out.println("0: 종료");
	}
	void menu(int input){
		this.input = input;
		System.out.println("도서 메뉴를 시작합니다.");
		lc.insertBook();
		BookMenu.info();
		if(this.input != 0) {
			do { 
				input = sc.nextInt();
				switch(input) {
				case 1:
					System.out.println("새 도서를 추가합니다.");
					System.out.println("각 도서의 제목, 저자, 출판사를 입려해 주십시오.");
					book.setTitle(sc.next());
					book.setAuthor(sc.next());
					book.setPublisher(sc.next());
					lc.insertBook(book);
					break;
				case 2:
					System.out.println("전체 도서를 조회합니다.");
					System.out.println(lc.selectAll());
					break;
				case 3:
					System.out.println("도서 검색 코너입니다.");
					System.out.println("찾고자 하는 도서명을 입력해 주십시오.");
					Book searchedBook = lc.searchBookTitle(sc.next());
					if(searchedBook == null) {
						System.out.println("찾는 책이 없습니다.");
					} else {
						System.out.println("찾은 책 : " + searchedBook);
					}
					break;
				case 4:
					System.out.println("도서 삭제 코너입니다.");
					System.out.println("삭제하고자 하는 도서명을 입력해주세요.");
					lc.bookDelate(sc.next());
					break;
				case 5:
					System.out.println("도서명 오름차순 정렬하였습니다.");
					break;
				case 9:
					BookMenu.info();
					break;
				case 0:
					System.out.println("메뉴를 종료합니다.");
					this.input = input;
					break;
				default:
					System.out.println("입력 범위를 벗어났습니다. 다시 입력해 주십시오.");
					break;
				}
			} while(this.input != 0);
		}
	}
}
