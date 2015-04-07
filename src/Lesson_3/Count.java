package Lesson_3;

public class Count {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		final int START = 2000000000; //2000000000 
        int count = 0;  
        for (float f = START; f < START + 50; f++){
        	count++;
        	System.out.println(f);
        	System.out.println(START + 50);
        }
        System.out.println(count);
	}

}
