import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
Program: Divisibleby3practise      Date: March 14, 2022

Purpose: 
Create a DivisibleBy3 application that prompts the user for an integer and then displays a message when 
Check is clicked indicating whether the number is divisible by 3. The application interface should look similar 
to the following after the user has typed a number and clicked Check:



Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Divisibleby3practise {

	private JFrame frame;
	private JTextField Userint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divisibleby3practise window = new Divisibleby3practise();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Divisibleby3practise() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 11, 434, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterAnInteger = new JLabel("Enter an Integer");
		lblEnterAnInteger.setBounds(10, 11, 114, 49);
		panel.add(lblEnterAnInteger);
		
		Userint = new JTextField();
		Userint.setBounds(216, 31, 123, 41);
		panel.add(Userint);
		Userint.setColumns(10);
		
		
		JLabel output = new JLabel("");
		output.setBounds(165, 180, 220, 35);
		panel.add(output);
		
		//user selects button to run the program
		JButton check = new JButton("check");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// user inputs a number of their choice
				String x = Userint.getText();
				
				//determines if the given number is divisible by 3
				double y = (Double.parseDouble(x))%3;
				
				//if number is divisible 
				if(y==0)
					output.setText("number is divisible by 3");   				
				else
				{
					output.setText("number is not divisible by 3");
				}
				 

				
				
				
			}
		});
		check.setBounds(10, 180, 116, 48);
		panel.add(check);
	}
}
