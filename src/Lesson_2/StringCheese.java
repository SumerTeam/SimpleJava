package Lesson_2;

import java.io.UnsupportedEncodingException;

public class StringCheese {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 * @throws UnsupportedEncodingException 
	 */

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte bytes[] = new byte[256];  
        for (int i = 0; i < 256; i++)  
             bytes[i] = (byte)i;  
//      String str = new String(bytes,"iso-8859-1");  
        String str = new String(bytes);
        for (int i = 0, n = str.length(); i < n; i++)  
             System.out.println((int)str.charAt(i) + " "); 
        /*
         * In Java system,code was compiled by UTF-16 auto,there is lots of rule for compile.
         * And the "ISO-8859-1" is 8-bit character set.
         */
	}

}
