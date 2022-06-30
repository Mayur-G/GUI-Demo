package com.mayur;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		
		/*
		//JFrame = a GUI window to add components to
		JFrame frame = new JFrame();  //creates a new frame
		frame.setTitle("JFrame title checking"); //sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent from being resized
		frame.setVisible(true); 	//makes frame visible
		frame.setSize(420,420);  //sets the X dimension , Y dimension
		
		ImageIcon image = new ImageIcon("logo.jpg"); //create an ImageIcon
		frame.setIconImage(image.getImage());       //change icon of image
		//frame.getContentPane().setBackground(Color.green);  //change color of background
		//frame.getContentPane().setBackground(new Color(123,50,250));  //change color of background
		frame.getContentPane().setBackground(new Color(0x123456));  //change color of background
		*/
		
		MyFrame myFrame = new MyFrame();
	}

}
