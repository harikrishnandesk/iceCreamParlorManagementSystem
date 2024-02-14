package icecream_parlour_management;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class admin_panel {

	JFrame frame;


	public admin_panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 268, 357);
		frame.setTitle("Admin Panel");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("Select Options");
		lblNewLabel.setFont(new Font("Apple Chancery", Font.PLAIN, 21));
		lblNewLabel.setBounds(66, 0, 138, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton stk_but = new JButton("Stock Management");
		stk_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stk_management window = new stk_management();
			    window.frame.setVisible(true);
			}
		});
		stk_but.setBounds(41, 30, 185, 40);
		frame.getContentPane().add(stk_but);
		
		JButton cus_but = new JButton("Customer Management");
		cus_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cus_management window1 = new cus_management();
				window1.frame.setVisible(true);
			}
		});
		cus_but.setBounds(41, 90, 185, 40);
		frame.getContentPane().add(cus_but);
		
		JButton rat_but = new JButton("Rate Management");
		rat_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rate_management window2 = new rate_management();
				window2.rate_frame.setVisible(true);
			}
		});
		rat_but.setBounds(41, 150, 185, 40);
		frame.getContentPane().add(rat_but);
		
		JButton emp_but = new JButton("Employee Management");
		emp_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employee_management window3 = new employee_management();
				window3.emp_frame.setVisible(true);
			}
		});
		emp_but.setBounds(41, 210, 185, 40);
		frame.getContentPane().add(emp_but);
		
		JButton btnNewButton = new JButton("Edit Or Update Items");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update window4 = new update();
				window4.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(41, 270, 185, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
