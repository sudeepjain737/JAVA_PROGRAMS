package Practice_5Array;
import java.util.Scanner;

public class Palindrome {
    int n;
    public static void palindrome(int n){
        int s=0,n1=n;
        while(n>0){
            int r = n%10;
            s = (s*10)+r;
            n=n/10;
        }
        if(s==n1){
            System.out.println(n1+" is a palindrome");
        }
        else{
            System.out.println(n1+" is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Palindrome.palindrome(n);
    }
}
