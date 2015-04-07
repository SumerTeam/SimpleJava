package Lesson_3;

public class Increment {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-13
	 */

	public static void main(String[] args) {
		int j = 0;  
        for (int i = 0; i < 100; i++)  
              j = j++;  
        System.out.println(j);
        //In the expression j = j++;First,copy = j,j = j + 1,j = copy.So,the result of j is 0.
	}

}
