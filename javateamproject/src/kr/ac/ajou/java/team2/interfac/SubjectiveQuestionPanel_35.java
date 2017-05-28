package kr.ac.ajou.java.team2.interfac;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SubjectiveQuestionPanel_35 extends JPanel {

	/**
	 * Create the panel.
	 */
	public SubjectiveQuestionPanel_35() {
		
		JLabel lblQuestion = new JLabel("Question 35");
		lblQuestion.setBounds(18, 20, 127, 29);
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Why are Java programs independent of system architecture?");
		lblNewLabel.setBounds(18, 55, 430, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel);
		add(lblQuestion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 98, 422, 180);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		

	}

}
