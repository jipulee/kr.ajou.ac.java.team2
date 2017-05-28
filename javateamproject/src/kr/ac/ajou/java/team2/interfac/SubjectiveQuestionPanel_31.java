package kr.ac.ajou.java.team2.interfac;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class SubjectiveQuestionPanel_31 extends JPanel {

	/**
	 * Create the panel.
	 */
	public SubjectiveQuestionPanel_31() {
		
		JLabel lblNewLabel = new JLabel("Question 31");
		lblNewLabel.setBounds(18, 20, 127, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("What is JVM?");
		lblNewLabel_1.setBounds(18, 55, 176, 37);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 98, 422, 180);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		setLayout(null);
		add(lblNewLabel);
		add(lblNewLabel_1);
		add(scrollPane);

	}
}
