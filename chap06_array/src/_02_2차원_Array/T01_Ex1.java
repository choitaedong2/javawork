package _02_2차원_Array;

import java.util.Scanner;

public class T01_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		for(int i=ary1.length-1; i>0 ;i--) {
			System.out.printf("%d\t",ary1[i]);
		}
		System.out.println("\n================================");
		System.out.println("03번 문제 풀이 결과");
//		System.out.println("넣고자 하는 정수의 개수를 입력하십시오.");
//		int[] ary3 = new int[sc.nextInt()];
//		for(int i=0; i<ary3.length; i++) {
//			if(i==0) {
//				System.out.println("넣고자 하는 정수를 입력해 주십시오");
//				int tmp = sc.nextInt();
//				ary3[i] = tmp;
//			}
//			else {
//				System.out.println("다음으로 넣을 정수를 입력해 주십시오");
//				int tmp = sc.nextInt();
//				ary3[i] = tmp;
//			}
//		}
//		for(int i=0; i<ary3.length; i++) {
//			for(int j=1; j<ary3.length-i;j++) {
//				if(ary3[j-1] >= ary3[j]) {
//					int tmp = ary3[j];
//					ary3[j] = ary3[j-1];
//					ary3[j-1] = tmp;
//				}
//			}
//		}
//		
//		for(int i=0; i<ary3.length; i++)
//			if(i==ary3.length-1)
//				System.out.print(ary3[i] + "\n");
//			else
//				System.out.print(ary3[i] + ", ");
		System.out.println("================================");
		System.out.println("04번 문제 풀이 결과");
		String[] ary4 = {
				"사과", "귤", "포도", "복숭아", "참외"
		};
		for(int i=0; i<ary4.length;i++) {
			if(ary4[i]=="귤") {
				System.out.println(i + "(인덱스 번호) = '귤'");
			}
		}
		System.out.println("================================");
		System.out.println("05번 문제 풀이 결과");
		System.out.println("단어를 입력해 주세요.");
//		String word5 = sc.next();
//		char[] word5_list = new char[word5.length()];
//		for(int i=0; i<word5_list.length;i++) {
//			word5_list[i] = word5.charAt(i);
//		}
//		System.out.println("찾고자하는 문자를 입력해주세요.");
//		char tmp5 = sc.next().charAt(0);
//		System.out.println("문자열 : "+ word5);
//		System.out.println("문자 : "+ tmp5);
//		System.out.printf("%s에 %s가 존재하는 위치(인덱스) :",word5, tmp5);
//		int count5 = 0;
//		for(int i=0; i<word5_list.length;i++) {
//			if(word5_list[i]==tmp5) {
//				System.out.print(" "+i);
//				count5++;
//			}
//		}
//		System.out.printf("\n%s 개수 : %d\n",tmp5, count5);
		System.out.println("================================");
		System.out.println("06번 문제 풀이 결과");
		String[] week6= {
			"월", "화", "수", "목", "금", "토", "일"	
		};
		System.out.println("0~6사이의 정수를 입력해 주십시오");
//		int num6 = sc.nextInt();
//		if(num6<=6 && num6>=0)
//			System.out.println(week6[num6]+"요일");
//		else
//			System.out.println("잘못입력하셨습니다.");
		System.out.println("================================");
		System.out.println("07번 문제 풀이 결과");
		System.out.println("넣고자 하는 정수의 개수를 입력하십시오.");
//		int[] ary7 = new int[sc.nextInt()];
//		for(int i=0; i<ary7.length; i++) {
//			if(i==0) {
//				System.out.println("넣고자 하는 정수를 입력해 주십시오");
//				int tmp = sc.nextInt();
//				ary7[i] = tmp;
//			}
//			else {
//				System.out.println("다음으로 넣을 정수를 입력해 주십시오");
//				int tmp = sc.nextInt();
//				ary7[i] = tmp;
//			}
//		}
//		int sum7 = 0;
//		for(int i=0; i<ary7.length; i++) {
//			sum7 += ary7[i];
//		}
//		System.out.println("배열 전체의 합 : " + sum7);
		System.out.println("================================");
		System.out.println("08번 문제 풀이 결과");
//		System.out.println("3이상의 홀수를 입력해 주십시오.");
//		int num8 = sc.nextInt();
//		if(num8%2!= 1 || num8>=3)
//			while(num8%2!=1) {
//				System.out.println("정수 : "+num8);
//				System.out.println("다시 입력하세요.");
//				num8 = sc.nextInt();
//			}
//		System.out.println("정수 : "+num8);
//		int[] num8_arr = new int[num8*2-1];
//		for(int i =0; i<num8_arr.length; i++) {
//			if(i<num8) {
//				num8_arr[i] = i+1;
//				System.out.print(num8_arr[i] + ", ");
//			}
//			else {
//				num8_arr[i] = num8*2-1-i;
//				System.out.print(num8_arr[i] + ", ");
//			}
//		}
//		System.out.println("");
		System.out.println("================================");
		System.out.println("09번 문제 풀이 결과");
		String[] menu9 = {
				"양념", "간장", "후라이드"
		};
		System.out.print("주문하실 치킨 메뉴를 입력해 주세요. : ");
		String order9 = sc.next();
		System.out.println(order9);
		int count9 = 0;
		for(int i =0; i<menu9.length; i++) {
			if(menu9[i].equals(order9)) // 값이 같은지 확인하기 위해서는 equal 확인
				System.out.println(order9+"치킨 배달 가능");
			else
				count9++;
		}
		if(count9 == menu9.length)
			System.out.println(order9 + "치킨은 없는 메뉴입니다.");
		
		System.out.println("================================");
		System.out.println("10번 문제 풀이 결과");
		int[] num10 = new int[10];
		for(int i=0; i<num10.length; i++) {
			num10[i] = (int)(Math.random()*10);
			System.out.print(num10[i]+", ");
			if(i == 9) {
				num10[i] = (int)(Math.random()*10);
				System.out.print(num10[i]+"\n");
			}
		}
		for(int i=0; i<num10.length; i++) {
			for(int j=1; j<num10.length-1; j++)
				if(num10[j-1] >= num10[j]) {
					int tmp = num10[j];
					num10[j] = num10[j-1];
					num10[j-1] = tmp;
				}
		}
		System.out.println("최대값 : " + num10[9]);
		System.out.println("최소값 : " + num10[0]);
		System.out.println("================================");
		// 11. 사용자로부터 정수값 5개 배열에 입력
		// 오름차순 정렬로 정렬하기 : 
		// Bubble 정렬 : 1, 2, 3, 4, 5
		// 	1) 1<2, 2<3, 3<4, 4<5 순으로 큰 수를 뒤로 보냄
		// 	2) 1<2, 2<3, ... 3<4
		// select 정렬 : 7, 2, 3, 4, 5, 6
		//	1) 7<2, 7<3, 7<4, 7<5, 7<6 맨 앞에 있는 숫자와 다른 수 비교하여 낮은 수를 앞으로 불러옴
		// insert 정렬 : 7, 2, 3, 4, 5, 6
		//	1) 7<2, 
		System.out.println("11번 문제 풀이 결과");
		
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
			boolean flag = false;
			for(int i=1; i<ary.length; i++) {
				if(ary[i]<=ary[i-1]) {
					int tmp = ary[i-1];
					ary[i-1] = ary[i];
					ary[i] = tmp;
					flag = true;
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
