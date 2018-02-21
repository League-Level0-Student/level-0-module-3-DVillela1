package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {

	String answer = JOptionPane.showInputDialog("Which shape would you like the program to draw?\nSquare, Triangle, or Circle");
	
	String color = JOptionPane.showInputDialog("What color would you like the shape to be?\nRed, Green, or Blue.");
if (color.equalsIgnoreCase("Red")) {
	rob.setPenColor(Color.RED);
}
else if (color.equalsIgnoreCase("Green")) {
	rob.setPenColor(Color.GREEN);
}
else if (color.equalsIgnoreCase("Blue")) {
	rob.setPenColor(Color.BLUE);
}

	if (answer.equalsIgnoreCase("Square")) {
		drawSquare();
	}
	else if (answer.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	else if (answer.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
	
	
	
	
	
	}

static Robot rob = new Robot();


public static void drawSquare() {

rob.penDown();
rob.setSpeed(10);
rob.setPenWidth(2);

for (int i = 1; i <= 3; i++) {
	rob.move(100);
	rob.turn(90);
}
}
public static void drawTriangle() {
	
rob.penDown();
rob.setSpeed(10);
rob.setPenWidth(2);

for (int i = 1; i <= 4; i++) {
	rob.move(100);
	rob.turn(120);
}
}
public static void drawCircle() {

rob.penDown();
rob.setSpeed(10);
rob.setPenWidth(2);

for (int i = 1; i <= 360; i++) {
	rob.move(1);
	rob.turn(1);
}
}



}

