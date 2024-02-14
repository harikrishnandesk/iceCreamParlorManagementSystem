package icecream_parlour_management;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stk_management {

	JFrame frame;
	private JTextField id_field;
	private JTextField product_field;
	private JTextField quantity_field;
	private JTextField delete_id;

	
	public stk_management() {
		initialize();
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 500);
		frame.setTitle("Stock Management");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel addstockpanel = new JPanel();
		addstockpanel.setBackground(UIManager.getColor("EditorPane.background"));
		addstockpanel.setBounds(6, 6, 632, 217);
		frame.getContentPane().add(addstockpanel);
		addstockpanel.setLayout(null);
		
		id_field = new JTextField();
		id_field.setBounds(150, 37, 130, 26);
		addstockpanel.add(id_field);
		id_field.setColumns(10);
		
		product_field = new JTextField();
		product_field.setBounds(150, 79, 130, 26);
		addstockpanel.add(product_field);
		product_field.setColumns(10);
		
		quantity_field = new JTextField();
		quantity_field.setBounds(150, 118, 130, 26);
		addstockpanel.add(quantity_field);
		quantity_field.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Add Stock");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(268, 0, 93, 35);
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		addstockpanel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUCT ID:\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(18, 45, 93, 16);
		addstockpanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PRODUCT NAME:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_3.setBounds(18, 84, 113, 16);
		addstockpanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("QUANTITY :\n");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_4.setBounds(18, 123, 93, 16);
		addstockpanel.add(lblNewLabel_4);
		
		JButton add_button = new JButton("ADD");
		add_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				    String id_new = id_field.getText();
				    int new_id = Integer.parseInt(id_new);
				    String new_product_field = product_field.getText();
				    String new_quantity_field = quantity_field.getText();
				    int new_int_quantity = Integer.parseInt(new_quantity_field);
     				final String url = "jdbc:postgresql://localhost/postgres";
				    final String user = "postgres";
				    final String password = "root";

				    final String INSERT_USERS_SQL = "INSERT INTO stock(id,product_name,product_quatity) VALUES(?, ?, ?);";
				    System.out.println(INSERT_USERS_SQL);
			       
			        try (Connection connection = DriverManager.getConnection(url, user, password);

			           
			            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			            preparedStatement.setInt(1, new_id);
			            preparedStatement.setString(2, new_product_field);
			            preparedStatement.setInt(3, new_int_quantity);
			    

			            System.out.println(preparedStatement);
			            JOptionPane.showMessageDialog(null,"Item Added Succesfully");
						
			          
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
		
		add_button.setForeground(UIManager.getColor("EditorPane.caretForeground"));
		add_button.setBackground(UIManager.getColor("DesktopIcon.labelBackground"));
		add_button.setBounds(245, 165, 117, 35);
		addstockpanel.add(add_button);
		
		
		
		JPanel deletstockpanel = new JPanel();
		deletstockpanel.setBackground(new Color(0, 0, 0));
		deletstockpanel.setBounds(6, 222, 632, 244);
		frame.getContentPane().add(deletstockpanel);
		deletstockpanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Stock\n");
		lblNewLabel_1.setBounds(268, 6, 151, 25);
		lblNewLabel_1.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel_1.setForeground(UIManager.getColor("EditorPane.background"));
		deletstockpanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("PRODUCT ID:");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(31, 53, 96, 25);
		deletstockpanel.add(lblNewLabel_5);
		
		delete_id = new JTextField();
		delete_id.setBounds(150, 52, 130, 26);
		deletstockpanel.add(delete_id);
		delete_id.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_to_delete = delete_id.getText();
			    int new_id_delete = Integer.parseInt(id_to_delete);
			    
 				final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String DELETE_USERS_SQL = "DELETE FROM stock WHERE id="+new_id_delete;
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
		btnNewButton.setBounds(247, 132, 117, 35);
		deletstockpanel.add(btnNewButton);
	}
}
