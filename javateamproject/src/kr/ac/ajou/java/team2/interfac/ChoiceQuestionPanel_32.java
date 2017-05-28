package kr.ac.ajou.java.team2.interfac;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChoiceQuestionPanel_32 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_32() {
		
		JLabel lblNewLabel = new JLabel("Question 32");
		lblNewLabel.setBounds(18, 20, 127, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("What is an Object?");
		lblNewLabel_1.setBounds(18, 55, 250, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 98, 422, 180);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		add(lblNewLabel);
		add(lblNewLabel_1);
		
		

	}

}
