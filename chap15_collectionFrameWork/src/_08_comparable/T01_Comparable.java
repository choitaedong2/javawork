package _08_comparable;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	 @Override
	 public int compareTo(Person o) {
		 if(age<o.age) return -1;
		 else if(age>o.age) return 1;
		 else return 0;
	 }
	 @Override
	 public String toString() {
		 return "Person : name=" + name + ", age="+age;
	 }
	
}

public class T01_Comparable {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 25));
		treeSet.add(new Person("김자바", 35));
		treeSet.add(new Person("나자바", 27));
		
		// java.lang.comparable 오류 발생
		// 사용시 toString() 오버라이딩 필요
		System.out.println(treeSet);
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.name + ":" + p.age);
		}

	}

}
