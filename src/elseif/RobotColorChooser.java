
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot rob = new Robot();
		String color = "";
		for (int f = 1; color != null; f++) {
			color = JOptionPane.showInputDialog(
					"What color would you like the robot to draw?\nColors Available:\nRed, Orange, Yellow, Green, Blue or Pink.\n\nA random color will be selected if you do not input a color.");
			if (color == null) {
				break;
			}
			if (color.equalsIgnoreCase("Red")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.red);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else if (color.equalsIgnoreCase("Orange")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.orange);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else if (color.equalsIgnoreCase("Yellow")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.yellow);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else if (color.equalsIgnoreCase("Green")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.green);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else if (color.equalsIgnoreCase("Blue")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.blue);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else if (color.equalsIgnoreCase("Pink")) {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setPenColor(Color.pink);
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			} else {
				rob.setSpeed(10);
				rob.penDown();
				rob.setPenWidth(10);
				rob.setRandomPenColor();
				for (int i = 0; i <= 3; i++) {
					rob.move(100);
					rob.turn(90);
				}
			}
		}
		// 3. ask the user what color they would like the robot to draw

		// 4. use an if/else statement to set the pen color that the user requested

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 2. set the pen width to 10

		// 1. make the robot draw a shape (this will take more than one line of code)

	}
}
