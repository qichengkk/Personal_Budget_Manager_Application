import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class PBMA {

	private JFrame loginFrame;
	private JFrame signupFrame;
	
	private JFrame mainFrame;
	private final ButtonGroup buttonGroupEXType = new ButtonGroup();
	private JTable table;
	private DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PBMA window = new PBMA();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PBMA() {
		initialize();
	}

	/**
	 * Initialize the contents of the loginFrame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		loginFrame.setBounds(100, 100, 472, 369);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setVisible(true);
		loginFrame.getContentPane().setLayout(null);
		
		JLabel labelWelcome = new JLabel("Welcome to Personal Budget Manager Application!");
		labelWelcome.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		labelWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		labelWelcome.setBounds(6, 6, 460, 107);
		loginFrame.getContentPane().add(labelWelcome);
		
		JLabel labelName = new JLabel("User name:");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(116, 131, 83, 16);
		loginFrame.getContentPane().add(labelName);
		
		JTextField textFieldName = new JTextField();
		textFieldName.setBounds(218, 125, 134, 28);
		loginFrame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel labelPW = new JLabel("Password:");
		labelPW.setHorizontalAlignment(SwingConstants.CENTER);
		labelPW.setBounds(107, 165, 99, 16);
		loginFrame.getContentPane().add(labelPW);
		
		JPasswordField passwordFieldPW = new JPasswordField();
		passwordFieldPW.setHorizontalAlignment(SwingConstants.LEFT);
		passwordFieldPW.setBounds(218, 159, 134, 28);
		loginFrame.getContentPane().add(passwordFieldPW);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.dispose();
				openMainFrame();
				JOptionPane.showMessageDialog(null, "You are logged in!", 
						"INFORMATION", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnLogin.setBounds(238, 199, 83, 29);
		loginFrame.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(106, 240, 277, 12);
		loginFrame.getContentPane().add(separator);
		
		JLabel lblInfo = new JLabel("New User?");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBounds(116, 269, 83, 16);
		loginFrame.getContentPane().add(lblInfo);
		
		JButton btnSignup = new JButton("Sign up now");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.dispose();
				openSignupFrame();
			}
		});
		btnSignup.setBounds(218, 264, 117, 29);
		loginFrame.getContentPane().add(btnSignup);
	}
	
	private void openSignupFrame()
	{
		signupFrame = new JFrame();
		signupFrame.setBounds(100, 100, 400, 600);
		signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupFrame.setVisible(true);
		signupFrame.setTitle("Sign up");
		signupFrame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("User name:");
		labelName.setHorizontalAlignment(SwingConstants.CENTER);
		labelName.setBounds(87, 131, 84, 16);
		signupFrame.getContentPane().add(labelName);
		
		JTextField textFieldName = new JTextField();
		textFieldName.setBounds(198, 125, 134, 28);
		signupFrame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel labelPW = new JLabel("Password:");
		labelPW.setHorizontalAlignment(SwingConstants.CENTER);
		labelPW.setBounds(72, 170, 112, 16);
		signupFrame.getContentPane().add(labelPW);
		
		JPasswordField passwordFieldPW = new JPasswordField();
		passwordFieldPW.setHorizontalAlignment(SwingConstants.LEFT);
		passwordFieldPW.setBounds(198, 167, 134, 22);
		signupFrame.getContentPane().add(passwordFieldPW);
		
		JButton btnSignup = new JButton("Sign up");
		btnSignup.setBounds(146, 316, 117, 29);
		signupFrame.getContentPane().add(btnSignup);
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signupFrame.dispose();
				initialize();
				JOptionPane.showMessageDialog(null, "You have signed up! Please log in!", 
						"INFORMATION", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
	
	private void openMainFrame()
	{
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		mainFrame.setBounds(100, 100, 860, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.setTitle("Personal Budget Manager Application");
		mainFrame.getContentPane().setLayout(null);
		
		JButton btnLogout = new JButton("Log out");
		btnLogout.setBounds(762, 6, 92, 35);
		mainFrame.getContentPane().add(btnLogout);
		
		JLabel lblWelcome = new JLabel("Welcome, XXXXXX");
		lblWelcome.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblWelcome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWelcome.setBounds(421, 9, 328, 27);
		mainFrame.getContentPane().add(lblWelcome);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.DARK_GRAY);
		separator.setForeground(Color.WHITE);
		separator.setBounds(6, 41, 848, 12);
		mainFrame.getContentPane().add(separator);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setBounds(6, 52, 136, 520);
		mainFrame.getContentPane().add(panelLeft);
		
		JPanel panelTop = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTop.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelTop.setBounds(146, 52, 708, 61);
		mainFrame.getContentPane().add(panelTop);
		
		JPanel panelEXType = new JPanel();
		panelEXType.setBorder(new TitledBorder(null, "Expense Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTop.add(panelEXType);
		
		JRadioButton rdbtnAll = new JRadioButton("All");
		buttonGroupEXType.add(rdbtnAll);
		panelEXType.add(rdbtnAll);
		
		JRadioButton radioPurchase = new JRadioButton("Purchase");
		buttonGroupEXType.add(radioPurchase);
		panelEXType.add(radioPurchase);
		
		JRadioButton rdbtnBill = new JRadioButton("Bill");
		buttonGroupEXType.add(rdbtnBill);
		panelEXType.add(rdbtnBill);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTop.add(panel_1);
		
		JLabel lblView = new JLabel("View:");
		panel_1.add(lblView);
		
		JComboBox comboBoxView = new JComboBox();
		comboBoxView.setModel(new DefaultComboBoxModel(new String[] {"All", "Unpaid", "Due this week"}));
		panel_1.add(comboBoxView);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTop.add(panel_2);
		
		JButton btnAdd = new JButton("Add");
		panel_2.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		panel_2.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		panel_2.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(146, 117, 708, 411);
		mainFrame.getContentPane().add(scrollPane);
		
		
		String[] colNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		model = new DefaultTableModel(data, colNames);
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}

	
	
	
}
