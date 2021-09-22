package Practice_1;

public class CommandLineArgument {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        if (str1.equals("GLA") && str2.equals("Mathura")) {
            System.out.println(("GLA University Mathura"));
        }
        else if(str1.equals("AAA") && str2.equals("Delhi")){
            System.out.println("AAA Technologies Delhi");
        }
    }
}
