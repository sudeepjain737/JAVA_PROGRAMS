package Practice_1;

import java.util.Scanner;

public class TensDigit {
    public static int tensDigit(int n){
        n=n/10;
        return n%10;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        System.out.println(tensDigit(n));
    }
}
