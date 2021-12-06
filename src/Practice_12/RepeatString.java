package Practice_12;

public class RepeatString {
    public String repeatString(String s) {
        int n = s.length();
        String s2 = "";
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                s2 = s2.concat(s.substring(0, 2));
            }
        }
        else{
            s2 = s2.concat(s);
        }
        return s2;
    }

    public static void main(String[] args) {
        RepeatString r1 = new RepeatString();
        String res = r1.repeatString("AppleApple");
        System.out.println(res);
    }
}
