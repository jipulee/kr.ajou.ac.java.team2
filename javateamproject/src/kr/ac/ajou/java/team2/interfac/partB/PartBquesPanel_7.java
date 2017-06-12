package kr.ac.ajou.java.team2.interfac.partB;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class PartBquesPanel_7 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PartBquesPanel_7() {
		
		JLabel lblNewLabel = new JLabel("Question.27");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		JLabel lblNewLabel_1 = new JLabel("<html>How many objects are created by the following code?<br><br>Object a, b, c, d, e;<br>e = new Object ();<br>b = a = e;<br>e = new Object ();</html>");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(98)
					.addComponent(lblNewLabel_1)
					.addGap(52)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
