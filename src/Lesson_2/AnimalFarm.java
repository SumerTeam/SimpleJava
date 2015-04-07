package Lesson_2;

public class AnimalFarm {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-12
	 */

	public static void main(String[] args) {
		final String pig = "length: 10";  
        final String dog = "length: " + pig.length();  
        System.out. println("Animals are equal: "  
                            + (pig == dog)); 
        System.out. println("Animals are equal: "  
                + pig == dog);
        /*
         * When String was been given a value,they will share one copy.
         * So,we should give String a value before compile.
         * If a String plus a constant or final var,it can be optimization.
         * 	else String plus a var,contrary.
         */
	}

}
