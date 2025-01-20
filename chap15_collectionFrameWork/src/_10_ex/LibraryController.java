package _10_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryController {
	Scanner sc = new Scanner(System.in);
	Book book = new Book();
	List<Book> aList = new ArrayList<>();
	
	void info(){
	}
	
	void insertBook() {
		aList.add(new Book("java", "나자바", "한빛미디어"));
		aList.add(new Book("oracle", "오로라", "길벗"));
		aList.add(new Book("aws", "이고잉", "더조은"));
	}
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
//	void insertBook(String title, String author, String publisher) {
//		aList.add(new Book(title, author, publisher));
//	}
	
	List<Book> selectAll() {
		return aList;
	}
	// 정확히 일치하는 도서명만 검색
	Book searchBookTitle(String search) {
		Book book = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return book;
		}
		for(int i=0; i<aList.size(); i++) {
			if(search.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			}
		}
		return book;
	}
	// 해당 단어가 포함하는 도서명 검색
	ArrayList<Book> searchBookTitle2(String search) {
		ArrayList<Book> searchList = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return null;
		}
//		for(int i=0; i<aList.size(); i++) {
//			if(aList.get(i).getTitle().contains(search)) {
//				searchList.add(aList.get(i));
//			}
//		}
		for(Book b : aList) { // 향상된 for 문
			if(b.getTitle().contains(search)) {
				searchList.add(b);
			}
		}
		return searchList;
	}
	
	Book bookDelate(String search) {
		Book book = null;
		if(aList.isEmpty()) {
			System.out.println("삭제 가능한 책이 없습니다.");
			return book;
		}
		else if(aList.size() >= 1) {
		for(int i =0 ; i<aList.size(); i++) {
			if(search.equals(aList.get(i).getTitle())) {
				book = aList.remove(i);
				break;
			}
		}
		System.out.println(search + " 책을 삭제하였습니다.");
		}
		return book;
	}
	
	Book deleteBook(String title, String author) {
		Book removeBook = null;
		for (int i =0 ; i<aList.size(); i++)  {
			if(aList.get(i).getTitle().equals(title) && author.equals(aList.get(i).getAuthor()));
			removeBook = aList.remove(i);
			break;
		}
		return removeBook;
	}


}