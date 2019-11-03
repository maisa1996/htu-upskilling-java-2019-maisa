import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 666);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnNewButton_2 = new JButton("7");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_8 = new JButton("8");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton = new JButton("9");
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("+");
		panel.add(btnNewButton_3);
		
		JButton button_2 = new JButton("=");
		panel.add(button_2);
		
		JButton btnNewButton_1 = new JButton("4");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_12 = new JButton("5");
		panel.add(btnNewButton_12);
		
		JButton button_1 = new JButton("6");
		panel.add(button_1);
		
		JButton btnNewButton_4 = new JButton("_");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("0");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		panel.add(btnNewButton_7);
		
		JButton button = new JButton("3");
		panel.add(button);
		
		JButton btnNewButton_9 = new JButton("*");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("/");
		panel.add(btnNewButton_10);
	}

}
