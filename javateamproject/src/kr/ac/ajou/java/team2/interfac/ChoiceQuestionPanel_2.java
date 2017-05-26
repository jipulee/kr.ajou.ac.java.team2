package kr.ac.ajou.java.team2.interfac;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ChoiceQuestionPanel_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_2() {
		
		JLabel lblQuention = new JLabel("Quention 2");
		lblQuention.setFont(new Font("ËÎÌå", Font.PLAIN, 24));
		
		JLabel label_1 = new JLabel("Which is a valid declarations of a String?");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		
		JButton button = new JButton("A.String s1 = null;");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_1 = new JButton("B.String s2 = &#39;null&#39;;");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_2 = new JButton("C.String s3 = (String) &#39;abc&#39;;");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton button_3 = new JButton("D.String s4 = (String) &#39;\\ufeed&#39;;");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQuention, GroupLayout.PREFERRED_SIZE, 761, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblQuention, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_3)
					.addGap(39))
		);
		setLayout(groupLayout);

	}
}
