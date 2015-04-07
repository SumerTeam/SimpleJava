package Lesson_4;

public class HelloGoodbye1 {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-14
	 */

	public static void main(String[] args) {
		System.out.println("Hello world");  
	       Runtime.getRuntime().addShutdownHook(  
	             new Thread() {  
	                public void run() {  
	                       System.out.println("Goodbye world");  
	                }  
	            });  
	       System.exit(0);
	}

}
