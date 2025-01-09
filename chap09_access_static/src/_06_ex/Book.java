package _06_ex;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	Book() {
	}

	Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getInfo() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher + "]";
	}
}
/*
package _06_ex;

public class Book {
	static int no = 0;
	private int bookNo;
	private String title;
	private String author;
	private String price;
	private String publisher;
	
	Book() {
		bookNo = no++;
		this.title = "Unknow";
		this.author = "Unknow";
		this.price = "0";
		this.publisher = "Unknow";
		System.out.println(bookNo + ", " +
							title + ", " + 
							author + ", " +
							price + ", " +
							publisher);
	}
	*/

	/*
	 public String getTitle(String title){
	 	return title
	 }
	 public String setTitle(String title){
	 	this.title = title
	 }
	 */
	/*
	Book(String title, String author, int price, String publisher) {
		bookNo = no++;
		this.title = title;
		this.author = author;
		this.price = Integer.toString(price);
		this.publisher = publisher;
		System.out.println(bookNo + ", " +
				title + ", " + 
				author + ", " +
				price + ", " +
				publisher);
	}
	public void getBook(String title){
		if(this.title != title) {
			System.out.println("책이 없습니다.");
		}
		else {
			System.out.println("책 번호 : " + this.bookNo);
			System.out.println("책 제목 : " + this.title);
			System.out.println("책 저자 : " + this.author);
			System.out.println("책 가격 : " + this.price);
			System.out.println("책 출판사 : " + this.publisher);
		}
	}
}
*/