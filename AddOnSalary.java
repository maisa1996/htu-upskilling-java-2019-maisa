package hr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddOnSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddOnSalary frame = new AddOnSalary();
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
	public AddOnSalary() {
		setTitle("Add On salary\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(40, 52, 136, 20);
		contentPane.add(lblEmployeeName);
		
		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(40, 88, 136, 20);
		contentPane.add(lblBonus);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(40, 129, 136, 20);
		contentPane.add(lblDate);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setBounds(40, 175, 136, 20);
		contentPane.add(lblNote);
		
		textField = new JTextField();
		textField.setBounds(197, 49, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 85, 146, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 126, 146, 26);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(191, 186, 152, 78);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen s=new MainScreen();
				s.setVisible(true);
			}
		});
		btnSave.setBounds(89, 312, 115, 29);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen s=new MainScreen();
				s.setVisible(true);
			}
		});
		btnCancel.setBounds(276, 312, 115, 29);
		contentPane.add(btnCancel);
	}
}
