package Practice_12;

public class LastNRepeatSting {
    public String lastnRepeatString(String s1,int n){
        String s3 = "";
        for (int i = 0; i < n; i++) {
            s3 = s3.concat(s1.substring(n-1, s1.length()));
        }
        return s3;
    }

    public static void main(String[] args) {
        LastNRepeatSting l1 = new LastNRepeatSting();
        String res = l1.lastnRepeatString("Niraj",3);
        System.out.println(res);
    }
}
