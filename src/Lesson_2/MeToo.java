package Lesson_2;

import java.io.File;

public class MeToo {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		System.out.println(File.separator);
		System.out.println(MeToo.class.getName().  
	            replaceAll("\\.", File.separator) + ".class");
		/*
		 * This is about platform trouble.In window platform, replaceAll("\\.", File.separator) is equal with
		 * replaceAll("\\.", "\\").
		 */
	}

}
