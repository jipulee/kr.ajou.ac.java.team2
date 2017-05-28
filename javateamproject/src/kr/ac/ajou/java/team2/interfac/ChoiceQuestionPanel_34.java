package kr.ac.ajou.java.team2.interfac;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChoiceQuestionPanel_34 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_34() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Question 34");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(18, 20, 127, 29);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("What type of variables can a class consist of?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(18, 55, 422, 37);
		add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 98, 422, 180);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

}
