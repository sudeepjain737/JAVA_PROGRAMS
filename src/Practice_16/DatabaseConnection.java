package Practice_16;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/21m", "root", "");
            System.out.println("Connection Established Successfully");
        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}
