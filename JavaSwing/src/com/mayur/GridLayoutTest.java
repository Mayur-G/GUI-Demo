package com.mayur;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {

	public static void main(String[] args) {
		
		//GridLayout = Places components in a grid of cells
					 //Each component takes all available space within its cell
					 //and each cell is the same size
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(500,500);
		//frame.setLayout(new GridLayout());
		//frame.setLayout(new GridLayout(9,1));
		//frame.setLayout(new GridLayout(3,3));
		frame.setLayout(new GridLayout(3,3,10,10));
		
//		JButton button1 = new JButton("1");
//		frame.add(button1);
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}

}
