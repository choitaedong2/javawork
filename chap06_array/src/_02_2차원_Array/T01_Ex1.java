package _02_2차원_Array;

import java.util.Scanner;

public class T01_Ex1 {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("01번 문제 풀이 결과");
		int[] ary1 = new int[10];
		for(int i=0; i<ary1.length;i++) {
			ary1[i] = i+1;
			if(ary1.length== i+1)
				System.out.printf("%d\n", ary1[i]);
			else
				System.out.printf("%d\t", ary1[i]);
		}
		
		System.out.println("================================");
		System.out.println("02번 문제 풀이 결과");
		
		for(int i=ary1.length-1; i<0 ;i--) {
			System.out.printf("%d\t",ary1[i]);
		}
		System.out.println("================================");
		System.out.println("03번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("04번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("05번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("06번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("07번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("08번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("09번 문제 풀이 결과");
		System.out.println("================================");
		System.out.println("10번 문제 풀이 결과");
		
		System.out.println("================================");
		// 11. 사용자로부터 정수값 5개 배열에 입력
		// 오름차순 정렬로 정렬하기
		System.out.println("11번 문제 풀이 결과");
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		System.out.println("정수 5개를 입력해 주십시오.");
		for(int i=0; i<ary.length; i++) {
//			ary[i] = sc.nextInt();
			ary[i] = (int)(Math.random()*10);
		}
		for(int i=0; i<ary.length; i++) {
			if(ary.length == i+1)
				System.out.print(ary[i]);
			else
				System.out.print(ary[i]+", ");
		}
		System.out.println("");
		for(int j=1; j<ary.length; j++) {
			for(int i=1; i<ary.length; i++) {
				if(ary[i]<=ary[i-1]) {
					int tmp = ary[i-1];
					ary[i-1] = ary[i];
					ary[i] = tmp;
				}
			}
		}
		for(int i=0; i<ary.length; i++) {
			if(ary.length == i+1)
				System.out.println(ary[i]);
			else
				System.out.print(ary[i]+", ");
		}
		
		System.out.println("================================");
		
		// 12.	각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
		//		각 과목별 총점과 평균을 구해 아래와 같이 출력하기
		//		점수는 2차원 배열로 마음대로 넣는다.
		
		// 과목 및 점수 생성문
		System.out.println("12번 문제풀이 결과");
		String[] name = {"번호","국어","영어","수학","총점","평균"};
		double[][] score = new double[5][6];
		for(int i=0; i<score.length;i++) {
			double sum=0;
			double avg;
			for(int j=0; j<score[i].length;j++) {
				switch(j) {
				case 0:
					score[i][j] = i+1;
//					System.out.printf("score[%d][%d] : %d\n", i, j, (int)score[i][j]);
					break;
				case 1: case 2: case 3:
					score[i][j] = (int)(Math.random()*100);
					sum += score[i][j];
//					System.out.printf("score[%d][%d] : %.2f\n", i, j, score[i][j]);
					break;
				case 4:
					score[i][j] = sum;
//					System.out.printf("score[%d][%d] : %.2f\n", i, j, score[i][j]);
					break;
				case 5:
					score[i][j] = sum/3;
//					System.out.printf("score[%d][%d] : %.2f\n", i, j, score[i][j]);
					break;
				}
			}
		}
		String[] total = new String[4];
		String[] total_avg = new String[4];
		for(int i=0; i<total.length;i++) {
			int sum = 0;
			double avg = 0;
			if(i==0) {
				total[i]="과목총점";
				total_avg[i]="과목평균";
			}
			else {
				for(int j=0; j<score.length;j++) {
					sum += score[j][i];
				}
			avg = sum/score.length;
			total[i] = Integer.toString(sum);
			total_avg[i] = Double.toString(avg);
			}
		}		
		// 결과 출력문
		for(int i=0; i<name.length;i++)
			if(name.length == i+1)
				System.out.print("\t"+name[i]+"\n");
			else
				System.out.print("\t"+name[i]);
		System.out.println("------------------------------------------------------");
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				if(score[i].length == j+1) {
					System.out.printf("\t%.1f\n", score[i][j]);
				} else
					System.out.printf("\t%d",(int)(score[i][j]));
			}
		}
		System.out.println("------------------------------------------------------");
		for(int i=0; i<total.length;i++) {
			if(total.length==i+1)
				System.out.printf("\t%s\n",total[i]);
			else
				System.out.printf("\t%s",total[i]);
		}
		for(int i=0; i<total_avg.length;i++) {
			if(total_avg.length==i+1)
				System.out.printf("\t%s\n",total_avg[i]);
			else
				System.out.printf("\t%s",total_avg[i]);
		}
		System.out.println("================================");
	}

}
