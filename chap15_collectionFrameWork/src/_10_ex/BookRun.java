package _10_ex;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		System.out.println(lc.selectAll());
//		lc.insertBook(new Book("java", "나자바", "한빛미디어"));
//		System.out.println(lc.selectAll());
//		lc.insertBook();
//		System.out.println(lc.selectAll());
		
		BookMenu bookMenu = new BookMenu();
		bookMenu.menu(1);

	}
}