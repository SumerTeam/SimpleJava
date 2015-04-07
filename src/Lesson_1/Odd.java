package Lesson_1;

public class Odd {

	/**
	 * @Description test the result of the function is odd
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		//When a negative like -10 fill in the blank,the result will be false. 
		boolean Tag = isOdd(5);
		System.out.print(Tag);
	}
	/**
	 * 
	 * @Description This function is what to make odd better.
	 * @author Administrator
	 * @param OddTag
	 * @return boolean
	 * 2014-3-12
	 */
	public static boolean isOdd(int OddTag){
		return OddTag % 2 == 1;
		/*
		 * So the better code is : return OddTag % 2 != 0;
		 * And there is a line more effective code is: return (OddTag & 1) != 0;
		 */
	}

}
