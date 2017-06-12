package kr.ac.ajou.java.team2.interfac.partB;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class PartBquesPanel_6 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PartBquesPanel_6() {
		
		JLabel lblNewLabel = new JLabel("Question.26");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		JLabel lblNewLabel_1 = new JLabel("<html>What is the output of this program?<br><br>1.	    class array_output {<br>2.	        public static void main(String args[]) <br>3.	        {<br>4.	       	    int array_variable [] = new int[10];<br>5.		    for (int i = 0; i < 10; ++i) {<br>6.	                array_variable[i] = i/2;<br>7.	                array_variable[i]++;<br>8.	                System.out.print(array_variable[i] + );<br>9.	                i++;<br>10.	            }<br>11.	 <br>12.	        } <br>13.	    }</html>");
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
