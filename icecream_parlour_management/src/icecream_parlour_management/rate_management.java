package icecream_parlour_management;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class rate_management {

	JFrame rate_frame;
	private JTextField rate_manage_produt_id;
	private JTextField new_rate;

	public rate_management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		rate_frame = new JFrame();
		rate_frame.setBounds(100, 100, 707, 530);
		rate_frame.getContentPane().setLayout(null);
		rate_frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(6, 6, 695, 229);
		rate_frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rate Management");
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel.setBounds(250, 6, 167, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product Id:\n");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(18, 51, 97, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Rate:\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(18, 102, 97, 16);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Add Rate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String id_for_rate = rate_manage_produt_id.getText();
			    int new_id_rate = Integer.parseInt(id_for_rate);
			    
			    String new_rate_field = new_rate.getText();
			    int new_int_quantity = Integer.parseInt(new_rate_field);
 				final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String INSERT_USERS_SQL = "INSERT INTO rate(product_id,new_rate) VALUES(?, ?);";
			    System.out.println(INSERT_USERS_SQL);
		       
		        try (Connection connection = DriverManager.getConnection(url, user, password);

		           
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
		            preparedStatement.setInt(1, new_id_rate);
		            
		            preparedStatement.setInt(2, new_int_quantity);
		    

		            System.out.println(preparedStatement);
		            JOptionPane.showMessageDialog(null,"Rate Added Succesfully");
					
		          
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
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setBounds(250, 161, 140, 34);
		panel.add(btnNewButton);
		
		rate_manage_produt_id = new JTextField();
		rate_manage_produt_id.setBounds(134, 51, 130, 26);
		panel.add(rate_manage_produt_id);
		rate_manage_produt_id.setColumns(10);
		
		new_rate = new JTextField();
		new_rate.setBounds(134, 98, 130, 26);
		panel.add(new_rate);
		new_rate.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(6, 235, 695, 261);
		rate_frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setForeground(new Color(255, 255, 255));
		editorPane.setBackground(new Color(255, 255, 255));
		editorPane.setBounds(41, 36, 613, 171);
		panel_1.add(editorPane);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setBounds(519, 219, 117, 36);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Rate Details");
		lblNewLabel_4.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(284, 8, 126, 16);
		panel_1.add(lblNewLabel_4);
	
	}
}
