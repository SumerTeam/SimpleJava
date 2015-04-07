package PrimaryTest.Part_1;

public class Swap {
	static int sum;
	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		int n = 100;
		int tSum = iSum(n);
		System.out.println(tSum);
	}
	public static int iSum(int n){
		sum += n;
		sum = n == 0 ? sum : iSum(--n);
		return sum;
	}

}
