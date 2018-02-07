
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		
		String momsBirthday = "February 6th";
		String dadsBirthday = "April 15th";
		String myBirthday = "June 22nd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String bday = JOptionPane.showInputDialog("Which birthday would you like?\nDad, Mom, or Diego");
		
		// 3. Print out what the user typed
		
		System.out.println(bday);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

		if (bday.equals("Mom")) {
			System.out.println("February 6th");
		}
		else if (bday.equalsIgnoreCase("Dad")) {
			System.out.println("April 15th");
		}
		else if (bday.equalsIgnoreCase("Diego")) {
			System.out.println("June 22nd");
		}
		else {
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	} 
}
