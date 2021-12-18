import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {
    public void validEmail(ArrayList<String> arr ,String email){
        Pattern p = Pattern.compile("[A-Za-z0-9_.]+[@](gmail|yahoo|rediff|hotmail|gla).com");
        Matcher m = p.matcher(email);
        while (m.find()){
            arr.add(m.group());
        }try {
            if (arr.size() == 0) {
                throw new MyException();
            }
        }catch (MyException obj){}
    }
    public void insert(ArrayList<String >arr){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MTest","root","");){
            int c = 1;
            for (int i = 0; i < arr.size(); i++) {
                PreparedStatement ps = con.prepareStatement("INSERT into inf value (?,?)");
                ps.setInt(1,c);
                ps.setString(2, arr.get(i));
                ps.executeUpdate();
                c = c+1;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void display(ArrayList<String >arr){
        Pattern p = Pattern.compile("[A-Za-z0-9_.]+[@](gla).com");
        for (int i = 0; i < arr.size(); i++) {
            Matcher m = p.matcher(arr.get(i));
            if(m.find()){
                System.out.println(m.group());
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exam e1 = new Exam();
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Please Enter your String");
        e1.validEmail(arr, input.next());
        Collections.sort(arr);
        Collections.reverse(arr);
        e1.insert(arr);
        e1.display(arr);

    }
}
class MyException extends Exception{
    MyException(){
        super();
        System.out.println("InvalidInputException");
    }
}