package PrimaryTest.Part_2;

public class Lozenge {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-15
	 */

	public static void main(String[] args) {
		int floor = 7;
		floor = floor%2 == 0 ? floor + 1:floor;
		for(int i = 1;i <= floor; i+= 2){
			for(int kong = floor;kong > i - 1;kong--){
				System.out.print(" ");
			}
			for(int xing = 1;xing <= i;xing++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j = 1;j <= floor - 2;j += 2){
			for(int kong1 = 1;kong1 < j + 3;kong1++){
				System.out.print(" ");
			}
			for(int xing1 = floor - 2;xing1 >= j;xing1--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
