import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
Program: BreakAplate      Date: March 14, 2022

Purpose: 
Modify the BreakAPlate application to display a picture of the prize won rather than text naming the prize.
The tiger_plush.gif, sticker.gif, and placeholder.gif are supplied as data files for this text. The placeholder.gif
file is a white square that is the same size as the tiger_plush and sticker images. The placeholder.gif file
should be displayed in the label at the start of each game. The modified BreakAPlate interface should look
similar to the following after the user has played a winning game:

Author: Morsal Nory
School: CHHS
Course: Computer Science 30

.

*/

public class BreakAplate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAplate window = new BreakAplate();
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
	public BreakAplate() {
		initialize();

	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		//displayed images when the program is ran
		ImageIcon b3 = new ImageIcon("..\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon b2 = new ImageIcon("..\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon b0 = new ImageIcon("..\\Chapter10\\src\\plates.gif");
		ImageIcon p1 = new ImageIcon("..\\Chapter10\\src\\tiger_plush.gif");
		ImageIcon p2 = new ImageIcon("..\\Chapter10\\src\\sticker.gif");
		//generates a random number between 1-3
		int ran = (int) (Math.random()*3)+1;
		
				
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plates = new JLabel("");
		plates.setBounds(10, 11, 414, 114);
		panel.add(plates);
		
		JLabel prizewon = new JLabel("");
		prizewon.setBounds(122, 176, 207, 74);
		panel.add(prizewon);
		
		//user selects the button to run the program
		JButton play = new JButton("play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eventName = e.getActionCommand();				
				
				// program runs a number which will be equivalent to the chosen image
				if( eventName.equals("play")) 
					//start the program
				{  if(ran == 1) {
					//first prize
					plates.setIcon(b3);
					prizewon.setIcon( p1);
					
				} else if (ran == 2) {
					//second prize
					plates.setIcon(b2);
					prizewon.setIcon( p2);
					
				}else if (ran == 3) {
					//last prize
					plates.setIcon(b0);
					prizewon.setText(" "  );
					
				}
				// turns the button into play again after the code is ran
				play.setText("play Again");
				play.setActionCommand("play again");
				} else if( eventName == "play again") {
					plates.setIcon(b0);
					prizewon.setText(" " );
					//turns button back into play
					play.setText("play");
					play.setActionCommand("play");

				
								
				
				}
			}
		});
		play.setBounds(160, 136, 109, 29);
		panel.add(play);
	}
		}
	

