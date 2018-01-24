//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Parser;
import javax.xml.bind.ParseConversionEvent;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String cats = JOptionPane.showInputDialog("How many cats do you have?");		
		int amount = Integer.parseInt(cats);
		if (amount > 3) {
			JOptionPane.showMessageDialog(null, "You are a CRAZY cat lady!");
		}		else if (amount == 0) {
			playVideo("https://www.youtube.com/watch?v=vIXrB1vyk8g");
		}
		else {
			JOptionPane.showMessageDialog(null, "WATCH THE ENTIRE VIDEO!\nTHE POP UP IS NORMAL SINCE IT'S RELATED TO THIS PROJECT!\n(SHOWS A SCARY HOUSE AT THE END!");
			playVideo("https://www.youtube.com/watch?v=8bGsJIA97uA");
		}
		

		// 1. Ask the user how many cats they have

		// 2. Convert their answer into an int

		// 3. If they have more than 3 cats, tell them they're a crazy cat lady

		// 4. If they have 3 or less, call the method below to show them a cat video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

