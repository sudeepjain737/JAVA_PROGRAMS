package Practice_16;

import java.sql.*;

public class MySqlQuery {
        public static void main(String[] args){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/21m", "root", "");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("select * from Emp");
                while (rs.next()){
                    System.out.println(rs.getInt(1));
                    //  System.out.println(rs.getInt("id"));
                    System.out.println(rs.getString("name"));
                    //  System.out.println(rs.getString(2));
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }


