package icecream_parlour_management;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class cus_manage_add {

	JFrame frame;
	private JTextField adm_cus_name;
	private JTextField adm_cus_id;
	private JTextField adm_cus_ph;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public cus_manage_add() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 704, 501);
		
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 692, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add customer Details");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setBounds(225, 6, 196, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("customer Name:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(6, 50, 134, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("customer ID:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(6, 120, 134, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Ph No:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(6, 188, 134, 16);
		panel.add(lblNewLabel_3);
		
		adm_cus_name = new JTextField();
		adm_cus_name.setBounds(184, 46, 130, 26);
		panel.add(adm_cus_name);
		adm_cus_name.setColumns(10);
		
		adm_cus_id = new JTextField();
		adm_cus_id.setBounds(184, 116, 130, 26);
		panel.add(adm_cus_id);
		adm_cus_id.setColumns(10);
		
		adm_cus_ph = new JTextField();
		adm_cus_ph.setBounds(184, 184, 130, 26);
		panel.add(adm_cus_ph);
		adm_cus_ph.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
				String id_cus_mange = adm_cus_id.getText();
			    int cus_id_empl = Integer.parseInt(id_cus_mange);
			    String customer_name_empl = adm_cus_name.getText();
			    String customer_ph_no_ds = adm_cus_ph.getText();
			    int cus_phone_empl = Integer.parseInt(customer_ph_no_ds);
 				final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String INSERT_USERS_SQL = "INSERT INTO customer(customer_id,customer_name,cutomer_ph_no) VALUES(?, ?, ?);";
			    System.out.println(INSERT_USERS_SQL);
		       
		        try (Connection connection = DriverManager.getConnection(url, user, password);

		           
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
		            preparedStatement.setInt(1, cus_id_empl);
		            preparedStatement.setString(2, customer_name_empl);
		            preparedStatement.setInt(3, cus_phone_empl);
		    

		            System.out.println(preparedStatement);
		            JOptionPane.showMessageDialog(null,"customer Added Succesfully");
					
		          
		            preparedStatement.executeUpdate();
		        } catch (SQLException ej) {

		            
		            printSQLException(ej);
		        };

		        
		    }

		    public void printSQLException(SQLException ex) {
		        for (Throwable e: ex) {
		            if (e instanceof SQLException) {
		                e.printStackTrace(System.err);
		                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
		                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
		                System.err.println("Message: " + e.getMessage());
		                Throwable t = ex.getCause();
		                while (t != null) {
		                    System.out.println("Cause: " + t);
		                    t = t.getCause();
		                }
		            }
		        }
		    }
		
			
		});
		btnNewButton.setBounds(439, 107, 117, 29);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(6, 271, 692, 196);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("View");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(288, 6, 50, 16);
		panel_1.add(lblNewLabel_4);
	}
}
