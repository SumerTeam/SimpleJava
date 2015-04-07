package Lesson_1;

import java.math.BigDecimal;

public class Change {

	/**
	 * @Description This chapter want test a question about change.
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		// Let's get the first result.we will get the number 0.8999999999999999.
		System.out.println(2.00 - 1.10);
		//The trouble is that binary cannot represent the float.So we should do like
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		/*
		 * By this example,we learn when we calculate money we should use the var 
		 * int,long and BigDecimal. 
		 */
	}

}
