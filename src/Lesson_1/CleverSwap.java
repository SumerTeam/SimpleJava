package Lesson_1;

public class CleverSwap {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		int x = 1984;//(0x7c0)
		int y = 2001;//(0x7d1)
		x^= y^= x^ y;
		System.out.println("x = " + x +"; y = "+y);
		//Calculation: x^ = y;y^ = x;x^ = y;
	}

}
