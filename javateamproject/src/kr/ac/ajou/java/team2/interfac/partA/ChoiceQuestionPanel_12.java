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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ChoiceQuestionPanel_12 extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final int questionNum = 12;
	JRadioButton A,B,C,D;
	
	public int getQuestionNum() {
		return questionNum;
	}

	public String getUserAnswer(){
		
		if(A.isSelected())
			return A.getText();
			
		else if(B.isSelected())
			return B.getText();
		
		else if(C.isSelected())
			return C.getText();
		
		else
			return D.getText();
	}
	
	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_12() {
		JLabel lblNewLabel_1 = new JLabel("Question 12");
		Image img = new ImageIcon("q12.jpg").getImage();
		
		A = new JRadioButton("Integer\r\n\r\n");
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton("float");
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton("double");
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton("Integer or Boolean\r\n");
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JTextArea txtrWhichOfThese = new JTextArea();
		txtrWhichOfThese.setText("Which of these can be returned by the operator & ?\r\n");

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(A, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(B, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(C, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(D, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrWhichOfThese, GroupLayout.PREFERRED_SIZE, 657, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(144, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrWhichOfThese, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(B, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(C, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(D, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	


	}
}
