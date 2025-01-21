package _02_wildcardGeneric;

public class Course {
	// 모든 사람이 등록 가능
	static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course1등록");
	}
	
	// 학생만 등록 가능
	static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course2등록");
	}
	
	
	// 직장인 및 일반인 등록 가능
	// Worker도 들어오고 부모도 들어오기 위해 extends 대신 super 사용
	static void registerCourse3(Applicant<? super Worker> applicant) { 
		System.out.println(applicant.kind.getClass().getSimpleName() + "가 course2등록");
	}
}
// Course.registerCourse1(new Applicant<Person>())