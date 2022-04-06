import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

/*
Program: MetricConversion      Date: March 14, 2022

Purpose: 
Create a MetricConversion application that allows the user to select a type of conversion from a combo box
and then the corresponding formula is displayed in a label. To convert from the length measurement inches
to centimeters, the formula is 1 inch = 2.54 centimeters. The formula 1 foot = 0.3048 meters converts the distance measurement feet to meters. The volume measurement gallon is converted to liters with the fomula
1 gallon = 4.5461 liters. The formula 1 pound = 0.4536 kilograms converts the mass measurement pound to
kilograms. The application interface should look similar to the following after the user has selected feet to 
meters:

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Title = new JLabel("Select a Conversion Type");
		Title.setBounds(125, 37, 148, 14);
		panel.add(Title);
		
		JLabel output = new JLabel("");
		output.setBounds(80, 200, 181, 31);
		panel.add(output);
		
		
		JComboBox comboBox = new JComboBox();
		//choices of conversions that user can choose
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		comboBox.setBounds(80, 75, 230, 22);
		panel.add(comboBox);
		
		//user submits to start the program
	JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String out = " ";
				
				// user conversion choice and results
				if(comboBox.getSelectedItem().equals("Inches to Centimeters"))
				{
					out = "1in = 2.54cm";
				}
				else if(comboBox.getSelectedItem().equals("Feet to Meters"))
				{
					out = "1ft = 0.3048m";
				}
				else if(comboBox.getSelectedItem().equals("Gallons to Liters"))
				{
					out = "1 gallon = 4.5461 liters";
				}
				else 
				{
					out = "1 pound = 0.4536 kg";
				}
				
				
				//output after user decides on a conversion
				output.setText(out);

				
				
			}
		});
		Submit.setBounds(320, 70, 89, 32);
		panel.add(Submit);
	}
}
