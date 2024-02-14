package icecream_parlour_management;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
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

public class employee_management {


	JFrame emp_frame;
	private JTextField emp_name;
	private JTextField employee_id;
	private JTextField emp_pos;
	private JTextField emp_id_delete;
    


	
	public employee_management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		emp_frame = new JFrame();
		emp_frame.setBounds(100, 100, 600, 500);
		emp_frame.getContentPane().setLayout(null);
		emp_frame.setResizable(false);
		
		JPanel emp_add_panel = new JPanel();
		emp_add_panel.setBackground(new Color(255, 255, 255));
		emp_add_panel.setBounds(6, 6, 588, 230);
		emp_frame.getContentPane().add(emp_add_panel);
		emp_add_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Employee");
		lblNewLabel.setFont(new Font("Lao MN", Font.PLAIN, 17));
		lblNewLabel.setBounds(217, 6, 148, 16);
		emp_add_panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setBounds(18, 48, 113, 16);
		emp_add_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee ID:\n");
		lblNewLabel_2.setBounds(18, 99, 113, 16);
		emp_add_panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Employee Position:\n");
		lblNewLabel_3.setBounds(18, 149, 130, 16);
		emp_add_panel.add(lblNewLabel_3);
		
		emp_name = new JTextField();
		emp_name.setColumns(10);
		emp_name.setBounds(156, 43, 130, 26);
		emp_add_panel.add(emp_name);
		
		employee_id = new JTextField();
		employee_id.setColumns(10);
		employee_id.setBounds(156, 94, 130, 26);
		emp_add_panel.add(employee_id);
		
		emp_pos = new JTextField();
		emp_pos.setColumns(10);
		emp_pos.setBounds(156, 144, 130, 26);
		emp_add_panel.add(emp_pos);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id_for_employee = employee_id.getText();
			    int id_db_employee = Integer.parseInt(id_for_employee);
			    
			    String employee_db_name = emp_name.getText();
			    
			    
			    String emp_db_pos = emp_pos.getText();
			    
			    final String url = "jdbc:postgresql://localhost/postgres";
			    final String user = "postgres";
			    final String password = "root";

			    final String INSERT_employee_SQL = "INSERT INTO employeedetails(employee_id,employee_name,employee_postion) VALUES(?, ?, ?);";
			    System.out.println(INSERT_employee_SQL);
		       
		        try (Connection connection = DriverManager.getConnection(url, user, password);

		           
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_employee_SQL)) {
		            preparedStatement.setInt(1, id_db_employee);
		            
		            preparedStatement.setString(2, employee_db_name);
		            
		            preparedStatement.setString(3, emp_db_pos);
		    

		            System.out.println(preparedStatement);
		            JOptionPane.showMessageDialog(null,"Employee Added Succesfully");
					
		          
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
		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(361, 94, 117, 29);
		emp_add_panel.add(btnNewButton);
		
		JPanel emp_delete_panel = new JPanel();
		emp_delete_panel.setBackground(Color.LIGHT_GRAY);
		emp_delete_panel.setBounds(6, 236, 588, 230);
		emp_frame.getContentPane().add(emp_delete_panel);
		emp_delete_panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Employee Id:");
		lblNewLabel_4.setBounds(18, 32, 89, 16);
		emp_delete_panel.add(lblNewLabel_4);
		
		emp_id_delete = new JTextField();
		emp_id_delete.setBounds(152, 27, 130, 26);
		emp_delete_panel.add(emp_id_delete);
		emp_id_delete.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(361, 109, 117, 29);
		emp_delete_panel.add(btnNewButton_1);
	}
}
