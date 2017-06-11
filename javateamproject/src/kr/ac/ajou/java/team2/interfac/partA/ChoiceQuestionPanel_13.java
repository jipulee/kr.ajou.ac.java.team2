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

public class ChoiceQuestionPanel_13 extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton A,B,C,D;
	private final int questionNum = 13;
	
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
	public ChoiceQuestionPanel_13() {
		JLabel lblNewLabel_1 = new JLabel("Question 13");
		Image img = new ImageIcon("q13.jpg").getImage();
		
		JTextArea txtrwhichOfThe = new JTextArea();
		txtrwhichOfThe.setText("\"Which of the following are legal lines of Java code?\r\n\r\n1. int w = (int)888.8;\r\n2. byte x = (byte)100L;\r\n3. long y = (byte)100;\r\n4. byte z = (byte)100L;\"\r\n");
		
		A = new JRadioButton("\"1 and 2\"");
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		buttonGroup.add(A);
		
		B = new JRadioButton("2 and 3");
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		buttonGroup.add(B);
		
		C = new JRadioButton("3 and 4");
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		buttonGroup.add(C);
		
		D = new JRadioButton("All statements are correct.\r\n");
		D.setFont(new Font("宋体", Font.PLAIN, 16));
		buttonGroup.add(D);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(txtrwhichOfThe, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(311, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(D)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(C, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(B, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(A, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(559)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrwhichOfThe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(B)
					.addGap(18)
					.addComponent(C)
					.addGap(18)
					.addComponent(D)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		

	}
}
