package Practice_12;

import java.util.Scanner;

public class Palindrome {
    String s;

    public void palindrome(String s) {
        char[] lst1 = s.toCharArray();
        int j = lst1.length - 1;
        int c = 0;
        for (int i = 0; i < ((lst1.length) / 2) - 1; i = i + 1) {
            if (lst1[i] == lst1[j]) {
                c = c + 1;
                j = j - 1;
            }
        }
        if (c == ((lst1.length) / 2) - 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Palindrome p1 = new Palindrome();
        p1.palindrome(input.nextLine());
    }
}