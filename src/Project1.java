import java.sql.*;
import java.util.Scanner;

public class Project1 {
    Connection con = null;
    Statement s = null;
    Scanner input = new Scanner(System.in);

    Project1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
    }

    public void designation() throws SQLException {
        try {
            s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM employeedetails");
            System.out.print("Enter Employee Id: ");
            int n = input.nextInt();
            String s1 = null;
            int EmpNo = 0;
            String EmpName = null;
            String Department = null;
            String Designation = null;
            int Basic = 0;
            int HRA = 0;
            int IT = 0;
            int c = 0;
            while (rs.next()) {
                int n1 = rs.getInt("EmpNo");
                if (n1 != n) {
                } else {
                    c = 1;
                    s1 = rs.getString("DesigCode");
                    EmpNo = rs.getInt("EmpNo");
                    EmpName = rs.getString("EmpName");
                    Department = rs.getString("Dept");
                    Basic = rs.getInt("Basic");
                    HRA = rs.getInt("HRA");
                    IT = rs.getInt("IT");
                    break;
                }
            }
            if (c != 0) {
                int DA = 0;
                ResultSet rs2 = s.executeQuery("SELECT * FROM designationdetails");
                while (rs2.next()) {
                    if (rs2.getString("Designation Code").equals(s1)) {
                        DA = rs2.getInt("DA");
                        Designation = rs2.getString("Designation");
                    }
                }
                System.out.println("Emp No.\t\t\t" + "Emp Name\t\t\t" + "Department\t\t\t" + "Designation\t\t\t" + "Salary");
                System.out.println(EmpNo + "\t\t\t" + EmpName + "\t\t\t\t" + Department + "\t\t\t\t" + Designation + "\t\t\t\t" + (HRA + Basic + IT + DA));
            } else {
                System.out.println("There is No Employee with empid: " + n);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Project1 p1 = new Project1();
        p1.designation();

    }
}
