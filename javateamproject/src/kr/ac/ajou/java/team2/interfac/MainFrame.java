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
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.previous(cardPanel);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.next(cardPanel);
			}
		});
		
		JButton btnNewButton_3 = new JButton("Submit");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 723, GroupLayout.PREFERRED_SIZE)
						.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addContainerGap(624, Short.MAX_VALUE)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
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
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
		);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, ONE);
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button = new JButton("2");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWO);
			}
		});
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_1 = new JButton("3");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, THREE);
			}
		});
		button_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_2 = new JButton("4");
		button_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_3 = new JButton("5");
		button_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_4 = new JButton("6");
		button_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_5 = new JButton("7");
		button_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_6 = new JButton("8");
		button_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_7 = new JButton("9");
		button_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_8 = new JButton("10");
		button_8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_9 = new JButton("11");
		button_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_10 = new JButton("12");
		button_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_11 = new JButton("13");
		button_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_12 = new JButton("14");
		button_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_13 = new JButton("15");
		button_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_14 = new JButton("16");
		button_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_15 = new JButton("17");
		button_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_16 = new JButton("18");
		button_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_17 = new JButton("19");
		button_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_18 = new JButton("20");
		button_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_19 = new JButton("21");
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CardLayout cl = (CardLayout) (cardPanel.getLayout());
				cl.show(cardPanel, TWENTYONE);
			}
		});
		button_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
		JButton button_20 = new JButton("22");
		button_20.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			CardLayout cl = (CardLayout) (cardPanel.getLayout());
			cl.show(cardPanel, TWENTYTWO);
		}
	});
		button_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 8));
		
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
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
