package _05_ex;

public class Triangle implements InterArea{

	@Override
	public double area(int x, int y) {
		return x*y/(double)2;
	}

}
