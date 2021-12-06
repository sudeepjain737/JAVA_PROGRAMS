package Practice_17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        Pattern p = Pattern.compile("(0|91)?[1-9][0-9]{9}");
        Matcher m = p.matcher(target);
        int c = 0;
        while (m.find()) {
            System.out.println(m.group());
            c = c + 1;
        }
    }
}
