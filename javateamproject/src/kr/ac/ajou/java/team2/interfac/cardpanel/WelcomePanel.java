package kr.ac.ajou.java.team2.interfac.cardpanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;

public class WelcomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public WelcomePanel() {
		
		JLabel lblNewLabel = new JLabel("Please select a question type ");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 556, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
