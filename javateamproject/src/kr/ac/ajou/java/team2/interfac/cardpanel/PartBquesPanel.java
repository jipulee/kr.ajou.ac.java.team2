package kr.ac.ajou.java.team2.interfac.cardpanel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import kr.ac.ajou.java.team2.action.ChoiceQuestionAction;
import kr.ac.ajou.java.team2.action.PartBQuestionAction;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PartBquesPanel extends JPanel {
	private JTextField textField;
	
	PartBQuestionAction pbqa = new PartBQuestionAction(); 
	JTextArea txtrHelloHello;
	JLabel lblNewLabel;
	
	int questionNum = 1;
	private JButton next;
	
	boolean partBUserAnswers[] = new boolean[10];
	
	
	public boolean[] getUserAnswers(){
		return partBUserAnswers;
	}
	
	
	public void setNextQuestion(){
		if(questionNum<10){
		questionNum+=1;
		txtrHelloHello.setText(pbqa.putQuestion(questionNum));
		lblNewLabel.setText("Question"+" "+questionNum);
		}else if(questionNum==10){
			next.setEnabled(false);
			
		}
	}
	

	/**
	 * Create the panel.
	 */
	public PartBquesPanel() {
		
		lblNewLabel = new JLabel("Question.21");
		
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtrHelloHello = new JTextArea();
		txtrHelloHello.setText(pbqa.putQuestion(questionNum));
		
		next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userAnswer = textField.getText();
				partBUserAnswers[questionNum-1] = pbqa.checkAnswer(questionNum, userAnswer);
				System.out.println(partBUserAnswers[questionNum-1]+" "+textField.getText());
				setNextQuestion();
				textField.setText("");
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrHelloHello, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(66, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(501, Short.MAX_VALUE)
					.addComponent(next, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(39)
					.addComponent(txtrHelloHello, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(next)
					.addGap(35))
		);
		setLayout(groupLayout);

	}
}
