package _06_tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class T03_treeSet {

	public static void main(String[] args) {
		Integer[] score = {100, 87, 45, 68, 95, 70};
		
		TreeSet<Integer> setScores = new TreeSet<>();

		for(Integer i : score)
			setScores.add(i);
		// NavigableSet : 임의 값까지 정렬 [.headSet, .tailSet, .subSet] 
										// false => 임의 값 포함 안함
										// true => 임의값 포함
		NavigableSet<Integer> result1 = setScores.headSet(87, false);
		NavigableSet<Integer> result2 = setScores.tailSet(87, true);
		NavigableSet<Integer> result3 = setScores.subSet(70, false, 95, true);
		System.out.println("87점 미만인 점수 검색 : " + result1);
		System.out.println("87점 이상인 점수 검색 : " + result2);
		System.out.println("70점 초과, 95점 이하 점수 검색 : " + result3);
	}

}
