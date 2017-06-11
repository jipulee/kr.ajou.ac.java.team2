package kr.ac.ajou.java.team2.interfac.partA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoiceQuestionPanel_4 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_4() {
		JLabel lblNewLabel_1 = new JLabel("Question 4");
		
		JLabel lblNewLabel_2 = new JLabel("<html>the static method Thread.currentThread() returns <br>a reference to the currently executing Thread object. <br>What is the result of this code?</html>");
		Image img = new ImageIcon("q4.jpg").getImage();
		JTextArea textArea = new JTextArea(){
			{setOpaque(false);}
			public void paintComponent(Graphics g){
				g.drawImage(img, 0,0,this);
				super.paintComponent(g);
			}
			
		};
		
		JButton btnNewButton = new JButton("A. Each String in the array lines will output, with a 1-second pause.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("<html>B. Each String in the array lines will output, <br>with no pause in between because this method is not executed in a Thread.</html>");
		
		JButton btnNewButton_2 = new JButton("<html>C. Each String in the array lines will output, <br>and there is no guarantee there will be a pause because currentThread() may not retrieve this thread</html>");
		
		JButton btnNewButton_3 = new JButton("D. This code will not compile ");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(lblNewLabel_2))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 491, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addContainerGap(124, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	

	}

	

}
