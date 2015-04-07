package Lesson_2;

public class Me {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		System.out.println(  
	             Me.class.getName().  
	                replaceAll(".","/") + ".class"); 
		//String.replaceAll() accept a regex for it first parameter,and the "." can match all of the characters.
		System.out.println(  
	            Me.class.getName().replaceAll("\\.","/") + ".class");
	}

}
