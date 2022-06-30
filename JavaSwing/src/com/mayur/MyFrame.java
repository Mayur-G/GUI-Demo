package com.mayur;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		this.setTitle("Jthis title checking"); //sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); //prevent from being resized
		this.setVisible(true); 	//makes this visible
		this.setSize(420,420);  //sets the X dimension , Y dimension
		
		ImageIcon image = new ImageIcon("logo.jpg"); //create an ImageIcon
		this.setIconImage(image.getImage());       //change icon of image
		//this.getContentPane().setBackground(Color.green);  //change color of background
		//this.getContentPane().setBackground(new Color(123,50,250));  //change color of background
		this.getContentPane().setBackground(new Color(0x123456));  //change color of background
	}
}
