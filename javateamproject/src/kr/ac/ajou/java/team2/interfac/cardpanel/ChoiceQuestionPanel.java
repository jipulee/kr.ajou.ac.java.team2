package kr.ac.ajou.java.team2.interfac.cardpanel;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import kr.ac.ajou.java.team2.action.ChoiceQuestionAction;
import kr.ac.ajou.java.team2.dao.ScoreDAO;

public class ChoiceQuestionPanel extends JPanel {
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	ChoiceQuestionAction cqa = new ChoiceQuestionAction(); 
	JRadioButton A,B,C,D;
	JLabel lblNewLabel_2,lblNewLabel_1;
	private int questionNum = 1;
	private JButton previous;
	private JButton next;
	boolean partAUserAnswers[] = new boolean[20];
	
	
	public boolean[] getUserAnswers(){
		return partAUserAnswers;
	}

	
	public void setNextQuestion(){
		if(questionNum<20){
		questionNum+=1;
		lblNewLabel_2.setText(cqa.putQuestion(questionNum));
		lblNewLabel_1.setText("Question"+" "+questionNum);
		A.setText(cqa.putAnwerA(questionNum));
		B.setText(cqa.putAnswerB(questionNum));
		C.setText(cqa.putAnwerC(questionNum));
		D.setText(cqa.putAnwerD(questionNum));
		}
		
	}
	
	public void setPreviousQuestion(){
		if(questionNum>1){
		questionNum-=1;
		lblNewLabel_2.setText(cqa.putQuestion(questionNum));
		lblNewLabel_1.setText("Question"+" "+questionNum);
		A.setText(cqa.putAnwerA(questionNum));
		B.setText(cqa.putAnswerB(questionNum));
		C.setText(cqa.putAnwerC(questionNum));
		D.setText(cqa.putAnwerD(questionNum));	
		}
	}
	
	

	public String getUserAnswer(){
		//System.out.println(A.isSelected());
		if(A.isSelected()){
			
			return A.getText();
		}
		else if(B.isSelected()){
			//System.out.println(D.isSelected());
			return B.getText();
		}
		else if(C.isSelected()){
		//	System.out.println(C.isSelected());
			return C.getText();
		}
		else if(D.isSelected()){
			//System.out.println(D.isSelected());
			return D.getText();
		}else{
		return null;
		}
	}



	/**
	 * Create the panel.
	 */

	public ChoiceQuestionPanel() {
		lblNewLabel_1 = new JLabel("Question"+" "+1);
		lblNewLabel_2 = new JLabel(cqa.putQuestion(1));
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		
		A = new JRadioButton(cqa.putAnwerA(1));
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton(cqa.putAnswerB(1));
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton(cqa.putAnwerC(1));
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton(cqa.putAnwerD(1));
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));
		
		previous = new JButton("Previous");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partAUserAnswers[questionNum-1]=cqa.checkAnswer(questionNum, getUserAnswer());
				System.out.println(partAUserAnswers[questionNum-1]+getUserAnswer());
				setPreviousQuestion();
				buttonGroup.clearSelection();
				
			}
		});
		
		next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partAUserAnswers[questionNum-1]=cqa.checkAnswer(questionNum, getUserAnswer());
				System.out.println(partAUserAnswers[questionNum-1]+"  "+getUserAnswer());
				setNextQuestion();
				buttonGroup.clearSelection();
				
			}
		});

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(previous)
							.addPreferredGap(ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
							.addComponent(next, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addGap(65))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(B)
								.addComponent(A)
								.addComponent(C)
								.addComponent(D))
							.addContainerGap(82, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A)
					.addGap(31)
					.addComponent(B)
					.addGap(33)
					.addComponent(C)
					.addGap(30)
					.addComponent(D)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(previous)
						.addComponent(next))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
	

		
	
	
}