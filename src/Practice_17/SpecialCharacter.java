package Practice_17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        Pattern p = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!]");
        Matcher m = p.matcher(target);
        System.out.println(m.find());
    }
}
