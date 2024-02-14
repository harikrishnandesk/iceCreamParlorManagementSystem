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

public class Delete_customer {

	JFrame frame;
	private JTextField delete_cus_field;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Delete_customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 326, 300);
		
		frame.getContentPane().setLayout(null);
		
		JPanel delete_panel = new JPanel();
		delete_panel.setBackground(Color.WHITE);
		delete_panel.setForeground(Color.WHITE);
		delete_panel.setBounds(6, 6, 314, 260);
		frame.getContentPane().add(delete_panel);
		delete_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Cutomer");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(108, 6, 122, 16);
		delete_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer ID :");
		lblNewLabel_1.setBounds(6, 49, 102, 16);
		delete_panel.add(lblNewLabel_1);
		
		delete_cus_field = new JTextField();
		delete_cus_field.setBounds(118, 44, 130, 26);
		delete_panel.add(delete_cus_field);
		delete_cus_field.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_to_delete_cus = delete_cus_field.getText();
			    int cus_id_delete = Integer.parseInt(id_to_delete_cus);
			    
 				final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String DELETE_USERS_SQL = "DELETE FROM customer WHERE customer_id="+cus_id_delete;
			    System.out.println(DELETE_USERS_SQL);
		       
		        try (Connection connection = DriverManager.getConnection(url, user, password);

		           
		            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL)) {
		           

		            System.out.println(preparedStatement);
		            JOptionPane.showMessageDialog(null,"Items Deleted Successfully");
					
		            
		          
		            preparedStatement.executeUpdate();
		        } catch (SQLException ed) {

		            
		            printSQLException(ed);
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
		btnNewButton.setBounds(84, 142, 117, 29);
		delete_panel.add(btnNewButton);
	}
}
