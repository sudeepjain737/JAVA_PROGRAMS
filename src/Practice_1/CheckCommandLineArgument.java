package Practice_1;

public class CheckCommandLineArgument {
    public static void main(String[] args) {
        int len = args.length;
        if(len == 0){
            System.out.println("No values");
        }
        else{
            for (int i = 0; i < len; i++) {
                System.out.print(args[i]+",");
            }
        }
    }
}
