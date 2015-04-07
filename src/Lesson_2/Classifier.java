package Lesson_2;

public class Classifier {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {  
        System.out.println(  
             classify('n') + classify('+') + classify('2'));  
    }  
    static String classify(char ch) {  
        if ("0123456789".indexOf(ch) >= 0)  
             return "NUMERAL ";  
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)  
             return "LETTER ";  
        /* (Operators not supported yet) 
            if ("+-*/&|!=" >= 0)  
            	return "OPERATOR";  
        */  
        return "UNKNOWN";  
        //You can see the "*/" in if conditional code breaked the note.
    }
    /* 
    /* Add the numbers from 1 to n */  
    int sum = 0;  
    for (int i = 1; I <= n; i++)  
    sum += i;  
    */
    //Ok,now,you can see another example of note,it tell us that is note cannot nest.
}
