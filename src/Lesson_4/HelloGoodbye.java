package Lesson_4;

public class HelloGoodbye {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-14
	 */

	public static void main(String[] args) {
		try {  
            System.out.println("Hello world");  
            System.exit(0);  
        } finally {  
            System.out.println("Goodbye world");  
        }
        /*
         * The priority of exit(0) is higher than finally. 
         */
	}

}
