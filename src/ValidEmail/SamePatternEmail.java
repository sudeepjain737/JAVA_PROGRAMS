package ValidEmail;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;

public class SamePatternEmail {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        input.close();
//        Pattern p = Pattern.compile("[a-zA-Z0-9_.]+[@][a-zA-Z]+[.][a-zA-Z]+[.][a-zA-Z]+[a-zA-Z.]+");
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z_.]*@[a-zA-Z0-9]+([.][a-zA-Z])+");
        Matcher m = p.matcher(target);
        Matcher m1 = p.matcher(target);
        int c = 0;
        while(m.find()){
            c = c+1;
        }
        try {
            if(c == 0){
                throw new NoEmailFoundException();
            }
        }catch (NoEmailFoundException obj){
            System.out.println(obj);
        }
        String arr[] = new String[c];
        int i = 0;
        while (m1.find()){
            arr[i] = m1.group();
            i = i+1;
        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/validemails","root","");
        PreparedStatement ps = con.prepareStatement("insert into samepatternemails values(?)");
        for (int j = 0; j < arr.length; j++) {
            ps.setString(1,arr[j]);
            ps.executeUpdate();
        }
        ResultSet rs = ps.executeQuery("select * from samepatternemails");
        while (rs.next()){
            System.out.println(rs.getString(1));
        }
    }
}
