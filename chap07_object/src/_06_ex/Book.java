package _06_ex;

// Book
// 속성 : 	저자(String)
// 			ISBN(int)
//			생성자 4개 오버로딩

// 클래스
public class Book {
	// 속성
	String author;
	int isbn;
	int price;
	
	// 생성자
	Book() {
		this("nobody", 12345, 30000);
	}
	
	Book(String author) {
		this(author, 12345, 30000);
	}
	
	Book(String author, int isbn) {
		this(author, isbn, 30000);
	}
	
	Book(String author, int isbn, int price) {
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	// 메소드 : 반환형(int) + 구문(sail(String author){})
	int sail(String author) {
		return 50000;
	}
}
