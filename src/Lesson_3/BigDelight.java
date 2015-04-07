package Lesson_3;

public class BigDelight {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {  
            if (b == 0x90)  
                System.out.print("Joy!");  
            /*
             * The num 0x90 is integer more than type of byte.When byte compared with int,the byte num should turn to
             * int.
             */
       }
	}

}
