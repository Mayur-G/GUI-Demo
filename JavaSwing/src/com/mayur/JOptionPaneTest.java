package com.mayur;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneTest {

	public static void main(String[] args) {
		
		//JOptionPane = pop up of standard dialog box that prompts users for a value or informs
		//them something
		
		//JOptionPane.showMessageDialog(null, "Kindly click on ok button", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Kindly click on ok button", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Kindly click on ok button", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "You're computer has a Virus !!!", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Invalid Details", "title", JOptionPane.ERROR_MESSAGE);
		
		//int answer = JOptionPane.showConfirmDialog(null, "bro , do you even code? ","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
		//String name = JOptionPane.showInputDialog("What is your name ? ");
		//System.out.println("Hello "+name);
		
		
		String[] responses = {"No","you're awesome","OMG","LOL"};
		ImageIcon icon = new ImageIcon("face.JPG");
		JOptionPane.showOptionDialog(null, "You are Cool", "Secret Nessage",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
				icon, responses, 0);
		
	}

}
