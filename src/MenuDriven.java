import java.util.EmptyStackException;
import java.util.Scanner;

public class MenuDriven extends Exception {
    public static void exception(int n) {
            switch (n) {
                case 1 -> throw new NullPointerException();
                case 2 -> throw new ArrayIndexOutOfBoundsException();
                case 3 -> throw new ArithmeticException();
                case 4 -> throw new EmptyStackException();
                case 5 -> throw new NumberFormatException();
                case 6 -> System.exit(0);
                default -> System.out.println("You Enter a Wrong input Please Enter Valid number again");
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for NullPointerException");
        System.out.println("Press 2 for ArrayIndexOutOfBoundsException");
        System.out.println("Press 3 for ArithmeticException");
        System.out.println("Press 4 for EmptyStackException");
        System.out.println("Press 5 for NumberFormatException");
        System.out.println("Press 6 for Exit");
        int n = input.nextInt();
        while (true) {
            try {
                exception(n);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Press 1 for NullPointerException");
            System.out.println("Press 2 for ArrayIndexOutOfBoundsException");
            System.out.println("Press 3 for ArithmeticException");
            System.out.println("Press 4 for EmptyStackException");
            System.out.println("Press 5 for NumberFormatException");
            System.out.println("Press 6 for Exit");
            n = input.nextInt();

        }
    }
}
