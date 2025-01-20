package _08_comparable;

import java.util.Comparator;

class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// return c1.compareTo(c2)*-1; 앞에 있는 객체를 오름차순 정렬
			// return c2.compareTo(c1)*-1; 뒤에 있는 객체를 내림차순 정렬
			return c1.compareTo(c2)*-1; // 내림차순 정렬
		}
		return -1;
	}
	
}