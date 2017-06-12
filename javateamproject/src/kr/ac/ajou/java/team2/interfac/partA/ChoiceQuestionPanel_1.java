package kr.ac.ajou.java.team2.interfac.partA;

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

public class ChoiceQuestionPanel_1 extends JPanel {


	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final int questionNum = 11;
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

	public ChoiceQuestionPanel_1() {
		JLabel lblNewLabel_1 = new JLabel("Question 1");
		
		JLabel lblNewLabel_2 = new JLabel("Which one is a valid declaration of a boolean?");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
//		Image img = new ImageIcon("q11.jpg").getImage();
		
		A = new JRadioButton("boolean b1 = 1;");
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton("boolean b2 = ‘false’;");
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton("boolean b3 = false;");
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton("boolean b4 = ‘true’");
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(61)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(B)
								.addComponent(A)
								.addComponent(C)
								.addComponent(D))))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(72)
					.addComponent(A)
					.addGap(31)
					.addComponent(B)
					.addGap(33)
					.addComponent(C)
					.addGap(30)
					.addComponent(D)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}