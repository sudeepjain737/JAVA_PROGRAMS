package Practice_14;

public class MathOperations {
    public static void main(String[] args) {
        int n = args.length;
        int s = 0;
        int arr[] = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(args[i]);
                s = s + arr[i];
            }
            System.out.println("Sum of the array is: " + s);
            System.out.println("Average of the array is: " + s/n);
        }catch (ArithmeticException obj){
            System.out.println("ArithmeticException");
        }
        catch (NumberFormatException obj){
            System.out.println("NumberFormatException");
        }

    }
}
