package kr.ac.ajou.java.team2.interfac.partB;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class PartBquesPanel_2 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PartBquesPanel_2() {
	
		
		JLabel lblNewLabel = new JLabel("Question.22");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("<html>What is the output of this program?<br>1.	    class evaluate {<br>2.	        public static void main(String args[]) <br>3.	        {<br>4.	            int a[] = {1,2,3,4,5};<br>5.		    int d[] = a;<br>6.		    int sum = 0;<br>7.		    for (int j = 0; j < 3; ++j)<br>8.	                sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);<br>9.		  System.out.println(sum);<br>10.	        } <br>11.	    }</html>");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
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
