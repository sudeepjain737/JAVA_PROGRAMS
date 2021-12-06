package Practice_12;

import java.util.Locale;

public class BiggerString {
    public String biggerString(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int n = Math.min(l1,l2);
        int n1 = Math.max(l1,l2);
        String s3 = "";
        for (int i = 0; i < n; i++) {
            s3 = s3.concat(s1.substring(i,i+1));
            s3 = s3.concat(s2.substring(i,i+1));
        }
        if(l1>l2){
            s3 = s3.concat(s1.substring(n,l1));
        }
        else{
            s3 = s3.concat(s2.substring(n,l2));
        }
        return s3;
    }

    public static void main(String[] args) {
        BiggerString b1 = new BiggerString();
        String res = b1.biggerString("Hello","World");
        System.out.println(res);
    }
}
