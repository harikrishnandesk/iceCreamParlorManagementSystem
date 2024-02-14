package icecream_parlour_management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;


public class login_form {

	private JFrame login_frame;
	private JTextField text_field;
	private JPasswordField pass_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_form window = new login_form();
					window.login_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		login_frame = new JFrame();
		login_frame.getContentPane().setBackground(new Color(204, 204, 204));
		login_frame.setBounds(100, 100, 300, 300);
		login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login_frame.getContentPane().setLayout(null);
		login_frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setBounds(68, 88, 84, 16);
		login_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:\n");
		lblNewLabel_1.setBounds(68, 150, 84, 16);
		login_frame.getContentPane().add(lblNewLabel_1);
		
		text_field = new JTextField();
		text_field.setBounds(164, 81, 130, 31);
		login_frame.getContentPane().add(text_field);
		text_field.setColumns(10);
		
		pass_field = new JPasswordField();
		pass_field.setBounds(164, 143, 130, 31);
		login_frame.getContentPane().add(pass_field);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == btnNewButton) {
		            String userText;
		            String pwdText;
		            userText = text_field.getText();
		            pwdText = pass_field.getText();
		            if (userText.equalsIgnoreCase("a") && pwdText.equalsIgnoreCase("a")) {
		                admin_panel window = new admin_panel();
					    window.frame.setVisible(true);
					    JOptionPane.showMessageDialog(null,"Admin Login Sucessesfull");
					
		            }
		            else if(userText.equalsIgnoreCase("e")&& pwdText.equalsIgnoreCase("e")){
		                 employee_panel window2 = new employee_panel();
		                 window2.frame.setVisible(true);
		                 JOptionPane.showMessageDialog(null,"Employee login Sucessesfull");
		                 
		            }
		            else {
		            	error_page window3 = new error_page();
		            	window3.frame.setVisible(true);
		            }
				}
			}
		});	
		btnNewButton.setBounds(164, 208, 130, 37);
		login_frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/anandyuva/Desktop/ice cream parlour management/icecream_parlour_management/user-2.png"));
		lblNewLabel_2.setBounds(12, 80, 44, 37);
		login_frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/anandyuva/Desktop/ice cream parlour management/icecream_parlour_management/padlock-2.png"));
		lblNewLabel_3.setBounds(12, 129, 50, 50);
		login_frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("--------Login--------");
		lblNewLabel_4.setFont(new Font("AppleMyungjo", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(36, 6, 212, 31);
		login_frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_frame.dispose();
			}
		});
		btnNewButton_1.setBounds(12, 208, 130, 37);
		login_frame.getContentPane().add(btnNewButton_1);
		login_frame.setTitle("IceCream Management");
	}
}
