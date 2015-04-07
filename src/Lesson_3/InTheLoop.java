package Lesson_3;

public class InTheLoop {
	public static final int END = Integer.MAX_VALUE;  
    public static final int START = END - 100;
	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		int count = 0;  
        for (int i = START; i <= END; i++)  
            count++;  
        System.out.println(count);
        /*
         * When i = End,after i++,the value of i will be overflow equals -2147483648 < START.
         * So,this loop fall into deadloop.
         */
	}

}
