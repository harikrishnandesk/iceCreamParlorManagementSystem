package icecream_parlour_management;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class employee_panel {

	JFrame frame;

	
	public employee_panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(238, 238, 238));
		frame.setBounds(100, 100, 265, 406);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Panel");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setBounds(70, 0, 159, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton add_cus = new JButton("Add Customer");
		add_cus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    cus_manage_add window_add = new cus_manage_add();
			    window_add.frame.setVisible(true);
			}
		});
		add_cus.setBounds(65, 53, 117, 35);
		frame.getContentPane().add(add_cus);
		
		JButton del_cus = new JButton("Delete Customer");
		del_cus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete_customer window_delete = new Delete_customer();
			    window_delete.frame.setVisible(true);
				
			}
		});
		del_cus.setBounds(65, 111, 117, 35);
		frame.getContentPane().add(del_cus);
		
		JButton stk_rev = new JButton("Stock Review");
		stk_rev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stock_review window_review = new stock_review();
			    window_review.frame.setVisible(true);
			}
		});
		stk_rev.setBounds(65, 175, 117, 35);
		frame.getContentPane().add(stk_rev);
		
		JButton rate_rev = new JButton("Rate review");
		rate_rev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rate_review window_review = new rate_review();
			    window_review.frame.setVisible(true);
			}
		});
		rate_rev.setBounds(65, 244, 117, 35);
		frame.getContentPane().add(rate_rev);
		
		JButton btnNewButton = new JButton("Bill");
		btnNewButton.setBounds(65, 312, 117, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
