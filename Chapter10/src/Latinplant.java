import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
Program: Latinplant      Date: March 14, 2022

Purpose: 
The LatinPlantNames application allows the user to select a plant
name from a combo box:

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class Latinplant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latinplant window = new Latinplant();
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
	public Latinplant() {
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
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(-10, 0, 434, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel select = new JLabel("Select a plant name");
		select.setForeground(new Color(204, 204, 255));
		select.setBounds(119, 42, 191, 27);
		select.setFont(new Font("Lucida Calligraphy", Font.BOLD, 14));
		panel.add(select);
		

		JLabel output = new JLabel("");
		output.setBounds(134, 205, 210, 34);
		output.setBackground(Color.ORANGE);
		output.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
		panel.add(output);
		
		//user chooses the plant name to start the program
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plant = " ";
				
				//user plant choice and the Latin names
				if(comboBox.getSelectedItem().equals("Basil"))
				{
					plant = "Ocimum";
				}
				else if(comboBox.getSelectedItem().equals("Lavender"))
				{
					plant = "Lavandula spica";
				}
				else if(comboBox.getSelectedItem().equals("Parsley"))
				{
					plant = "Apium";
				}
				else if(comboBox.getSelectedItem().equals("Peppermint"))
				{
					plant = "Mentha piperita";
				}
				else if(comboBox.getSelectedItem().equals("Saffron"))
				{
					plant = "Crocus";
				}
				else 
				{
					plant = "Salvia";
				}
				
				
				//outputs the latin name after user choice
				output.setText(plant);		
				
				
			}
		});
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Georgia", Font.PLAIN, 15));
		comboBox.setBounds(80, 82, 264, 27);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Basil", "Lavender", "Parsley", "Peppermint", "Saffron", "Sage"}));
		panel.add(comboBox);
		
	/*	JButton select_1 = new JButton("select");
		select_1.setBackground(new Color(204, 255, 102));
		select_1.setFont(new Font("Georgia", Font.PLAIN, 14));
		select_1.setBounds(151, 132, 89, 23);
		select_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String plant = " ";
				
				
				if(comboBox.getSelectedItem().equals("Basil"))
				{
					plant = "Ocimum";
				}
				else if(comboBox.getSelectedItem().equals("Lavender"))
				{
					plant = "Lavandula spica";
				}
				else if(comboBox.getSelectedItem().equals("Parsley"))
				{
					plant = "Apium";
				}
				else if(comboBox.getSelectedItem().equals("Peppermint"))
				{
					plant = "Mentha piperita";
				}
				else if(comboBox.getSelectedItem().equals("Saffron"))
				{
					plant = "Crocus";
				}
				else 
				{
					plant = "Salvia";
				}
				
				
				
				output.setText(plant);		
				
				
				
			}
		});
		panel.add(select_1);  */
		
		
		
		
	
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
