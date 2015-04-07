package Lesson_4;

public class Indecisive {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-14
	 */

	public static void main(String[] args) {
		System.out.println(decision());
	}
	static boolean decision() {  
        try {  
            return true;  
        } finally {  
            return false;  
        }  
    }
	/*
	 * If in statement try-catch,there is a return statement,JVM will return it to a prepared posotion.
	 * But if in finally,there is a return too,the finally return will be covered the prevous.
	 */
}
