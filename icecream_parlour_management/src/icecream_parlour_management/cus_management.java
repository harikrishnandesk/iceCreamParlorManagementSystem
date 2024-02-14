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
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class cus_management {

	JFrame frame;
	private JTextField cus_id;
	private JTextField cus_name;
	private JTextField cus_ph_no;
	protected Statement statement;

	
	
	public cus_management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 690, 523);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JPanel cut_add_panel = new JPanel();
		cut_add_panel.setBackground(Color.WHITE);
		cut_add_panel.setForeground(Color.WHITE);
		cut_add_panel.setBounds(6, 6, 678, 261);
		frame.getContentPane().add(cut_add_panel);
		cut_add_panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Customer Details");
		lblNewLabel_1.setBounds(230, 5, 253, 29);
		lblNewLabel_1.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		cut_add_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Name:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(42, 109, 148, 16);
		cut_add_panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Id:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(44, 67, 125, 16);
		cut_add_panel.add(lblNewLabel_3);
		
		cus_id = new JTextField();
		cus_id.setBounds(253, 63, 201, 26);
		cut_add_panel.add(cus_id);
		cus_id.setColumns(10);
		
		cus_name = new JTextField();
		cus_name.setBounds(253, 105, 201, 26);
		cut_add_panel.add(cus_name);
		cus_name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Customer Ph No:");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(42, 157, 136, 16);
		cut_add_panel.add(lblNewLabel_4);
		
		cus_ph_no = new JTextField();
		cus_ph_no.setBounds(253, 153, 201, 26);
		cut_add_panel.add(cus_ph_no);
		cus_ph_no.setColumns(10);
		
		JButton cus_add_but = new JButton("Add");
		cus_add_but.setForeground(new Color(0, 0, 0));
		cus_add_but.setBackground(new Color(255, 255, 255));
		cus_add_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id_cus = cus_id.getText();
			    int cus_id = Integer.parseInt(id_cus);
			    String customer_name = cus_name.getText();
			    String customer_ph_no = cus_ph_no.getText();
			    int cus_phone = Integer.parseInt(customer_ph_no);
 				final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String INSERT_USERS_SQL = "INSERT INTO customer(customer_id,customer_name,cutomer_ph_no) VALUES(?, ?, ?);";
			    System.out.println(INSERT_USERS_SQL);
		       
		        try (Connection connection = DriverManager.getConnection(url, user, password);

		           
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
		            preparedStatement.setInt(1, cus_id);
		            preparedStatement.setString(2, customer_name);
		            preparedStatement.setInt(3, cus_phone);
		    

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
		cus_add_but.setBounds(337, 191, 117, 48);
		cut_add_panel.add(cus_add_but);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(255, 255, 255));
		editorPane.setBounds(237, 301, 447, 188);
		frame.getContentPane().add(editorPane);
		
		JLabel lblNewLabel = new JLabel("Customer List");
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(395, 275, 130, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel cus_but_panel = new JPanel();
		cus_but_panel.setBounds(7, 301, 218, 188);
		frame.getContentPane().add(cus_but_panel);
		cus_but_panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("To view customer details");
		lblNewLabel_5.setFont(new Font("Snell Roundhand", Font.BOLD, 20));
		lblNewLabel_5.setBounds(6, 20, 206, 29);
		cus_but_panel.add(lblNewLabel_5);
		
		JButton cus_view_but = new JButton("Click Me!");
		cus_view_but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
			}
		});
		cus_view_but.setBounds(42, 73, 117, 47);
		cus_but_panel.add(cus_view_but);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(251, 304, 433, 185);
		frame.getContentPane().add(editorPane_1);
		
		
		
		
	}
}
