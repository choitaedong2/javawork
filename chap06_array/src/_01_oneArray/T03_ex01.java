package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		
		// 1. 배열의 총점, 평균 구하기
		int[] score = {100, 98, 49, 78, 86};
		// 2. 최대값과 최소값 구하기
		int[] num = {83, 70, 27, 49, 20, 86, 90, 83, 58, 29};
		
		int sum = 0;
		for(int i = 0; i<score.length; i++)
			sum+= score[i];
		System.out.println("[배열의 총점, 평균 구하기]");
		System.out.println("총점은 : "+sum);
		System.out.println("평균은 : "+(double)(sum/score.length));
		
		System.out.println("========================");
		
		int[] m = {num[0], num[0]};		
		for(int i = 1; i<num.length; i++) {
			if(m[0]<num[i])
				m[0] = num[i];
			if(m[1]>num[i])
				m[1] = num[i];
		}
		System.out.println("[배열의 최대, 최소값 구하기]");
		System.out.println("최대값은 : "+m[0]);
		System.out.println("최소값은 : "+m[1]);
	}

}
