package _01_oneArray;

public class T01_intArray {

	public static void main(String[] args) {
		/*
		 * 배열 : 같은 자료형을 연속된 저장공간에 저장
		 * 특징
		 	1. 배열의 길이를 저장하면 늘리거나 줄일 수 없다.
		 	2. 같은 자료형을 사용해야 한다.
		 	
		 * 사용법
		 	- 저장공간만 확보하고 나중에 값을 널을 때
		 		int[] 변수명 = new int[개수];
		 		int 변수명[] = new int[개수];
		 	- 배열을 만들면서 값을 바로 넣을 때
		 		int[] 변수명 = {1,2,3,4};
		 */
		int arrayInt[] = new int[10];
		int[] arrayInt2 = new int[5];
		
		int[] arrayInt3 = {1,2,3,4,5};
		System.out.println("index번호 3번의 값 : "+arrayInt3[3]);
		System.out.println("index번호 3번의 값 : "+arrayInt3[0]);
		
		// array 안 변수 덮어쓰기
//		arrayInt3[0] = 20;
//		System.out.println("index번호 3번의 값 : "+arrayInt3[0]);
//		
//		System.out.println("---------------------------");
//		for(int i=0; i <5; i++)
//			System.out.println("index번호 3번의 값 : "+arrayInt3[i]);
//		
//		System.out.println("---------------------------");
//		for(int i =0; i<5; i++) {
//			arrayInt3[i] = i*2;
//			System.out.println("index번호 3번의 값 : "+arrayInt3[i]);
//		}
		System.out.println("---------------------------");
		for(int i =0; i<10; i++) {
			System.out.println(arrayInt[i]);
		}
		System.out.println("---------------------------");
		
		//length : 배열의 길이
		int int1[] = {4,6,7,8,3,6,7};
		int int2[] = new int[5];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		for(int i=0; i<int1.length; i++) {
			System.out.println(int1[i]);
		}
		/*
		 1. 배열의 길이가 5인 배열 만들기
		 2. 1번 배열에 for 문으로 0,3,6,9,12 값 넣기
		 3. 1번 배열 돌면서 합계 구하여 출력하기
		 */
		int ary[] = new int[5];// = {0,0,0,0,0};
		int sum = 0;
		for(int i=0;i<ary.length;i++) {
			ary[i] = i*3;
			sum += ary[i];
			if(i==ary.length-1)
				System.out.print(ary[i] + "\n");
			else
				System.out.print(ary[i] + ", ");
		}
		System.out.println(sum);
	}

}
