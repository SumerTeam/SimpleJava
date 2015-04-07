package Lesson_2;

public class EscapeRout {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		// \u0022 是双引号的Unicode转义字符  
		System.out.println("a\u0022);
        System.out.println("a\u0022.length()+\u0022b".length()); 
        /*
         * In Java system,code begin with "/u" is unicode,the priority is higher than character.
         */
	}

}
