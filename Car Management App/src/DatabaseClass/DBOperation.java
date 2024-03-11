/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alhaanahmed
 */
public class DBOperation {
    private String username = "root";
    private String password = "devsync123@Alhaan";
    private String dbUrl = "jdbc:mysql://localhost:3306/carapp";
    
    public Connection connectDB() {
        try {
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            JOptionPane.showMessageDialog(null, "Proceed Next!");
            return connection; // Return the connection object
        } catch (SQLException error) {
            error.printStackTrace();
            return null; // Return null in case of an error
        }
    }

    // Close the connection
    public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

