package _02_2차원_Array;

public class T02_lotto_noneLibrary {

	public static void main(String[] args) {
		// for문을 이용하여 45개 1차원 배열에 값을 1~45까지 넣는다.
		// 무작위로 자리바꿈을 해준다.
		// 맨앞에서부터 6개만 출력
		
		// 1. 1차원 45개짜리 배열 만들기
		int[] lotto1 = new int[45];
		// 2. 앞에 1~45까지의 값 넣어주기
		for(int i = 0; i<lotto1.length;i++) {
			lotto1[i] = i+1;
			if(lotto1.length == i+1)
				System.out.print(lotto1[i]+"\n");
			else
				System.out.print(lotto1[i]+", ");
			}
		int index;
		// 3. index번호를 무작위 뽑아서 자리바꿈을 해준다(random 0~44)
		for(int i=0; i<100;i++) {
			index = (int)(Math.random()*45);
			int tmp = lotto1[0];
			lotto1[0] = lotto1[index];
			lotto1[index] = tmp;
			}
		
		for (int i=0; i<6; i++) {
			if(i == 5)
				System.out.print(lotto1[i]+"\n");
			else
				System.out.print(lotto1[i]+", ");
			}
		
		// 1~45 사이의 중복되지 않은 6개의 값 넣어주기
		int[] lotto2 = new int[6];
		for(int i=0; i<lotto2.length; i++) {
			lotto2[i] = (int)(Math.random()*46);
			}
		for(int i=0; i<lotto2.length;i++) {
			if(lotto2.length == i+1)
				System.out.print(lotto2[i]+"\n");
			else
				System.out.print(lotto2[i]+", ");
		}
	}

}
