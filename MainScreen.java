package hr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonAdd = new JButton("Add Employee");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEmployee addEmp=new AddEmployee();
				addEmp.setVisible(true);
			}
		});
		buttonAdd.setBounds(129, 54, 134, 57);
		contentPane.add(buttonAdd);
		
		JButton btnAddOnSalary = new JButton("add on salary");
		btnAddOnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddOnSalary salary=new AddOnSalary();
				salary.setVisible(true);
				
			}
		});
		btnAddOnSalary.setBounds(129, 159, 134, 57);
		contentPane.add(btnAddOnSalary);
		
		JButton btnAttendance = new JButton("Attendance");
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Attendance a=new Attendance();

			a.setVisible(true);
			}
		});
		btnAttendance.setBounds(129, 271, 134, 57);
		contentPane.add(btnAttendance);
		
		JButton btnDiscounts = new JButton("Show Employee list");
		btnDiscounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeList list=new EmployeeList();
				list.setVisible(true);
			}
		});
		btnDiscounts.setBounds(395, 91, 160, 57);
		contentPane.add(btnDiscounts);
		
		JButton btnDiscounts_1 = new JButton("discounts");
		btnDiscounts_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Discount d=new Discount();
				d.setVisible(true);
			}
		});
		btnDiscounts_1.setBounds(395, 207, 160, 57);
		contentPane.add(btnDiscounts_1);
	}
}
