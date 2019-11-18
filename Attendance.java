package hr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Attendance extends JFrame {

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
					Attendance frame = new Attendance();
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
	public Attendance() {
		setTitle("Attendance\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 483);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(36, 55, 143, 39);
		contentPane.add(lblEmployeeName);
		
		textField = new JTextField();
		textField.setBounds(244, 61, 163, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblArrivalTime = new JLabel("arrival time");
		lblArrivalTime.setBounds(36, 138, 117, 39);
		contentPane.add(lblArrivalTime);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 144, 163, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(36, 225, 69, 20);
		contentPane.add(lblDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(244, 222, 163, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setBounds(25, 288, 69, 20);
		contentPane.add(lblNote);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(244, 288, 163, 80);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen s=new MainScreen();
				s.setVisible(true);
			}
		});
		btnSave.setBounds(81, 384, 115, 29);
		contentPane.add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen s=new MainScreen();
				s.setVisible(true);
			}
		});
		btnBack.setBounds(265, 384, 115, 29);
		contentPane.add(btnBack);
	}
}
