package _04_document;

public class Document {
	String name; // 인스턴스 변수
	static int count; // 정적 변수
	
	// 생성자1
	Document(){
		System.out.printf("제목없음%d.txt 문서가 생성됨\n", ++count);
	}
	// 생성자2
	Document(String name){
		this.name = name;
		System.out.println("문서 : "+this.name + ".txt 가 생성됨");
	}
}
