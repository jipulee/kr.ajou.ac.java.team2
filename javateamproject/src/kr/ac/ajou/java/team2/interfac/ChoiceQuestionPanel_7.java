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

public class ChoiceQuestionPanel_7 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChoiceQuestionPanel_7() {
		JLabel lblNewLabel = new JLabel("Quention 7");
		lblNewLabel.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("Which collection class allows you to access its elements by associating a key with an element's value, and provides synchronization?");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		
		JButton btnNewButton = new JButton("A.java.util.SortedMap");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnBstringS = new JButton("B.java.util.TreeMap");
		btnBstringS.setHorizontalAlignment(SwingConstants.LEFT);
		btnBstringS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnCstringS = new JButton("C.java.util.TreeSet");
		btnCstringS.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnDstringS = new JButton("D.java.util.Hashtable");
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
