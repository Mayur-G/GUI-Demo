package com.mayur;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelTest {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("girl.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
 		JLabel label = new JLabel();                 //create a label
 		label.setText("Bro, do you even code ");      //set text of label
 		label.setIcon(image);                      
 		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of ImageIcon
 		label.setVerticalTextPosition(JLabel.TOP);      //set text TOP,CENTER,BOTTOM of ImageIcon
 		label.setForeground(new Color(0x00FF00));       //set font color of text
 		label.setFont(new Font("MV Boli",Font.PLAIN,20));  //set font of text
 		//label.setIconTextGap(-25);                   //set gap of text to image
 		label.setBackground(Color.black);            //set background color
 		label.setOpaque(true);                      //display background color
 		label.setBorder(border);                   //sets border of label
 		label.setVerticalAlignment(JLabel.CENTER);  //set vertical possition of icon
 		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal possition of icon
 		//label.setBounds(0,0,250,250);   //set x, y position
 		
 		
 		JFrame frame = new JFrame();  
		frame.setTitle("JLabel title checking"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//frame.setSize(500,500); 
		//frame.setLayout(null);
		frame.setVisible(true); 	
		frame.add(label);
		frame.pack();
	}

}
