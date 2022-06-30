package com.mayur;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame3 extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	JComboBox comboBox;
	
	public MyFrame3() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		String[] animals = {"dog","cat","bird"};
				
		comboBox = new JComboBox(animals);
		//comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("pig", 0);
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
	
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		comboBox.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox)
		{
			System.out.println(comboBox.getSelectedItem());
		}
		else if(e.getSource()==pizzaButton)
		{
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton)
		{
			System.out.println("You ordered hamburgerrrr!");
		}
		else if(e.getSource()==hotdogButton)
		{
			System.out.println("You ordered hot Dog!");
		}
		
		
	}
	
}
