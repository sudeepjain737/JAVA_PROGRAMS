package Practice_17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        Pattern p = Pattern.compile("[A-Za-z0-9_.]+[@](gmail|yahoo).com");
        Matcher m = p.matcher(target);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
