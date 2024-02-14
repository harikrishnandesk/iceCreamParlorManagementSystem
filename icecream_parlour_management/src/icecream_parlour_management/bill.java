package icecream_parlour_management;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class bill {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 866, 596);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(6, 6, 854, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing\n");
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 25));
		lblNewLabel.setBounds(383, 6, 263, 36);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 62, 854, 162);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Id:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_1.setBounds(6, 25, 143, 16);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Name:\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_2.setBounds(6, 67, 167, 21);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cutomer Ph No:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_3.setBounds(6, 118, 143, 21);
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(185, 22, 130, 30);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 66, 130, 30);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(185, 117, 130, 30);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_4.setBounds(552, 25, 76, 16);
		panel_2.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(691, 20, 130, 30);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Invoice No:\n");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_5.setBounds(552, 69, 143, 16);
		panel_2.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(691, 66, 62, 30);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(6, 236, 854, 292);
		panel.add(panel_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(29, 546, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(355, 546, 117, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(655, 546, 117, 29);
		panel.add(btnNewButton_2);
	}
}
