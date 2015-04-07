package Lesson_3;

public class LooperFamily {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		/*
		 * Get start and i value to make the two loop dead.
		 *int start = Integer.MAX_VALUE - 1; 
		 *double i = Double.MAX_VALUE;
		 *for (int i = start; i <= start + 1; i++) {}  
		 *while (i == i + 1) {}
		 */
		/*
		 * Fame a i to make loop dead.
		 * double i = Double.NaN;
			while (i != i) {
			}
		 *NaN is a special double number,it's meaning not a number.It dosen't equal itself. 
		 */
		/*
		 * If you want to make this loop dead,you just need give i any String var.
			String  i = "";
			while (i != i + 0) {
		}
		*/
		//Exercise:Give i some value to make these loop turn to deadloop.
		while (i != 0) {
		    i >>>= 1;
		}
		while (i <= j && j <= i && i != j) {
		}
		while (i != 0 && i == -i) {
		}
	}

}
