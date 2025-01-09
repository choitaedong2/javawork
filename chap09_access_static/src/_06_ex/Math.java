package _06_ex;

public class Math {
	
	public int max(int... num) {
		int max=num[0];
		for(int result : num) {
//			System.out.print(result);
			if(max<= result)
				max = result;
		}
		return max;
	}
	
	public int min(int... num) {
		int min=num[0];
		for(int result : num) {
//			System.out.println(result);
			if(min>= result)
				min = result;
		}
		return min;
	}
}
