package _09_ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparator_main {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>();
//		TreeSet<Fruit> treeSet = new TreeSet<>(new Descending());
		treeSet.add(new Fruit("사과", 200));
		treeSet.add(new Fruit("배", 100));
		treeSet.add(new Fruit("귤", 300));
		
		System.out.println(treeSet);
		System.out.println("=================");
		
	}
}