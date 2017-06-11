package kr.ac.ajou.java.team2.interfac.partA;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ChoiceQuestionPanel_19 extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton A,B,C,D;
	private final int questionNum = 19;
	
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
	public ChoiceQuestionPanel_19() {
		JLabel lblNewLabel = new JLabel("Quention 19");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		JTextArea txtrWhatIsThe = new JTextArea();
		txtrWhatIsThe.setText("What is the numerical range of a char data type in Java?\r\n");
		
		A = new JRadioButton("-128 to 127\r\n");
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton("0 to 256\r\n");
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton("0 to 32767\r\n");
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton("0 to 65535\r\n");
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrWhatIsThe, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
						.addComponent(A, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(B, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(C, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(D, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(239, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGap(49)
					.addComponent(txtrWhatIsThe, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(B, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(C, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(D, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	

	}

}
