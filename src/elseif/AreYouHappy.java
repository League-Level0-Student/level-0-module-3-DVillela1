package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("Are you happy?");

if (answer.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	System.exit(0);
}

else if (answer.equalsIgnoreCase("No")) {
	String noanswer = JOptionPane.showInputDialog("Do you want to be happy?");
	
	if (noanswer.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	System.exit(0);
	}
	
	else if (noanswer.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
		System.exit(0);
	}
}
}




	
	
}
