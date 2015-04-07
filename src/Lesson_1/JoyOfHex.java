package Lesson_1;

public class JoyOfHex {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		// Please get the result without the calculate.
		System.out.println(
				Long.toHexString(0x100000000L + 0xcafebabe));
		/*
		 * Maybe you want to make the result return to "1cafebabe",
		 * but the thing always is contrary,we just get a result like "cafebabe" 
		 * Because the num 0xcafebabe is a negetive.On Java, Hex and Octal is turn 
		 * into binary,and distinguish with the highest bit. 
		 */
	}

}
