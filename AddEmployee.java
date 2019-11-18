package hr;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddEmployee() {
		setTitle("Add Employee\r\n");
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new TitledBorder(null, "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(15, 73, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblPersonalPicture = new JLabel("personal picture");
		lblPersonalPicture.setBounds(15, 124, 113, 35);
		contentPane.add(lblPersonalPicture);
		
		JLabel lblIdentityCard = new JLabel("Identity Card");
		lblIdentityCard.setBounds(15, 185, 113, 20);
		contentPane.add(lblIdentityCard);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(15, 238, 69, 20);
		contentPane.add(lblGender);
		
		JLabel lblMaritalStatus = new JLabel("marital status ");
		lblMaritalStatus.setBounds(15, 302, 113, 20);
		contentPane.add(lblMaritalStatus);
		
		textField = new JTextField();
		textField.setBounds(151, 70, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCho = new JLabel("OpenFile");
		lblCho.setBounds(194, 131, 69, 20);
		contentPane.add(lblCho);
		
		textField_1 = new JTextField();
		textField_1.setBounds(143, 182, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("female");
		rdbtnNewRadioButton.setBounds(115, 238, 155, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(296, 238, 155, 29);
		contentPane.add(rdbtnMale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"single", "married"}));
		comboBox.setBounds(132, 299, 92, 26);
		contentPane.add(comboBox);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen s=new MainScreen();
				s.setVisible(true);	
			
			}
		});
		btnSave.setBounds(244, 408, 115, 29);
		contentPane.add(btnSave);
		
		JButton btnClose = new JButton("Back");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen s=new MainScreen();
				s.setVisible(true);
			}
		});
		btnClose.setBounds(437, 408, 115, 29);
		contentPane.add(btnClose);
	}
}
