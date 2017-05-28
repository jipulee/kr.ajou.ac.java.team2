package kr.ac.ajou.java.team2.interfac;

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

public class ChoiceQuestionPanel_16 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_16() {
		JLabel lblNewLabel = new JLabel("Quention 16");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Which of the following statements is true?");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		
		JButton btnNewButton = new JButton("<html>A.If assertions are compiled into a source file, <br>and if no flags are included at runtime, assertions will execute by default.</html>");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnBstringS = new JButton("B.As of Java version 1.4, assertion statements are compiled by default.");
		btnBstringS.setHorizontalAlignment(SwingConstants.LEFT);
		btnBstringS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCstringS = new JButton("<html>C.With the proper use of runtime arguments, it is possible to instruct the VM to disable assertions for a certain class,<br> and to enable assertions for a certain package, at the same time.</html>");
		btnCstringS.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnDstringS = new JButton("D.When evaluating command-line arguments, the VM gives -ea flags precedence over -da flags");
		btnDstringS.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnDstringS, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCstringS, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBstringS, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(133)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBstringS)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCstringS)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDstringS)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		setLayout(groupLayout);



	}

}
