package Lesson_3;

public class Shifty {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		int i = 0;  
        //-1 move left i bit.
//		System.out.println(-1 << 1);
//		System.out.println(-1 << 33);
        while (-1 << i != 0)  
            i++;  
        System.out.println(i);
        /*
         * Predetermined,the shift actually is the remainder of times of shift and 32.
         * once and 33 times shift will get the same results.By anther way,type of long is the remainder of 64.
         */
	}

}
