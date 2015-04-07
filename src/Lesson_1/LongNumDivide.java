package Lesson_1;

public class LongNumDivide {

	/**
	 * @Description This chapter is introduce var long and var int.
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		// Please get the result without the calculate.
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		/*
		 * Maybe we will get the result 1000 immediately,but this is wrong result.
		 * Because the int num can overflow when the num become long num.
		 */
	}

}
