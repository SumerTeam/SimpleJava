package PrimaryTest.Part_2;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @Description
	 * @author Administrator
	 * @param args void
	 * 2014-3-15
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please put in a year:");
		long year;
		try{
			year = scan.nextLong();
			if(year%4 == 0&&year%100!=0||year%400==0){
				System.out.print(year + "is a leap!");
			}else{
				System.out.print(year + "isn't a leap!");
			}
		}catch(Exception e){
			System.out.print("The year you put in is volied!");
		}
	}

}
