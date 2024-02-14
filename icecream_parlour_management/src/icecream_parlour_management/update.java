package icecream_parlour_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class update {

	
	JFrame frame;
	private JTextField upd_pro_id;
	private JTextField upd_pro_name;
	private JTextField upd_pro_quantity;
	private JTextField upd_cus_id;
	private JTextField upd_cus_name;
	private JTextField textField;
	private JTextField upd_emp_id;
	private JTextField upd_emp_name;
	private JTextField upd_emp_pos;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update window = new update();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public update() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 729, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel stock_panel = new JPanel();
		stock_panel.setBackground(Color.WHITE);
		stock_panel.setBounds(6, 6, 717, 192);
		frame.getContentPane().add(stock_panel);
		stock_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stock Update\n");
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel.setBounds(283, 0, 163, 26);
		stock_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID:\n\n");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_1.setBounds(6, 30, 133, 16);
		stock_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("product Name:\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_2.setBounds(6, 79, 133, 26);
		stock_panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Product Quantity:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_3.setBounds(6, 138, 174, 16);
		stock_panel.add(lblNewLabel_3);
		
		upd_pro_id = new JTextField();
		upd_pro_id.setBounds(186, 27, 130, 26);
		stock_panel.add(upd_pro_id);
		upd_pro_id.setColumns(10);
		
		upd_pro_name = new JTextField();
		upd_pro_name.setBounds(186, 81, 130, 26);
		stock_panel.add(upd_pro_name);
		upd_pro_name.setColumns(10);
		
		upd_pro_quantity = new JTextField();
		upd_pro_quantity.setBounds(186, 135, 130, 26);
		stock_panel.add(upd_pro_quantity);
		upd_pro_quantity.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(449, 70, 117, 51);
		stock_panel.add(btnNewButton);
		
		JPanel cus_panel = new JPanel();
		cus_panel.setBackground(Color.BLACK);
		cus_panel.setBounds(6, 203, 350, 295);
		frame.getContentPane().add(cus_panel);
		cus_panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Customer Update");
		lblNewLabel_4.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(110, 6, 159, 26);
		cus_panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Customer ID:\n");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(6, 66, 141, 16);
		cus_panel.add(lblNewLabel_5);
		
		upd_cus_id = new JTextField();
		upd_cus_id.setBounds(185, 63, 130, 26);
		cus_panel.add(upd_cus_id);
		upd_cus_id.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Customer Name:");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(6, 128, 159, 31);
		cus_panel.add(lblNewLabel_7);
		
		upd_cus_name = new JTextField();
		upd_cus_name.setBounds(185, 132, 130, 26);
		cus_panel.add(upd_cus_name);
		upd_cus_name.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Customer PH NO:\n");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(6, 199, 159, 16);
		cus_panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(185, 196, 130, 26);
		cus_panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setBounds(96, 244, 117, 32);
		cus_panel.add(btnNewButton_1);
		
		JPanel emplo_panel = new JPanel();
		emplo_panel.setBackground(Color.BLACK);
		emplo_panel.setForeground(Color.WHITE);
		emplo_panel.setBounds(368, 203, 355, 297);
		frame.getContentPane().add(emplo_panel);
		emplo_panel.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Employee Update");
		lblNewLabel_4_1.setBounds(105, 5, 145, 26);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		emplo_panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_8 = new JLabel("Employee ID:");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_8.setBounds(6, 66, 127, 26);
		emplo_panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Employee Name:");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_9.setBounds(6, 128, 145, 26);
		emplo_panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Employee Position:");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_10.setBounds(6, 199, 173, 26);
		emplo_panel.add(lblNewLabel_10);
		
		upd_emp_id = new JTextField();
		upd_emp_id.setBounds(204, 68, 130, 26);
		emplo_panel.add(upd_emp_id);
		upd_emp_id.setColumns(10);
		
		upd_emp_name = new JTextField();
		upd_emp_name.setBounds(204, 130, 130, 26);
		emplo_panel.add(upd_emp_name);
		upd_emp_name.setColumns(10);
		
		upd_emp_pos = new JTextField();
		upd_emp_pos.setBounds(204, 201, 130, 26);
		emplo_panel.add(upd_emp_pos);
		upd_emp_pos.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.setBounds(105, 244, 117, 32);
		emplo_panel.add(btnNewButton_2);
	}
}
