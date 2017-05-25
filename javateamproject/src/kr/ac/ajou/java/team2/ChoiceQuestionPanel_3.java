package kr.ac.ajou.java.team2;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ChoiceQuestionPanel_3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_3() {
		
		JLabel label = new JLabel("Which is a valid declarations of a String?");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		
		JButton button = new JButton("A.String s1 = null;");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_1 = new JButton("B.String s2 = &#39;null&#39;;");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_2 = new JButton("C.String s3 = (String) &#39;abc&#39;;");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_3 = new JButton("D.String s4 = (String) &#39;\\ufeed&#39;;");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblQuention = new JLabel("Quention 3");
		lblQuention.setFont(new Font("ËÎÌå", Font.PLAIN, 24));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblQuention, GroupLayout.PREFERRED_SIZE, 723, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblQuention, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addComponent(button)
					.addGap(12)
					.addComponent(button_1)
					.addGap(12)
					.addComponent(button_2)
					.addGap(12)
					.addComponent(button_3)
					.addGap(10))
		);
		setLayout(groupLayout);

	}

}
