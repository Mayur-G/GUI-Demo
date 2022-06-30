package com.mayur;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame4 extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	public MyFrame4() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket.JPG");
		label = new JLabel();
		label.setBounds(0,0,150,150);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		label.setIcon(icon);
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//arrows 
		switch (e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY());
			break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
			break;
		case 39: label.setLocation(label.getX()+10, label.getY());
			break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Char : "+e.getKeyChar());
		System.out.println("Key Code : "+e.getKeyCode());
		
	}

	
}
