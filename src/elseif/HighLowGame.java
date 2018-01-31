//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		// 3. Change this line to give you a random number between 1 - 100. 
		
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		
		System.out.println(random);
		
		// 11. do the following 10 times
		for (int i = 1; i <= 10; i++) {
		String answer = JOptionPane.showInputDialog("Guess my number.");	
		int guess = Integer.parseInt(answer);
					if (guess == random) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}
					else if (guess > random) {
				JOptionPane.showMessageDialog(null, "Too high!");
			}
						else if (guess < random) {
				JOptionPane.showMessageDialog(null, "Too low!");
			}		
						else if (guess < random) {
				JOptionPane.showMessageDialog(null, "Too low!");
			}		
		}	
	
			JOptionPane.showMessageDialog(null, "You lose.\n:(");
					
					
			// 1. ask the user for a guess using a pop-up window, and save their response 
		
		
		
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
			

				// 6. win
			// 7. if the guess is high
			

				// 8. tell them it's too high
			// 9. if the guess is low
			

				// 10. tell them it's too low
	
			

			

	}
	// 12. tell them they lose
}


