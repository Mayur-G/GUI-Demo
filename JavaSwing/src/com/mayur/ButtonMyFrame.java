package com.mayur;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonMyFrame extends JFrame implements ActionListener{
	JLabel label;
	JButton button;
	
	public ButtonMyFrame() {
		
		ImageIcon icon = new ImageIcon("point.jpg");
		ImageIcon icon2 = new ImageIcon("face.JPG");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(this);
		button.setText("Click Here");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(500,500); 
		this.setLayout(null);
		this.setVisible(true); 	
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button)
		{
			System.out.println("SUCCESS");
			label.setVisible(true);
		}
		
	}
}
