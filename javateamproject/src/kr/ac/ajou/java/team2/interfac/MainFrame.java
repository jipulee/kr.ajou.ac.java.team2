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
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_1;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_10;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_11;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_12;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_13;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_14;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_15;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_16;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_17;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_18;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_19;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_2;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_20;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_3;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_4;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_5;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_6;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_7;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_8;
import kr.ac.ajou.java.team2.interfac.partA.ChoiceQuestionPanel_9;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_1;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_10;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_2;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_3;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_4;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_5;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_6;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_7;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_8;
import kr.ac.ajou.java.team2.interfac.partB.PartBquesPanel_9;
import kr.ac.ajou.java.team2.interfac.partC.SubjectiveQuestionPanel_31;
import kr.ac.ajou.java.team2.interfac.partC.SubjectiveQuestionPanel_32;
import kr.ac.ajou.java.team2.interfac.partC.SubjectiveQuestionPanel_33;
import kr.ac.ajou.java.team2.interfac.partC.SubjectiveQuestionPanel_34;
import kr.ac.ajou.java.team2.interfac.partC.SubjectiveQuestionPanel_35;

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
	private ChoiceQuestionPanel_1 cqp_1;
	private ChoiceQuestionPanel_2 cqp_2;
	private ChoiceQuestionPanel_3 cqp_3;
	private ChoiceQuestionPanel_4 cqp_4;
	private ChoiceQuestionPanel_5 cqp_5;
	private ChoiceQuestionPanel_6 cqp_6;
	private ChoiceQuestionPanel_7 cqp_7;
	private ChoiceQuestionPanel_8 cqp_8;
	private ChoiceQuestionPanel_9 cqp_9;
	private ChoiceQuestionPanel_10 cqp_10;
	private ChoiceQuestionPanel_11 cqp_11;
	private ChoiceQuestionPanel_12 cqp_12;
	private ChoiceQuestionPanel_13 cqp_13;
	private ChoiceQuestionPanel_14 cqp_14;
	private ChoiceQuestionPanel_15 cqp_15;
	private ChoiceQuestionPanel_16 cqp_16;
	private ChoiceQuestionPanel_17 cqp_17;
	private ChoiceQuestionPanel_18 cqp_18;
	private ChoiceQuestionPanel_19 cqp_19;
	private ChoiceQuestionPanel_20 cqp_20;
	

	
	private PartBquesPanel_1 pbq_1;
	private PartBquesPanel_2 pbq_2;
	private PartBquesPanel_3 pbq_3;
	private PartBquesPanel_4 pbq_4;
	private PartBquesPanel_5 pbq_5;
	private PartBquesPanel_6 pbq_6;
	private PartBquesPanel_7 pbq_7;
	private PartBquesPanel_8 pbq_8;
	private PartBquesPanel_9 pbq_9;
	private PartBquesPanel_10 pbq_10;
	

	private SubjectiveQuestionPanel_31 sqp_31;
	private SubjectiveQuestionPanel_32 sqp_32;
	private SubjectiveQuestionPanel_33 sqp_33;
	private SubjectiveQuestionPanel_34 sqp_34;
	private SubjectiveQuestionPanel_35 sqp_35;
	
	public static final String ONE = "one";
	public static final String TWO = "two";
	public static final String THREE = "three";
	public static final String FOUR = "FOUR";
	public static final String FIVE = "five";
	public static final String SIX = "six";
	public static final String SEVEN = "seven";
	public static final String EIGHT = "eight";
	public static final String NINE = "nine";
	public static final String TEN = "ten";
	public static final String ELEVEN = "eleven";
	public static final String TWELVE = "twelve";
	public static final String THIRTEEN = "thirteen";
	public static final String FOURTEEN = "fourteen";
	public static final String FIFTEEN = "fifteen";
	public static final String SIXTEEN = "sixteen";
	public static final String SEVENTEEN = "seventeen";
	public static final String EIGHTEEN = "eighteen";
	public static final String NINETEEN = "nineteen";
	public static final String TWENTY = "twenty";

	
	public static final String TWENTYONE = "twentyone";
	public static final String TWENTYTWO= "twentytwo";
	public static final String TWENTYTHREE = "twentythree";
	public static final String TWENTYFOUR = "twentyfour";
	public static final String TWENTYFIVE = "twentyfive";
	public static final String TWENTYSIX = "twentysix";
	public static final String TWENTYSEVEN = "twentyseven";
	public static final String TWENTYEIGHT = "twentyeight";
	public static final String TWENTYNINE = "twentynine";
	public static final String THIRTY= "thirty";
	
	public static final String THIRTYONE = "thirty-one";
	public static final String THIRTYTWO = "thirty-two";
	public static final String THIRTYTHREE = "thirty-three";
	public static final String THIRTYFOUR = "thirty-four";
	public static final String THIRTYFIVE = "thirty-five";
	private JButton bnt_28;
	private JButton bnt_29;
	private JButton bnt_30;
	private JButton bnt_31;
	private JButton bnt_32;
	private JButton bnt_33;
	private JButton bnt_34;
	private JButton bnt_35;
	

	/**
	 * Launch the application.
	 */
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFrame frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	 
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Java test system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 874);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Choice Question");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(new CardLayout());
		
		cqp_1 = new ChoiceQuestionPanel_1();
		cqp_2 = new ChoiceQuestionPanel_2();
		cqp_3 = new ChoiceQuestionPanel_3();
		cqp_4 = new ChoiceQuestionPanel_4();
		cqp_5 = new ChoiceQuestionPanel_5();
		cqp_6 = new ChoiceQuestionPanel_6();
		cqp_7 = new ChoiceQuestionPanel_7();
		cqp_8 = new ChoiceQuestionPanel_8();
		cqp_9 = new ChoiceQuestionPanel_9();
		cqp_10 = new ChoiceQuestionPanel_10();
		cqp_11 = new ChoiceQuestionPanel_11();
		cqp_12 = new ChoiceQuestionPanel_12();
		cqp_13 = new ChoiceQuestionPanel_13();
		cqp_14 = new ChoiceQuestionPanel_14();
		cqp_15 = new ChoiceQuestionPanel_15();
		cqp_16 = new ChoiceQuestionPanel_16();
		cqp_17 = new ChoiceQuestionPanel_17();
		cqp_18 = new ChoiceQuestionPanel_18();
		cqp_19 = new ChoiceQuestionPanel_19();
		cqp_20 = new ChoiceQuestionPanel_20();

		pbq_1 = new PartBquesPanel_1 ();
		pbq_2 = new PartBquesPanel_2 ();
		pbq_3 = new PartBquesPanel_3 ();
		pbq_4 = new PartBquesPanel_4 ();
		pbq_5 = new PartBquesPanel_5 ();
		pbq_6 = new PartBquesPanel_6 ();
		pbq_7 = new PartBquesPanel_7 ();
		pbq_8 = new PartBquesPanel_8 ();
		pbq_9 = new PartBquesPanel_9 ();
		pbq_10 = new PartBquesPanel_10 ();
		

		sqp_31= new SubjectiveQuestionPanel_31();
		sqp_32= new SubjectiveQuestionPanel_32();
		sqp_33= new SubjectiveQuestionPanel_33();
		sqp_34= new SubjectiveQuestionPanel_34();
		sqp_35= new SubjectiveQuestionPanel_35();
		
		cardPanel.add(cqp_1,ONE);
		cardPanel.add(cqp_2,TWO);
		cardPanel.add(cqp_3,THREE);
		cardPanel.add(cqp_4,FOUR);
		cardPanel.add(cqp_5,FIVE);
		cardPanel.add(cqp_6,SIX);
		cardPanel.add(cqp_7,SEVEN);
		cardPanel.add(cqp_8,EIGHT);
		cardPanel.add(cqp_9,NINE);
		cardPanel.add(cqp_10,TEN);
		cardPanel.add(cqp_11,ELEVEN);
		cardPanel.add(cqp_12,TWELVE);
		cardPanel.add(cqp_13,THIRTEEN);
		cardPanel.add(cqp_14,FOURTEEN);
		cardPanel.add(cqp_15,FIFTEEN);
		cardPanel.add(cqp_16,SIXTEEN);
		cardPanel.add(cqp_17,SEVENTEEN);
		cardPanel.add(cqp_18,EIGHTEEN);
		cardPanel.add(cqp_19,NINETEEN);
		cardPanel.add(cqp_20,TWENTY);

		
		cardPanel.add(pbq_1,TWENTYONE);
		cardPanel.add(pbq_2,TWENTYTWO);
		cardPanel.add(pbq_3,TWENTYTHREE);
		cardPanel.add(pbq_4,TWENTYFOUR);
		cardPanel.add(pbq_5,TWENTYFIVE);
		cardPanel.add(pbq_6,TWENTYSIX);
		cardPanel.add(pbq_7,TWENTYSEVEN);
		cardPanel.add(pbq_8,TWENTYEIGHT);
		cardPanel.add(pbq_9,TWENTYNINE);
		cardPanel.add(pbq_10,THIRTY);
		

		cardPanel.add(sqp_31,THIRTYONE);
		cardPanel.add(sqp_32,THIRTYTWO);
		cardPanel.add(sqp_33,THIRTYTHREE);
		cardPanel.add(sqp_34,THIRTYFOUR);
		cardPanel.add(sqp_35,THIRTYFIVE);
		
		cardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JButton btnNewButton = new JButton("Last");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.previous(cardPanel);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.next(cardPanel);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Submit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoiceQuestionAction cqa = new ChoiceQuestionAction();
				ScoreAction sc = new ScoreAction();
				boolean userAnswerTF[] = new boolean[34];
			
				try {
					userAnswerTF[cqp_1.getQuestionNum()-1] = cqa.checkAnswer(cqp_1.getQuestionNum(), cqp_1.getUserAnswer());
					userAnswerTF[cqp_2.getQuestionNum()-1] = cqa.checkAnswer(cqp_2.getQuestionNum(), cqp_2.getUserAnswer());
					userAnswerTF[cqp_3.getQuestionNum()-1] = cqa.checkAnswer(cqp_3.getQuestionNum(), cqp_3.getUserAnswer());
					userAnswerTF[cqp_4.getQuestionNum()-1] = cqa.checkAnswer(cqp_4.getQuestionNum(), cqp_4.getUserAnswer());
					userAnswerTF[cqp_5.getQuestionNum()-1] = cqa.checkAnswer(cqp_5.getQuestionNum(), cqp_5.getUserAnswer());
					userAnswerTF[cqp_6.getQuestionNum()-1] = cqa.checkAnswer(cqp_6.getQuestionNum(), cqp_6.getUserAnswer());
					userAnswerTF[cqp_7.getQuestionNum()-1] = cqa.checkAnswer(cqp_7.getQuestionNum(), cqp_7.getUserAnswer());
					userAnswerTF[cqp_8.getQuestionNum()-1] = cqa.checkAnswer(cqp_8.getQuestionNum(), cqp_8.getUserAnswer());
					userAnswerTF[cqp_9.getQuestionNum()-1] = cqa.checkAnswer(cqp_9.getQuestionNum(), cqp_9.getUserAnswer());
					userAnswerTF[cqp_10.getQuestionNum()-1] = cqa.checkAnswer(cqp_10.getQuestionNum(), cqp_10.getUserAnswer());
					userAnswerTF[cqp_11.getQuestionNum()-1] = cqa.checkAnswer(cqp_11.getQuestionNum(), cqp_11.getUserAnswer());
					userAnswerTF[cqp_12.getQuestionNum()-1] = cqa.checkAnswer(cqp_12.getQuestionNum(), cqp_12.getUserAnswer());
					userAnswerTF[cqp_13.getQuestionNum()-1] = cqa.checkAnswer(cqp_13.getQuestionNum(), cqp_13.getUserAnswer());
					userAnswerTF[cqp_14.getQuestionNum()-1] = cqa.checkAnswer(cqp_14.getQuestionNum(), cqp_14.getUserAnswer());
					userAnswerTF[cqp_15.getQuestionNum()-1] = cqa.checkAnswer(cqp_15.getQuestionNum(), cqp_15.getUserAnswer());
					userAnswerTF[cqp_16.getQuestionNum()-1] = cqa.checkAnswer(cqp_16.getQuestionNum(), cqp_16.getUserAnswer());
					userAnswerTF[cqp_17.getQuestionNum()-1] = cqa.checkAnswer(cqp_17.getQuestionNum(), cqp_17.getUserAnswer());
					userAnswerTF[cqp_18.getQuestionNum()-1] = cqa.checkAnswer(cqp_18.getQuestionNum(), cqp_18.getUserAnswer());
					userAnswerTF[cqp_19.getQuestionNum()-1] = cqa.checkAnswer(cqp_19.getQuestionNum(), cqp_19.getUserAnswer());
					userAnswerTF[cqp_20.getQuestionNum()-1] = cqa.checkAnswer(cqp_20.getQuestionNum(), cqp_20.getUserAnswer());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int score = sc.scoreCalculation(userAnswerTF);
				try {
					sc.saveScore(score);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("you score is :"+score);
				
				
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 723, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
								.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton bnt_1 = new JButton("1");
		bnt_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, ONE);
				
			}
		});
		bnt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bnt_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_2 = new JButton("2");
		bnt_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWO);
			}
		});
		bnt_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_3 = new JButton("3");
		bnt_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, THREE);
			}
		});
		bnt_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_4 = new JButton("4");
		bnt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, FOUR);
			}
		});
		bnt_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_5 = new JButton("5");
		bnt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, FIVE);
			}
		});
		bnt_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_6 = new JButton("6");
		bnt_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_7 = new JButton("7");
		bnt_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_8 = new JButton("8");
		bnt_8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_9 = new JButton("9");
		bnt_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_10 = new JButton("10");
		bnt_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_11 = new JButton("11");
		bnt_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, ELEVEN);
			}
		});
		bnt_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_12 = new JButton("12");
		bnt_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWELVE);
			}
		});
		bnt_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_13 = new JButton("13");
		bnt_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, THIRTEEN);
			}
		});
		bnt_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_14 = new JButton("14");
		bnt_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, FOURTEEN);
			}
		});
		bnt_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_15 = new JButton("15");
		bnt_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, FIFTEEN);
			}
		});
		bnt_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_16 = new JButton("16");
		bnt_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, SIXTEEN);
			}
		});
		bnt_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_17 = new JButton("17");
		bnt_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, SEVENTEEN);
			}
		});
		bnt_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_18 = new JButton("18");
		bnt_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, EIGHTEEN);
			}
		});
		bnt_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_19 = new JButton("19");
		bnt_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, NINETEEN);
			}
		});
		bnt_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_20 = new JButton("20");
		bnt_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWENTY);
			}
		});
		bnt_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_21 = new JButton("21");
		bnt_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWENTYONE);
			}
		});
		bnt_21.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_22 = new JButton("22");
		bnt_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bnt_22.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			cl.show(cardPanel, TWENTYTWO);
		}
	});
		bnt_22.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
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
		
		JButton bnt_24 = new JButton("24");
		bnt_24.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_25 = new JButton("25");
		bnt_25.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_27 = new JButton("27");
		bnt_27.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_26 = new JButton("26");
		bnt_26.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton bnt_23 = new JButton("23");
		bnt_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bnt_23.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_28 = new JButton("28");
		bnt_28.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_29 = new JButton("29");
		bnt_29.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_30 = new JButton("30");
		bnt_30.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_31 = new JButton("31");
		bnt_31.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_32 = new JButton("32");
		bnt_32.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_33 = new JButton("33");
		bnt_33.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_34 = new JButton("34");
		bnt_34.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		bnt_35 = new JButton("35");
		bnt_35.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(11)
							.addComponent(bnt_1, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_2, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_3, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_4, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_5, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_6, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_7, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_8, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_9, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_10, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_11, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(bnt_12, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bnt_13, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(bnt_14, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(bnt_15, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_16, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_17, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_18, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_19, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_20, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_21, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addGap(4))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(bnt_27, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(bnt_28, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(bnt_29, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_30, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_31, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_32, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_33, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_34, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(0)
									.addComponent(bnt_22, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_23, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_24, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_25, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bnt_26, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(bnt_35, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))))
					.addGap(5))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(bnt_11, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(bnt_10, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(bnt_14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_15, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_16, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_17, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_19, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(bnt_20, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_21, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_22, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_23, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_24, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_25, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
							.addComponent(bnt_26, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(bnt_27, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_30, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_31, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_32, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_28, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_29, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_33, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_34, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(bnt_35, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
