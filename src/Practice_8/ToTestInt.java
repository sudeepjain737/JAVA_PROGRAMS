package Practice_8;

import java.util.Scanner;

interface Test
{
    public int square();
}

class Arithmetic
{
    public int square(int a){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number:");
//        int n = input.nextInt();
//        System.out.println(n*n);
        return a*a;
    }
}
public class ToTestInt
{
    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic();
        System.out.println(a1.square(5));
    }
}
