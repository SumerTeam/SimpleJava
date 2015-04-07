package Lesson_2;

import java.util.Random;

public class Rhymes {
	private static Random rnd = new Random();
	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		StringBuffer word = null;  
	      switch(rnd.nextInt(2)) {  
	          case 1:  word = new StringBuffer('P');  
	          case 2:  word = new StringBuffer('G');  
	          default: word = new StringBuffer('M');
	      }  
	      word.append('a');  
	      word.append('i');  
	      word.append('n');
	      /*
	       * question 1:rnd.nextInt(2) is in (0,1),and in swicth there just is case 1 and case 2.
	       * qusetion 2:The parameter of new StringBuffer('M') is char,it is a 16-bit unsigned number.
	       * qusetion 3:In the case,there is no break.
	       */
//	      switch(rnd.nextInt(2)) {  
//	          case 0: word = new StringBuffer("P");  
//	          case 1: word = new StringBuffer("G");  
//	          default: word = new StringBuffer("M");  
//	      }
//	      word.append('a');  
//	      word.append('i');  
//	      word.append('n');
	      System.out.println(word);
	}

}
