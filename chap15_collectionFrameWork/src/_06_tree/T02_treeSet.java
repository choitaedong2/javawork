package _06_tree;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02_treeSet {

	public static void main(String[] args) {
		HashMap<Integer, Set> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("금액 입력 : ");
//		int count = sc.nextInt()/1000;
		
		for(int i=1; i<6; i++) {
			Set<Integer> set = new TreeSet();
			set.clear();
			while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}
			
			map.put(i, set);
			System.out.println("로또번호 " + i + ". "+set);
		}
		System.out.println(map);
//		while(set.size() < 6) {
//			set.add((int)(Math.random()*45)+1);
//		}
		
//		System.out.println(set);
	}

}
