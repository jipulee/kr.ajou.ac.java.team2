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

public class ChoiceQuestionPanel_17 extends JPanel {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton A,B,C,D;
	private final int questionNum = 17;
	
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
	public ChoiceQuestionPanel_17() {
		JLabel lblNewLabel_1 = new JLabel("Question 17");
		Image img = new ImageIcon("q17.jpg").getImage();
		
		JTextArea txtrwhatIsThe = new JTextArea();
		txtrwhatIsThe.setText("\"What is the output of this program?\r\n\r\n1.\t    class array_output {\r\n2.\t        public static void main(String args[]) \r\n3.\t        {\r\n4.\t            int array_variable [] = new int[10];\r\n5.\t\t    for (int i = 0; i < 10; ++i) {\r\n6.\t                array_variable[i] = i;\r\n7.\t                System.out.print(array_variable[i] + \"\" \"\");\r\n8.\t                i++;\r\n9.\t            }\r\n10.\t        } \r\n11.\t    }\r\n\"\r\n");
		
		A = new JRadioButton("\"0 2 4 6 8\r\n\"\r\n");
		buttonGroup.add(A);
		A.setFont(new Font("宋体", Font.PLAIN, 16));
		
		B = new JRadioButton("1 3 5 7 9\r\n");
		buttonGroup.add(B);
		B.setFont(new Font("宋体", Font.PLAIN, 16));
		
		C = new JRadioButton("0 1 2 3 4 5 6 7 8 9\r\n");
		buttonGroup.add(C);
		C.setFont(new Font("宋体", Font.PLAIN, 16));
		
		D = new JRadioButton("1 2 3 4 5 6 7 8 9 10\r\n");
		buttonGroup.add(D);
		D.setFont(new Font("宋体", Font.PLAIN, 16));

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrwhatIsThe, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
						.addComponent(A, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(B, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(C, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(D, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
					.addContainerGap(231, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtrwhatIsThe, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(A, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(B, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(C, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(D, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		

	}

}
