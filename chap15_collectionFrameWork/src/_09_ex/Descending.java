package _09_ex;

import java.util.Comparator;

public class Descending implements Comparator<Fruit>{ //Fruit 한정

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			if(o1.price < o2.price) return 1;
			else if(o1.price == o2.price) return 0;
		}
		return -1;
	}
	
}