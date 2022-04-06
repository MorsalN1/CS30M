import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
Program: SemesterAvg      Date: March 14, 2022

Purpose: 
SemesterAvg application prompts the user to enter three test 
grades and then displays the average of the grades when Average is clicked:

Author: Morsal Nory
School: CHHS
Course: Computer Science 30
*/

public class SemesterAvg {

	private JFrame frame;
	private JTextField Fp;
	private JTextField sp;
	private JTextField tp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
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
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FG = new JLabel("Enter the First Grade");
		FG.setBounds(26, 22, 105, 30);
		panel.add(FG);
		
		JLabel SG = new JLabel("Enter the Second Grade");
		SG.setBounds(26, 76, 141, 30);
		panel.add(SG);
		
		JLabel TG = new JLabel("Enter the Third Grade");
		TG.setBounds(26, 136, 105, 30);
		panel.add(TG);
		
		Fp = new JTextField();
		Fp.setBounds(271, 20, 98, 35);
		panel.add(Fp);
		Fp.setColumns(10);
		
		sp = new JTextField();
		sp.setBounds(271, 84, 98, 35);
		sp.setColumns(10);
		panel.add(sp);
		
		tp = new JTextField();
		tp.setBounds(271, 141, 98, 35);
		tp.setColumns(10);
		panel.add(tp);
		
		//where the average grade of the user will be shown 
		JLabel average = new JLabel("");
		average.setBounds(210, 206, 128, 44);
		panel.add(average);
		
		//user selects the submit button to start the program to find their average
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double avgGrade;
				
				//users input
				String f =Fp.getText();
				String s =sp.getText();
				String t =tp.getText();
				
				//calculated average of the users input
				avgGrade = (Double.parseDouble(t)+Double.parseDouble(s)+Double.parseDouble(f))/3;
				average.setText(Double.toString(avgGrade));
				
				
			}
		});
		submit.setBounds(42, 206, 125, 30);
		panel.add(submit);
	}
}
