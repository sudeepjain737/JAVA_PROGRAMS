package JdbcProject;

import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class DAOClass {
    Connection con = null;
    PreparedStatement p = null;
    Scanner input = new Scanner(System.in);
    DAOClass() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
    }

    public void insert() throws SQLException {
        try {
            p = con.prepareStatement("insert into studentinfo values (?,?,?,?)");
            System.out.print("Enter Student Name: ");
            p.setString(1, input.nextLine());
            System.out.print("Enter Roll Number: ");
            p.setInt(2, input.nextInt());
            System.out.print("Enter Date of Birth: ");
            input.nextLine();
            p.setString(3, input.nextLine());
            System.out.print("Enter Fees: ");
            p.setInt(4, input.nextInt());
            p.executeUpdate();
            System.out.println("Info Insert Successfully");
        }catch (Exception e ){
            System.out.println(e);
        }
    }
    public void delete() throws SQLException {
        try {
            p = con.prepareStatement("DELETE FROM studentinfo WHERE RollNo = ?");
            System.out.print("Enter Roll Number Which you want to delete: ");
            p.setInt(1, input.nextInt());
            p.executeUpdate();
            System.out.println("Info Delete Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void modify() throws SQLException {
        try {
            p = con.prepareStatement("UPDATE studentinfo SET Fees = ? WHERE RollNo = ?");
            System.out.print("Enter Roll Number to update Fees: ");
            p.setInt(2, input.nextInt());
            System.out.print("Enter New Fees: ");
            p.setInt(1, input.nextInt());
            p.executeUpdate();
            System.out.println("Info Updated Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void display(int roll) throws SQLException {
        try {
            p = con.prepareStatement("select * from studentinfo WHERE RollNo = ?");
            System.out.print("Enter Roll Number Which you want to See: ");
            p.setInt(1, roll);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void display() throws SQLException {
        try {
            p = con.prepareStatement("select * from studentinfo");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DAOClass d1 = new DAOClass();
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for Insert a new Student");
        System.out.println("Press 2 for delete info of Student");
        System.out.println("Press 3 for Modify Fess of Student");
        System.out.println("Press 4 to display Student");
        System.out.println("Press 5 to display all Students");
        System.out.println("Press 6 For Exit");
        int n = input.nextInt();
        while (n!=6){
            if(n==1){
                d1.insert();
            }
            else if(n==2){
                d1.delete();
            }
            else if(n==3){
                d1.modify();
            }
            else if(n==4){
                d1.display(input.nextInt());
            }
            else if(n==5){
                d1.display();
            }
            else if(n==6){
                System.exit(0);
            }
            else {
                System.out.println("You Enter a Wrong Option");
            }
            System.out.println("Press 1 for Insert a new Student");
            System.out.println("Press 2 for delete info of Student");
            System.out.println("Press 3 for Modify Fess of Student");
            System.out.println("Press 4 to display Student");
            System.out.println("Press 5 to display all Students");
            System.out.println("Press 6 For Exit");
            n = input.nextInt();
        }
    }
}
