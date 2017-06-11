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

public class ChoiceQuestionPanel_20 extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton A,B,C,D;
	private final int questionNum = 20;
	
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
	public ChoiceQuestionPanel_20() {
		JLabel lblNewLabel = new JLabel("Quention 20");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		JTextArea txtrWhatIsThe = new JTextArea();
		txtrWhatIsThe.setText("Which of these is the method which is executed first before execution\r\n of any other thing takes place in a program?\r\n");
		
		A = new JRadioButton("\"main method\r\n\"\r\n");
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton("finalize method\r\n");
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton("static method\r\n");
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton("private method\r\n");
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(A, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(B, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(C, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(D, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrWhatIsThe, GroupLayout.PREFERRED_SIZE, 657, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrWhatIsThe, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(B, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(C, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(D, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	
	}
}
