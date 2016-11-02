import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class ifAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**

		 *

		 * Name: Jack Fendley

		 * Teacher: Mr. Hardman

		 * Assignment #3 Program #Bonus1

		 * Date Last Modified:October 27th,2016

		 *
		 */
		
		Scanner userInput = new Scanner(System.in);
		String userName;
		int userAge;
		
		System.out.println("Guessing Game");
		
		System.out.print("What yo name homie? ");
		userName = userInput.nextLine();
		
		System.out.println("Yo " + userName + "? Dat name fresh! How old are you " + userName + "?");
		userAge = userInput.nextInt();
		
		if (userAge <= 15) {
			System.out.println("You cant drive you fool!");
		
		} else if (userAge >=16)
		if (userAge <=17) {
			System.out.println("You're " + userAge + "? You can drive, but you cant vote");
		
		} else if (userAge >=18 ) 
		if (userAge <=24) {
			System.out.print("You can vote but can't rent a car");
		
		} else if (userAge >=24 ){
			System.out.println("You can do almost anything ma dude! Why you talking to a computer?");
		}
		
		
		
		
		
		
	}

}
