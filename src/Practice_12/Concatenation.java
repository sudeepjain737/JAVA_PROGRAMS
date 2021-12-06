package Practice_12;

import java.util.Locale;
import java.util.Scanner;

public class Concatenation {
    String s1;
    String s2;
    String s3;
    public String append(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.charAt(s1.length()-1) == s2.charAt(0)){
            s3 = s1.concat(s2.substring(1,s2.length()));
        }
        else {
            s3 = s1.concat(s2);
        }
        return s3;
    }

    public static void main(String[] args) {
        Concatenation c1 = new Concatenation();
        System.out.println(c1.append("MarK","Kate"));

    }
}
