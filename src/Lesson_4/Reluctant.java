package Lesson_4;

public class Reluctant {
	private Reluctant internalInstance = new Reluctant();  
    public Reluctant() throws Exception {  
        throw new Exception("I'm not coming out");  
    }
	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-14
	 */

	public static void main(String[] args) {
		try {  
            Reluctant b = new Reluctant();  
            System.out.println("Surprise!");  
        } catch (Exception ex) {  
            System.out.println("I told you so");  
        }
	}
	/*
	 * In this program,private var use the constractor deadloop.
	 */

}
