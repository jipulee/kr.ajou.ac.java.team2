package kr.ac.ajou.java.team2.interfac;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import kr.ac.ajou.java.team2.action.ChoiceQuestionAction;
import kr.ac.ajou.java.team2.action.ScoreAction;
import kr.ac.ajou.java.team2.interfac.cardpanel.ChoiceQuestionPanel;
import kr.ac.ajou.java.team2.interfac.cardpanel.PartBquesPanel;
import kr.ac.ajou.java.team2.interfac.cardpanel.SubjectiveQuestionPanel;
import kr.ac.ajou.java.team2.interfac.cardpanel.WelcomePanel;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;
	
	private ChoiceQuestionPanel cqp;
	private PartBquesPanel pbq;
	private WelcomePanel wp;

	
	public static final String ONE = "one";
	public static final String TWO = "two";
	public static final String THREE = "three";
	private JButton partA;
	private JButton partB;
	 
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Java test system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(new CardLayout());
		
		wp = new WelcomePanel();
		cqp= new ChoiceQuestionPanel();
		pbq = new PartBquesPanel ();

		
		
		cardPanel.add(wp,ONE);
		cardPanel.add(cqp,TWO);
		cardPanel.add(pbq,THREE);

		
		cardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		
		
		
//*********************************************************************************************************************************************************************		
		
		/*here is submit button action */
			
		JButton btnNewButton_3 = new JButton("Submit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreAction scoreAction = new ScoreAction();
				boolean[] boo = cqp.getUserAnswers();
				int score = scoreAction.scoreCalculation(1, boo);
				boolean[] boo2 = pbq.getUserAnswers();
				int score2 = scoreAction.scoreCalculation(2, boo2);
				try {
					scoreAction.saveScoreA(score);
					scoreAction.saveScoreB(score2);
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				for (int i = 0; i < boo.length; i++) {
					System.out.println(boo[i]);
				}
				
				System.out.println(score);
				System.out.println(score2);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PrintResultFrame frame = new PrintResultFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				setVisible(false);
			}
			
		});
		
		JLabel message = new JLabel("Part A is choice question");
		message.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		
		JLabel message2 = new JLabel("Part B you need fill the blank");
		message2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		
//***********************************************************************************************************************************************
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(message2, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(55))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(message)
							.addContainerGap(452, Short.MAX_VALUE))))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cardPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(message)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(message2))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
		JButton button_21 = new JButton("23");
		button_21.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_22 = new JButton("24");
		button_22.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_23 = new JButton("25");
		button_23.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_24 = new JButton("26");
		button_24.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_25 = new JButton("27");
		button_25.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_26 = new JButton("28");
		button_26.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_27 = new JButton("29");
		button_27.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_28 = new JButton("30");
		button_28.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		partA = new JButton("Part A");
		partA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cardPanel.getLayout());
				cl.show(cardPanel, TWO);
				partA.setEnabled(false);
			}
		});
		
		partB = new JButton("Part B");
		partB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cl = (CardLayout)(cardPanel.getLayout());
				cl.show(cardPanel, THREE);
				partB.setEnabled(false);
			}
		});
		

		
		
		
//************************************************************************************************************************************************
	
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(partA)
					.addGap(47)
					.addComponent(partB)
					.addContainerGap(394, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(partA)
						.addComponent(partB))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
