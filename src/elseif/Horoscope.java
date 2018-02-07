package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

public static void main(String[] args) {

String answer = JOptionPane.showInputDialog(null, "What is your star sign?\nhttp://bit.ly/2gLga2Q");
	
if (answer.equalsIgnoreCase("Aries"))	{
	JOptionPane.showMessageDialog(null, "You were born from March 20th to April 20th. Aries is full of life and possesses \nhigh energy!");
}
else if (answer.equalsIgnoreCase("Taurus")) {
	JOptionPane.showMessageDialog(null, "You were born from April 20th to May 21st. Taurus is very deliberate in their actions,\nrelaxed, and enjoys all of the sensual pleasures that abound in this dimension!");
}
else if (answer.equalsIgnoreCase("Gemini")) {
	JOptionPane.showMessageDialog(null, "You were born from May 21st to June 21st. Gemini are adventurous by nature and so engange in\n traveling as often as they can as it affords them the opportunity to meet new people, experience new \nideas, and to learn new concepts.");
}
else if (answer.equalsIgnoreCase("Cancer")) {
	JOptionPane.showMessageDialog(null, "You were born from June 21st to July 23rd. Cancer people are all about home and family\n and is very dedicated and loyal to friends and family.");
}
else if (answer.equalsIgnoreCase("Leo")) {
	JOptionPane.showMessageDialog(null, "You were born from July 23rd to August 23. The Lion embodies the best characteristics\n of the leo; proud, regal, relaxed, and in charge.");
}
else if (answer.equalsIgnoreCase("Virgo")) {
	JOptionPane.showMessageDialog(null, "You were born from August 23rd to September 23rd. Virgo people are mild mannered on\n the surface, but underneath there is a flurry of activity.");
}
else if (answer.equalsIgnoreCase("Libra")) {
	JOptionPane.showMessageDialog(null, "You were born from September 23rd to October 23rd. Libra people need to keep a balance\n between work lives and recreational lives and an equal balance in their emotional\n and spiritual/physical lives.");
}
else if (answer.equalsIgnoreCase("Scorpio")) {
	JOptionPane.showMessageDialog(null, "You were born from October 23rd to November 22nd. Scorpio people are not necessarily\n aggressive on their own, unlesss they're provoked ain in general would rather be contemplative.");
}
else if (answer.equalsIgnoreCase("Sagittarius"))	{
	JOptionPane.showMessageDialog(null, "You were born from November 22nd to December 22nd. Sagittarians crave the freedon of the open \nroad, both metaphorically and pyhsically.");
}
else if (answer.equalsIgnoreCase("Capricorn")) {
	JOptionPane.showMessageDialog(null, "You were born from December 23rd to January 20th. Capricorn people are the \ntype that are goal oriented and driven to succeed despite all odds.");
}
else if (answer.equalsIgnoreCase("Aquarius")) {
	JOptionPane.showMessageDialog(null, "You were born from January 20th to Febuary 18th. Aquarians are often generous with their time and \nresources. They never meet a stranger and often will go out of their way to meet with \npeople that they've not heard from for years.");
}
else if (answer.equalsIgnoreCase("Pisces")) {
	JOptionPane.showMessageDialog(null, "You were born from Febuary 18th to March 20th. Pisces tend to be daydreamers, often \ndreaming up brilliant ideas and plans which they are unable to faciliate themselves.");
}
else {
	JOptionPane.showMessageDialog(null, "That's not a star sign!");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
